package test;

import java.time.LocalDateTime;

import modelo.Sistema;

public class TestOO1_Tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();
		
        System.out.println("1) Agregar e imprimir los clientes:");
        System.out.println(sistema.agregarCliente(1, "Jorge", "Newbery", 12345678));
        System.out.println(sistema.agregarCliente(2, "Teodoro", "Fells", 12569874));
        System.out.println(sistema.agregarCliente(3, "Bartolome", "Catanio", 13456987));
        System.out.println(sistema.agregarCliente(4, "Raul", "Goubat", 11321654));
        System.out.println(sistema.agregarCliente(5, "Alfedo", "Agneta", 13987523));
        System.out.println(sistema.getClientes());
        
        System.out.println("\n2) Traer e impimir cliente dni=12569874:");
        System.out.println(sistema.traerCliente(12569874));
        
        System.out.println("\n3) Agregar e imprimir los vuelos:");
        try {
			System.out.println(sistema.agregarVuelo("AR2234", LocalDateTime.of(2023, 6, 25, 22, 20), LocalDateTime.of(2023, 6, 26, 00, 00), 10));
			System.out.println(sistema.agregarVuelo("AR6678", LocalDateTime.of(2023, 6, 25, 22, 40), LocalDateTime.of(2023, 6, 23, 23, 59), 15));
			System.out.println(sistema.agregarVuelo("AR2356", LocalDateTime.of(2023, 8, 30, 15, 42), null, 12));
			System.out.println(sistema.agregarVuelo("AR4234", LocalDateTime.of(2023, 6, 26, 21, 20), LocalDateTime.of(2023, 6, 27, 00, 00), 10));
			System.out.println(sistema.agregarVuelo("AR9678", LocalDateTime.of(2023, 6, 26, 21, 41), LocalDateTime.of(2023, 6, 27, 23, 59), 15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        System.out.println(sistema.getVuelos());
        
        System.out.println("\n4) Traer e imprimir vuelo=AR2234:");
        System.out.println(sistema.traerVuelo("AR2234"));
        
        System.out.println("\n5) Intentar agregar vuelo:");
        try {
			System.out.println(sistema.agregarVuelo("AR2435", LocalDateTime.of(2023, 5, 27, 15, 20), null, 15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        System.out.println("\n6) Agregar las siguientes cargas e imprimir:");
        System.out.println(sistema.agregarEnvio("AEP", "COR", 15, sistema.traerCliente(13987523), sistema.traerVuelo("AR2234"), "Saenz 2222 Buenos Aires"));
        System.out.println(sistema.agregarEquipaje("AEP", "JUJ", 10, sistema.traerCliente(13456987), sistema.traerVuelo("AR2234"), true));
        System.out.println(sistema.agregarEnvio("AEP", "COR", 15, sistema.traerCliente(11321654), sistema.traerVuelo("AR2234"), "Cabildo 342 Avellaneda"));
        System.out.println(sistema.agregarEquipaje("AEP", "JUJ", 30, sistema.traerCliente(12569874), sistema.traerVuelo("AR6678"), false));
        System.out.println(sistema.agregarEnvio("AEP", "COR", 52, sistema.traerCliente(12569874), sistema.traerVuelo("AR6678"), "Colombres 596 Lomas de Zamora"));
        System.out.println(sistema.agregarEquipaje("AEP", "COR", 15, sistema.traerCliente(12345678), sistema.traerVuelo("AR6678"), true));
        System.out.println(sistema.getCargas());
        
        System.out.println("\n7) Traer e imprimir equipajes del vuelo=AR2234, excedidos de peso:");
        System.out.println(sistema.traer(sistema.traerVuelo("AR2234"), true));
        
	}

}
