package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import modelo.Carrito;
import modelo.Cliente;
import modelo.Producto;
import modelo.Supermercado;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList<Producto>();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Carrito> listaCarritos = new ArrayList<Carrito>();
		Supermercado miGondola = new Supermercado(listaProductos, listaClientes, listaCarritos);
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();

		//METODO AGREGAR
		System.out.println("1) Metodo Agregar(PRODUCTO):");
		try {
			System.out.println(miGondola.agregarProducto("Cerveza", 500));
			System.out.println(miGondola.agregarProducto("Toalla", 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getGondola());
		
		//METODO MODIFICAR
		System.out.println("\n2) Metodo Modificar:");
		try {
			System.out.println(miGondola.modificarProducto(1, "Manzanas", 400));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getGondola());
		
		//METODO AGREGAR
		System.out.println("\n3) Metodo Agregar(CLIENTE):");
		try {
			System.out.println(miGondola.agregarCliente("Juan Carlos", 34567342, "Miguel Cane 400"));
			System.out.println(miGondola.agregarCliente("Matias Velez", 45000002, "Remedios de Escalada 234"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getCliente());
		
		//METODO AGREGAR
		System.out.println("\n4) Metodo Agregar(CARRITO):");
		try {
			System.out.println(miGondola.agregarCarrito(date, time, miGondola.traerCliente(1)));
			System.out.println(miGondola.agregarCarrito(date, time, miGondola.traerCliente(2)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getCarrito());
		
		//METODO AGREGAR
		System.out.println("\n5) Metodo Agregar(ITEMS):");
		System.out.println(miGondola.traerCarrito(1).agregarItem(miGondola.traerProducto(1), 2));
		System.out.println(miGondola.traerCarrito(2).agregarItem(miGondola.traerProducto(2), 2));
        System.out.println(miGondola.getCarrito());
        
		// METODOS TRAER
        System.out.println("\n6) Traer Producto por ID:");
		System.out.println(miGondola.traerProducto(2));
		System.out.println("\n7) Traer Cliente por ID:");
		System.out.println(miGondola.traerCliente(2));
		System.out.println("\n8) Traer Carrito por ID:");
		System.out.println(miGondola.traerCarrito(2));
		System.out.println("\n9) Traer Item por ID:");
		System.out.println(miGondola.traerCarrito(2).traerItem(1));
		
		// CALCULABLES
		System.out.println("\n9-1) Calcular total:");
		System.out.println("El total es ----> " + miGondola.traerCarrito(1).calcularTotal());

		// METODOS ELIMINAR
        System.out.println("\n10) Eliminar Item:");
		try {
			System.out.println(miGondola.traerCarrito(1).eliminarItem(miGondola.traerProducto(1), 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.traerCarrito(1));
		
		System.out.println("\n11) Eliminar Producto:");
		try {
			System.out.println(miGondola.eliminarProducto(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getGondola());
		
		System.out.println("\n12) Eliminar Carrito:");
		try {
			System.out.println(miGondola.eliminarCarrito(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(miGondola.getCarrito());
        
		System.out.println("\n13) Eliminar Cliente:");
		try {
			System.out.println(miGondola.eliminarCliente(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()); 
		}
		System.out.println(miGondola.getCliente());
		

	}

}
