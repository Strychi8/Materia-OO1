package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.SistemaSaludDispositivos;

public class TestTema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaSaludDispositivos sistema = new SistemaSaludDispositivos();

		System.out.println("1) Agregar Empresa");
		System.out.println(sistema.agregarEmpresa("Empresa 1"));
		System.out.println(sistema.agregarEmpresa("Empresa 2"));

		System.out.println("\n2) Traer Empresa");
		System.out.println(sistema.traerEmpresa("Empresa 2"));

		System.out.println("\n3) Agregar Dispositivo");
		try {
			System.out.println(sistema.agregarDispositivo("Sensor Humedad", "A2020", sistema.traerEmpresa("Empresa 1")));
			System.out.println(sistema.agregarDispositivo("Sensor Temperatura", "A2325", sistema.traerEmpresa("Empresa 1")));
			System.out.println(sistema.agregarDispositivo("Sensor Presion", "B2021", sistema.traerEmpresa("Empresa 2")));
			System.out.println(sistema.agregarDispositivo("Sensor Calor", "B2326", sistema.traerEmpresa("Empresa 2")));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println("\n4) Agregar Dispositivo Incorrecto");
		try {
			System.out.println(sistema.agregarDispositivo("Sensor Movimiento", "A2021", sistema.traerEmpresa("Empresa 1")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println("\n5) Traer Dispositivo");
		System.out.println(sistema.traerDispositivo("A2020"));

		System.out.println("\n6) Agregar Metrica");
		System.out.println(sistema.traerDispositivo("B2326").agregarMetrica(18, LocalDate.of(2022, 9, 18), LocalTime.of(10, 00)));
		System.out.println(sistema.traerDispositivo("B2326").agregarMetrica(19, LocalDate.of(2022, 9, 19), LocalTime.of(12, 30)));
		System.out.println(sistema.traerDispositivo("B2326").agregarMetrica(23, LocalDate.of(2022, 9, 20), LocalTime.of(15, 00)));
		System.out.println(sistema.traerDispositivo("B2326").agregarMetrica(20, LocalDate.of(2022, 9, 21), LocalTime.of(18, 30)));
		System.out.println(sistema.traerDispositivo("B2326").agregarMetrica(18, LocalDate.of(2022, 9, 22), LocalTime.of(22, 30)));

		System.out.println("\n7) Traer Metrica");
		System.out.println(sistema.traerDispositivo("B2326").traerMetrica(LocalDate.of(2022, 9, 19), LocalTime.of(12, 30)));
		
		System.out.println("\n8) Traer Metricas");
		System.out.println(sistema.traerDispositivo("B2326").traerMetricas(LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21)));
		
		System.out.println("\n9) Traer Metricas");
		System.out.println(sistema.traerMetricas(sistema.traerDispositivo("B2326"),LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21), 22));
         
	}

}