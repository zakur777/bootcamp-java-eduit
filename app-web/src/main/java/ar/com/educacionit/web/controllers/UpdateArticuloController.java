package ar.com.educacionit.web.controllers;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticuloServiceImpl;

public class UpdateArticuloController {

	public static void main(String[] args) throws ServiceException {
		
		ArticulosService articuloService = new ArticuloServiceImpl();

		Articulo art = articuloService.getByCodigo("med001");
		
		art.setPrecio(8500d);
		// art.setCodigo("0000003");
		
		articuloService.update(art);
	}

}
