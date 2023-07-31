package test;

import java.time.LocalDate;
import java.time.LocalTime;

import negocio.Supermercado;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado coto = new Supermercado();

		// METODO AGREGAR
		System.out.println("1) Metodo Agregar(PRODUCTO):");
		try {
			System.out.println(coto.agregarProducto("Bananas", 500));
			System.out.println(coto.agregarProducto("Manzanas", 300));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmProducto());

		System.out.println("\n2) Metodo Traer Producto: ");
		System.out.println(coto.traerProducto(2));

		System.out.println("\n3) Metodo Agregar(CLIENTE):");
		try {
			System.out.println(coto.agregarCliente("Marcos Alonso", 42828997, "Andrade 783"));
			System.out.println(coto.agregarCliente("Juan Carlos", 43002032, "Cavour 232"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmCliente());

		System.out.println("\n4) Metodo Traer Cliente: ");
		System.out.println(coto.traerCliente(2));

		System.out.println("\n5) Metodo Agregar(CARRITO):");
		try {
			System.out.println(coto.agregarCarrito(LocalDate.of(2022, 4, 10), LocalTime.of(10, 24), coto.traerCliente(1)));
			System.out.println(coto.agregarCarrito(LocalDate.of(2022, 4, 10), LocalTime.of(10, 24), coto.traerCliente(2)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmCarrito());

		System.out.println("\n6) Metodo Agregar(ITEMS):");
		System.out.println(coto.traerCarrito(1).agregarItem(coto.traerProducto(1), 2));
		System.out.println(coto.traerCarrito(2).agregarItem(coto.traerProducto(2), 5));
		System.out.println(coto.getAdmCarrito());

		System.out.println("\n7) Metodo Traer Carrito:");
		System.out.println(coto.traerCarrito(2));
		System.out.println(coto.traerCarrito(1));

		// Calculables
		try {
			System.out.println("\n8) Total Cliente ----> " + coto.calcularTotal(coto.traerCliente(2)));
			System.out.println("8) Total Cliente ----> " + coto.calcularTotal(coto.traerCliente(1)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("\n9) Total Cliente DNI ----> " + coto.calcularTotal(42828997));
		System.out.println("\n9-1) Total Fecha Inicio y Fecha Fin ----> " + coto.calcularTotal(LocalDate.of(2022, 4, 10), LocalDate.of(2022, 4, 10)));
		System.out.println("\n9-2) Total Fecha  ----> " + coto.calcularTotal(LocalDate.of(2022, 4, 10)));
		try {
			System.out.println("\n9-3) Total Mes y Anio ----> " + coto.calcularTotal(4, 2022));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("\n9-4) Total Fecha Inicio, Fecha Fin y Cliente ----> " 
		    + coto.calcularTotal(LocalDate.of(2022, 4, 10), LocalDate.of(2022, 4, 10), coto.traerCliente("Juan Carlos")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("\n9-5) Total Fecha y Cliente ----> " + coto.calcularTotal(LocalDate.of(2022, 4, 10), coto.traerCliente("Juan Carlos")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("\n9-6) Total Mes,Anio y Cliente ----> "
					+ coto.calcularTotal(4, 2022, coto.traerCliente("Juan Carlos")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("\n9-7) Total Mes,Anio y Dni Cliente ----> " + coto.calcularTotal(4, 2022, 42828997));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		;
		// METODOS ELIMINAR
		System.out.println("\n10) Metodo Eliminar(ITEM):");
		try {
			System.out.println(coto.traerCarrito(1).eliminarItem(coto.traerProducto(1), 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.traerCarrito(1));

		System.out.println("\n11) Metodo Eliminar(PRODUCTO):");
		try {
			System.out.println(coto.eliminarProducto(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmProducto());

		System.out.println("\n12) Metodo Eliminar(CARRITO):");
		try {
			System.out.println(coto.eliminarCarrito(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmCarrito());

		System.out.println("\n13) Metodo Eliminar(CLIENTE):");
		try {
			System.out.println(coto.eliminarCliente(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(coto.getAdmCliente());

	}

}