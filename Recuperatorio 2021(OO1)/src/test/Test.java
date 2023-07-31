package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.SistemaYPF;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SistemaYPF sistema = new SistemaYPF();
		
        System.out.println("1) Intentar agregar las siguientes tarjetas:");
        try {
			System.out.println(sistema.agregarTarjeta("ABCDEFG123456", "DNI11222333"));
			System.out.println(sistema.agregarTarjeta("ABCDE1234567", "DNI11222333"));
			System.out.println(sistema.agregarTarjeta("ABCDEFG12345", "DNI11222333"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
        
		System.out.println("\n2) Agregar las siguientes tarjetas e imprimir la lista:");
		try {
			System.out.println(sistema.agregarTarjeta("ABCDEF123456", "DNI11222333"));
			System.out.println(sistema.agregarTarjeta("GHIJKL987654", "DNI44555666"));
			System.out.println(sistema.agregarTarjeta("MNOPQR456654", "DNI77888999"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		System.out.println(sistema);
		
		System.out.println("\n3.1) Traer la tarjeta:");
		System.out.println(sistema.traerTarjeta("DNI11222333").agregarCompra(LocalDate.of(2021, 9, 10), LocalTime.of(10, 30), 100, 25, 20));
		System.out.println(sistema.traerTarjeta("DNI11222333").agregarCompra(LocalDate.of(2021, 10, 1), LocalTime.of(20, 30), 200, 40, 50));
		System.out.println(sistema.traerTarjeta("DNI11222333").agregarCompra(LocalDate.of(2021, 9, 15), LocalTime.of(10, 30), 100, 30, "MODO",500));
		System.out.println(sistema.traerTarjeta("DNI11222333").agregarCompra(LocalDate.of(2021, 10, 1), LocalTime.of(20, 30), 200, 20, "MODO",500));
		
		System.out.println(sistema);
		
		System.out.println("\n3.2) Traer la tarjeta:");
		System.out.println(sistema.traerTarjeta("DNI44555666").agregarCompra(LocalDate.of(2021, 9, 11), LocalTime.of(15, 00), 100, 20, 20));
		
		System.out.println("\n3.3) Traer la tarjeta:");
		System.out.println(sistema.traerTarjeta("DNI44555666").agregarCompra(LocalDate.of(2021, 9, 16), LocalTime.of(15, 00), 100, 35, "MERCADO PAGO", 1000));
		
	    System.out.println("\n4) Imprimir el puntaje:");
	    System.out.println(sistema.traerTarjeta("DNI11222333").calcularPuntaje());
	    
	    System.out.println("\n5) Imprimir el puntaje:");
	    System.out.println(sistema.traerTarjeta("DNI11222333").calcularPuntaje(LocalDate.of(2021, 10, 1)));
	    
	    System.out.println("\n6) Imprimir el puntaje:");
	    System.out.println(sistema.traerTarjeta("DNI11222333").calcularPuntaje(2021,9));
	    
	    System.out.println("\n7) Traer e imprimir todas las tarjetas con compras en efectivo entre el 01/08/2021 y el 01/11/2021:");
		System.out.println(sistema.traerTarjetasComprasEfectivo(LocalDate.of(2021, 8, 1), LocalDate.of(2021, 11, 1))); //REGULAR
	}

}
