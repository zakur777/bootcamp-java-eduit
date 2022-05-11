package ar.com.educacionit.web.controllers;

import java.util.Scanner;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticuloServiceImpl;

public class CrearArticuloController {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del articulo");
		
		//leer los datos del articulo
		System.out.println("Precio:");
		Double precio = teclado.nextDouble();
		
		System.out.println("Titulo:");
		String titulo = teclado.next();
		
		System.out.println("Codigo:");
		String codigo = teclado.next();
		
		System.out.println("Stock:");
		Long stock = teclado.nextLong();
		
		System.out.println("Marca:");
		Long categoriaId = teclado.nextLong();
		
		System.out.println("Marca:");
		Long marcasId = teclado.nextLong();
		
		//verificar si existen marca y categoria
		// TODO: implementar dao y service para categoria
		
		teclado.close();
		
		Articulo nuevo = new Articulo(titulo, codigo, null, precio, stock, marcasId, categoriaId);
		
		//insertarlo en la db
		
		ArticulosService articulosService = new ArticuloServiceImpl();
		
		try {
			articulosService.createArticulo(nuevo);
		} catch (ServiceException e) {
			System.err.println(e.getMessage() + ", " + e.getCause().getMessage());
		}
	}

}
