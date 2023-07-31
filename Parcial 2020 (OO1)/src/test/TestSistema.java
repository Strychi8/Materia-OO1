package test;

import java.time.LocalDate;

import modelo.Sistema;

public class TestSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();
		System.out.println("1-1) Intentar crear el objeto Gastronomia");
		try {

			System.out.println(sistema.agregarGastronomia("3281", 22.0f, true, "Hamburguesa con fritas", 250.0d, 3));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println("\n1-2) Crear el objeto Gastronomia");
		try {

			System.out.println(sistema.agregarGastronomia("328142", 22.0f, true, "Hamburguesa con fritas", 250.0d, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		try {
			System.out.println("\n1-3) Intentar crear el objeto Hospedaje");
			System.out.println(sistema.agregarHospedaje("4271", 15d, true, "Cabaña 4 personas", 25000d));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		try {
			System.out.println("\n1-4) Crear el objeto Hospedaje");
			System.out.println(sistema.agregarHospedaje("427135", 15d, true, "Cabaña 4 personas", 25000d));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("\n2-1) Calcular e imprimir precio final del servicio:");
		System.out.println(sistema.traerServicio("328142").calcularPrecioFinal(LocalDate.of(2020, 10, 28)));
		
		System.out.println("\n2-2) Calcular e imprimir precio final del servicio:");
		System.out.println(sistema.traerServicio("427135").calcularPrecioFinal(LocalDate.of(2020, 10, 30)));
		
		System.out.println("\n3) Agregar los siguientes objetos e imprimir la lista de Servicios");
		try {
			System.out.println(sistema.agregarGastronomia("348397", 15d, true, "Milanesa con papas fritas", 420d, 2));
			System.out.println(sistema.agregarHospedaje("348789", 15d, true, "Habitacion simple", 1500d));
			System.out.println(sistema.agregarGastronomia("182835", 20d, false, "Gaseosa", 120d, 3));
			System.out.println(sistema.agregarHospedaje("438719", 10d, false, "Habitacion doble", 2500d));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println(sistema.toString());

		System.out.println("\n4-1) Traer todos los servios enPromocion = true");
		System.out.println(sistema.traerServicio(true));
		
	    System.out.println("\n4-2) Traer todos los servicios");
	    System.out.println(sistema.traerServicio(true, LocalDate.of(2020, 10, 28)));

	}

}
