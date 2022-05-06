package ar.com.educacionit.web.controllers;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticuloServiceImpl;

public class ArticulloController {

	public static void main(String[] args) {
		ArticulosService service = new ArticuloServiceImpl();
		try {
			Articulo articulo = service.getById(1L);
			System.out.println(articulo);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

}