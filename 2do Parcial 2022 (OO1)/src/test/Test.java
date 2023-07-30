package test;

import java.time.LocalDate;

import modelo.CampingNacional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CampingNacional sistema = new CampingNacional();
        
        System.out.println("1) Agregar e imprimir las siguientes personas:");
        try {
			System.out.println(sistema.agregarPersona("Lopez", "Sergio", 11111111));
			System.out.println(sistema.agregarPersona("Rodriguez", "Juan", 22222222));
			System.out.println(sistema.agregarPersona("Fernandez", "Maria", 33333333));
			System.out.println(sistema.agregarPersona("Vazquez", "Juan", 44444444));
			System.out.println(sistema.agregarPersona("Martinez", "Ana", 55555555));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        System.out.println(sistema.getLstPersonas());
        
        System.out.println("\n2) Agregar e imprimir los siguientes servicios:");
        try {
			System.out.println(sistema.agregarRecreo("7358902", LocalDate.of(2022, 9, 2), false, sistema.traerPersona(11111111), 5, 300));
			System.out.println(sistema.agregarCampamento("6573540", LocalDate.of(2022, 9, 3), false, sistema.traerPersona(22222222), null, 1, 1500));
	        System.out.println(sistema.agregarRecreo("3571398", LocalDate.of(2022, 9, 3), false, sistema.traerPersona(33333333), 10, 300));
	        System.out.println(sistema.agregarCampamento("2583941", LocalDate.of(2022, 9, 3), true, sistema.traerPersona(44444444), LocalDate.of(2022, 9, 8), 2, 1500));
	        System.out.println(sistema.agregarRecreo("5243925", LocalDate.of(2022, 9, 3), true, sistema.traerPersona(55555555), 8, 300));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
             
        System.out.println(sistema.getLstServicios());
        
        System.out.println("\n3) Traer e imprimir los Servicios con precio final mayor a 500 y que hayan finalizado su estadia:");
        System.out.println(sistema.traerServiciosPorPrecioFinal(1000));
        
        System.out.println("\n4) Traer e imprimir los Campamentos con mas de 4 dias en el predio:");
        System.out.println(sistema.traerCampamentosPorDias(4));
        
        System.out.println("\n5) Intentar agregar a la siguiente Persona que ya existe en la lista:");
        try {
			System.out.println(sistema.agregarPersona("Vazquez", "Juan", 44444444));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        System.out.println("\n6) Intentar agregar el siguiente servicio con codIngreso invalido:");
        try {
			System.out.println(sistema.agregarRecreo("3571394", LocalDate.of(2022, 9, 10), false, sistema.traerPersona(33333333), 5, 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        
	}
	

}
