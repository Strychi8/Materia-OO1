package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Cliente;
import modelo.Empleado;
import modelo.SistemaCallCenter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaCallCenter sistema = new SistemaCallCenter();

		System.out.println("1) Agregar los siguientes objetos a la lista:");
		try {
			System.out.println(sistema.agregarCliente("Luis", "Perez", 11111111, LocalDate.of(2020, 1, 1), true));
			System.out.println(sistema.agregarCliente("Lucas", "Pereyra", 22222222, LocalDate.of(2020, 2, 1), false));
            System.out.println(sistema.agregarEmpleado("Pedro", "Gomez", 33333333, LocalDate.of(2020, 2, 11), 10000));
			System.out.println(sistema.agregarEmpleado("Pablo", "Lopez", 44444444, LocalDate.of(2020, 3, 15), 9000));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(sistema.getLstPersonas());
		
		Cliente cliente = (Cliente) sistema.traerPersona(11111111);
		Empleado empleado = (Empleado) sistema.traerPersona(33333333);
		Cliente cliente1 = (Cliente) sistema.traerPersona(22222222);
		Empleado empleado1 = (Empleado) sistema.traerPersona(44444444);
		System.out.println("\n2) Agregar los siguientes llamados:");
		try {
			System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 6), LocalTime.of(10, 10), cliente, empleado, 5));
			System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 7), LocalTime.of(10, 10), cliente, empleado, 5));
			System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 7), LocalTime.of(10, 15), cliente1, empleado, 5));
			System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 7), LocalTime.of(10, 20), cliente, empleado1, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sistema.getLstLlamadas());
		
		System.out.println("\n3) Traer todos los clientes activos:");
		System.out.println(sistema.traerClientes(true));
		
		System.out.println("\n4) Traer a todas las personas con antiguedad de 2 anios:");
		System.out.println(sistema.traerPersonasAntiguedad(2)); //NO ESTA BIEN
		
		System.out.println("\n5) Traer llamadas:");
		System.out.println(sistema.traerLlamadas(LocalDate.of(2022, 11, 7), LocalTime.of(10, 10), LocalTime.of(10, 18)));
		
		System.out.println("\n6) Intentar agregar este Cliente:");
		try {
			System.out.println(sistema.agregarCliente("Marcos", "Rios", 22222222, LocalDate.of(2020, 2, 1), true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("\n7) Intentar agregar este Empleado:");
		try {
			System.out.println(sistema.agregarEmpleado("Miguel", "Martinez", 44444444, LocalDate.of(2020, 2, 1), 9500));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("\n8) Intentar agregar esta Llamada:");
		try {
			System.out.println(sistema.agregarLlamada(LocalDate.of(2022, 11, 7),LocalTime.of(10, 30),cliente,empleado,10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

	}

}
