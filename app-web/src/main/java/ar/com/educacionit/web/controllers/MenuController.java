package ar.com.educacionit.web.controllers;

import ar.com.educacionit.domain.Menu;
import ar.com.educacionit.services.MenuService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.MenuServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/controllers/menu")
public class MenuController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MenuService menuService = new MenuServiceImpl();
        try {
            List<Menu> menuList = menuService.findAll();
            List<Menu> menuFiltered = buildMenu(menuList);
            req.setAttribute("menu", menuFiltered);
            getServletContext().getRequestDispatcher("/menu.jsp").forward(req, resp);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        //super.doGet(req, resp);
    }

    private static List<Menu> buildMenu(List<Menu> listMenu) {

        Map<Long, Menu> mapRoot = new HashMap<>();

        for(Menu m : listMenu) {
            if(m.isRoot()) {
                mapRoot.put(m.getId(),m);
                //�los quito de la lista?
            }
        }

        for(Menu m : listMenu) {
            if(!m.isRoot()) {
                if(m.getIdMenuPadre() !=null && m.getId() !=0) {
                    Menu menuRoot = mapRoot.get(m.getIdMenuPadre());
                    if(menuRoot !=null ) {
                        menuRoot.getSubMenu().add(m);
                    }else {
                        addToParent(listMenu, m);
                    }
                }
            }
        }

        List<Menu> menuFiltrados = new ArrayList<>();
        menuFiltrados.addAll(mapRoot.values());
        return menuFiltrados;
    }

    public static boolean addToParent(List<Menu> listMenu, Menu m) {
        boolean exists = false;
        for(Menu aux: listMenu) {
            if(m.getIdMenuPadre().equals(aux.getId())) {
                aux.getSubMenu().add(m);
                exists = true;
                break;
            }
        }
        return exists;
    }
}
