package test;

import java.time.LocalDate;

import modelo.Almacen;
import modelo.Pedido;
import modelo.SistemaCooperativa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SistemaCooperativa sistema = new SistemaCooperativa();
       
       System.out.println("1) Agregar los siguientes productos e imprimir la lista:");
       try {
		System.out.println(sistema.agregarProducto("1111111111", "producto 1", 100d));
		System.out.println(sistema.agregarProducto("2222222222", "producto 2", 200d));
		System.out.println(sistema.agregarProducto("3333333333", "producto 3", 300d));
		System.out.println(sistema.agregarProducto("4444444444", "producto 4", 400d));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
       
       System.out.println(sistema.getProductos());
       
       System.out.println("\n2) Tratar de agregar los siguiente productos:");
       try {
		System.out.println(sistema.agregarProducto("111", "producto 6", 300d));
		System.out.println(sistema.agregarProducto("222", "producto 7", 400d));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
       
       System.out.println("\n3) Agregar los siguientes productos:");
       System.out.println(sistema.agregarPedido(sistema.traerProducto("1111111111")));
       System.out.println(sistema.agregarPedido(sistema.traerProducto("2222222222")));
       System.out.println(sistema.getStocks());
       
       System.out.println("\n4) Agregar los siguientes productos:");
       System.out.println(sistema.agregarAlmacen(sistema.traerProducto("2222222222"), 100, 80));
       System.out.println(sistema.agregarAlmacen(sistema.traerProducto("3333333333"), 120, 100));
       System.out.println(sistema.agregarAlmacen(sistema.traerProducto("4444444444"), 220, 200));
       System.out.println(sistema.getStocks());
       
       System.out.println("\n5) Traer los diferentes stocks de Producto:");
       System.out.println(sistema.traerStock(sistema.traerProducto("2222222222")));
       
       System.out.println("\n6) Agregar las siguientes notas de pedido:");
       Pedido pedido = (Pedido) sistema.traerStock(1);
       System.out.println(pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 100, "cliente 1"));
       System.out.println(pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 120, "cliente 2"));
       System.out.println(pedido.agregarNotaPedido(LocalDate.of(2021, 7, 14), 150, "cliente 3"));
       System.out.println(sistema.traerStock(1).toString());
       
       System.out.println("\n7) Agregar los siguientes lotes:");
       Almacen almacen = (Almacen) sistema.traerStock(3);
       System.out.println(almacen.agregarLote(LocalDate.of(2021, 7, 14), 1000, 1000));
       System.out.println(almacen.agregarLote(LocalDate.of(2021, 7, 14), 1200, 1200));
       System.out.println(almacen.agregarLote(LocalDate.of(2021, 7, 14), 1500, 1500));
       System.out.println(sistema.traerStock(3).toString());
	}

}
