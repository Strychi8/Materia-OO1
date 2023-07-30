package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();

		System.out.println("1) Agregar e imprimir todos los pasajeros");
		System.out.println(sistema.agregarPasajero(11111111, "Romero", "Sol"));
		System.out.println(sistema.agregarPasajero(22222222, "Martinez", "Julian"));
		System.out.println(sistema.getPasajeros());

		System.out.println("\n2) Intentar crear el objeto Estadia");
		try {
			System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 7), sistema.traerPasajero(2),LocalDate.of(2021, 4, 4), 3, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println("\n3) Agregar e imprimir la lista Ventas");
		try {
			System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 7), sistema.traerPasajero(2),LocalDate.of(2021, 4, 11), 3, 3));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(sistema.agregarSpa(LocalDate.of(2021, 4, 7), sistema.traerPasajero(2),LocalDate.of(2021, 4, 13), LocalTime.of(16, 10), 90));
		try {
			System.out.println(sistema.agregarEstadia(LocalDate.of(2021, 4, 8), sistema.traerPasajero(1),LocalDate.of(2021, 4, 12), 4, 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(sistema.agregarSpa(LocalDate.of(2021, 4, 8), sistema.traerPasajero(1),LocalDate.of(2021, 4, 13), LocalTime.of(15, 30), 45));
        System.out.println(sistema.getVentas());
		
		 System.out.println("\n4) Traer la estadia idVenta=2 (con todos los atributos) y la hora de salida del Spa"); 
		 System.out.println(sistema.traerVenta(2));
		

		System.out.println("\n5) Traer los objetos Spa activos dia=2021-04-13, hora=16:10");
		System.out.println(sistema.traerSpa(LocalDate.of(2021, 4, 13), LocalTime.of(16, 10)));
		
		System.out.println("\n6) Traer los objetos Spa activos dia=2021-04-13, hora=17:40");
        System.out.println(sistema.traerSpa(LocalDate.of(2021, 4, 13), LocalTime.of(17, 40)));
		
		
		
	}

}
