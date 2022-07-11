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
import java.util.Collection;
import java.util.List;

@WebServlet("/controllers/menu")
public class MenuController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MenuService menuService = new MenuServiceImpl();
        try {
            Collection<Menu> menuList = menuService.findAll();
            req.setAttribute("menu", menuList);
            getServletContext().getRequestDispatcher("/menu.jsp").forward(req, resp);
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
        //super.doGet(req, resp);
    }
}
