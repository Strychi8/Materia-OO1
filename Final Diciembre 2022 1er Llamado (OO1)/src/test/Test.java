package test;

import java.time.LocalDate;

import modelo.SistemaDistribuidora;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SistemaDistribuidora sistema = new SistemaDistribuidora();
        
        System.out.println("1) Agregar e imprimir a todos los clientes:");
        System.out.println(sistema.agregarCliente(4483979, "Perez", "Juan", 11111111, 500));
        System.out.println(sistema.agregarCliente(4971920, "Rodriguez", "Marcela", 22222222, 0));
        System.out.println(sistema.agregarCliente(7324211, 333333333, "UTT"));
        System.out.println(sistema.agregarCliente(7329827, 444444444, "Cooperativa El Grito Sagrado" ));
        System.out.println(sistema.getLstClientes());
        
        System.out.println("\n2) Agregar e imprimir las siguientes tarifas:");
        System.out.println(sistema.agregarTarifa(0, 50, 300.0f, 2.0f));
        System.out.println(sistema.agregarTarifa(51, 100, 350.0f, 2.1f));
        System.out.println(sistema.agregarTarifa(101, 200, 450f, 2.5f));
        System.out.println(sistema.agregarTarifa(201, 400, 500.0f, 3.0f));
        System.out.println(sistema.agregarTarifa(401, 2000, 1000.0f, 4.0f));
        System.out.println(sistema.getLstTarifas());
        
        System.out.println("\n3) Agregar e imprimir las siguientes lecturas de medidor:");
        System.out.println(sistema.agregarLectura(LocalDate.of(2021, 12, 25), sistema.traerCliente(4483979), 180));
        System.out.println(sistema.agregarLectura(LocalDate.of(2022, 1, 25), sistema.traerCliente(4483979), 255));
        System.out.println(sistema.agregarLectura(LocalDate.of(2021, 12, 25), sistema.traerCliente(4971920), 100));
        System.out.println(sistema.agregarLectura(LocalDate.of(2022, 1, 25), sistema.traerCliente(4971920), 165));
        
        System.out.println(sistema.agregarLectura(LocalDate.of(2021, 12, 25), sistema.traerCliente(7324211), 3526));
        System.out.println(sistema.agregarLectura(LocalDate.of(2022, 1, 25), sistema.traerCliente(7324211), 4385));
        System.out.println(sistema.agregarLectura(LocalDate.of(2021, 12, 25), sistema.traerCliente(7329827), 10862));
        System.out.println(sistema.agregarLectura(LocalDate.of(2022, 1, 25), sistema.traerCliente(7329827), 11981));
        System.out.println(sistema.getLstLecturas());
        
        System.out.println("\n4) Traer e imprimir:");
        System.out.println(sistema.traerLectura(1, 2022, sistema.traerCliente(4483979)));
        
        System.out.println("\n5) Traer e imprimir:");
        System.out.println(sistema.traerLectura(12, 2021, sistema.traerCliente(4483979)));
        
        System.out.println("\n6) Calcular e imprimir el consumo entre los objetos Lectura del test 4 y 5:");
        System.out.println(sistema.traerLectura(12, 2021, sistema.traerCliente(4483979)).calcularConsumo(sistema.traerLectura(1, 2022, sistema.traerCliente(4483979))));
        
        System.out.println("\n7) Traer e imprimir la tarifa para el consumo calculado en el test 6:");
        System.out.println(sistema.traerTarifa(75));
        
        System.out.println("\n8) Calcular e imprimir el total a cobrar al cliente:"); //No completo
	}

}
