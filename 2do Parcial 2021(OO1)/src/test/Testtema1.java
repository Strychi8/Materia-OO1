package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Sistema;

public class Testtema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sistema sistema = new Sistema();
       
       System.out.println("1) Agregar e imprimir las siguientes personas");
       System.out.println(sistema.agregarVisita("Martino", "Marcelo", 44444444, "Coop TIC"));
       System.out.println(sistema.agregarEmpleado("Lopez", "Martin", 33333333, 3829));
       System.out.println(sistema.agregarVisita("Molina", "Rocio", 22222222, "UNLa"));
       System.out.println(sistema.agregarVisita("Martino", "Marcelo", 44444444, "Coop TIC"));
       System.out.println(sistema.agregarEmpleado("Rodriguez", "Lucia", 11111111, 3840));
       System.out.println(sistema.getLstPersonas());
       
       System.out.println("\n2) Traer e imprimir Persona id=1");
       System.out.println(sistema.traerPersona(1));
       
       System.out.println("\n3) Agregar e imprimir los siguientes objetos Seguridad");
       try {
		System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 1), LocalTime.of(7, 50), true, sistema.traerPersona(1)));
		   System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 1), LocalTime.of(8, 00), true, sistema.traerPersona(2)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 1), LocalTime.of(18, 10), false, sistema.traerPersona(1)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 1), LocalTime.of(18, 20), false, sistema.traerPersona(2)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 2), LocalTime.of(9, 00), true, sistema.traerPersona(3)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 2), LocalTime.of(9, 10), true, sistema.traerPersona(4)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 2), LocalTime.of(18, 10), false, sistema.traerPersona(3)));
	       System.out.println(sistema.agregarSeguridad(LocalDate.of(2021, 9, 2), LocalTime.of(18, 20), false, sistema.traerPersona(4)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
       
       System.out.println(sistema.getLstSeguridad());
    
       
       System.out.println("\n4) Traer e imprimir objetos Seguridad para persona id=3 y fecha=2021-09-02");
       System.out.println(sistema.traerSeguridad(LocalDate.of(2021, 9, 2), sistema.traerPersona(3)));
       
       System.out.println("\n5) Traer todos los objetos Seguridad de las visitas fecha=2021-09-02");
       System.out.println(sistema.traerVisitas(LocalDate.of(2021, 9, 2)));
       
      
	}

}
