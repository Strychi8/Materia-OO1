package test;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;
import modelo.Genero;
import modelo.Incaa;

public class TestPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Vamos a llenar un ArrayList del tipo Pelicula, el
		// contenido de c/elemento es un String ");
		// inicializamos un objeto lista de tipo String
		List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		Incaa cineMark = new Incaa(listaPeliculas);
		Genero genero = new Genero(1, "Fantasia");
		Genero genero1 = new Genero(2, "Drama");
		Genero genero2 = new Genero(3, "Ciencia Ficcion");
		Genero genero3 = new Genero(4, "Bibliografia");

		// METODO AGREGAR
        System.out.println("1) Agregar e imprimir peliculas:");
		try {
			System.out.println(cineMark.agregarPelicula("ET", genero));
			System.out.println(cineMark.agregarPelicula("Matrix", genero2));
			System.out.println(cineMark.agregarPelicula("Scarface", genero1));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(cineMark.getCatalogo());

		// METODO TRAER
		System.out.println("\n2) Traer peliculas:");
		System.out.println("Metodo traerPelicula(ID): " + cineMark.traerPelicula(10));
		System.out.println("Metodo traerPelicula(Nombre): " + cineMark.traerPelicula("Scarface"));
		System.out.println("Metodo traerPelicula(Genero): " + cineMark.traerPelicula(genero1) + "\n");

		// METODO MODIFICAR
		System.out.println("\n3) Modificar peliculas:");
		try {
			cineMark.modificarPelicula(3, "Maradona", genero3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(cineMark.toString());
		
		// METODO ELIMINAR
		System.out.println("\n4) Eliminar peliculas:");
		try {
			System.out.println(cineMark.eliminarPelicula(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(cineMark.getCatalogo());

	}

}
