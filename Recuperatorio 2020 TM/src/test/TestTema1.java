package test;

import java.time.LocalDate;

import modelo.Sistema;

public class TestTema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();

		System.out.println("1-1) Crear y agregar a la lista el objeto PedidoPapelMensual:");
		try {
			System.out.println(
					sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 10), 1000, LocalDate.of(2020, 10, 15), 4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("1-2) Crear y agregar a la lista el objeto PedidoElectronico:");
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 11), 3000, "rotura PC", 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println(sistema);

		System.out.println("1-3) Intentar crear los siguientes objetos:");
		try {
			System.out.println(
					sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 11), 1000, LocalDate.of(2020, 10, 15), 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 12), 3000, "", 200));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		System.out.println("2-1) Traer e imprimir el precio final de los objetos Pedido con id 1 y 2");
		System.out.println(sistema.traerPedido(1).calcularPrecioFinal());
		System.out.println(sistema.traerPedido(2).calcularPrecioFinal());

		System.out.println("3) Agregar los siguientes objetos a la lista");
		try {
			System.out.println(
					sistema.agregarPedidoPapelMensual(LocalDate.of(2020, 10, 12), 1200, LocalDate.of(2020, 10, 16), 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

		try {
			System.out.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 14), 3000, "rotura PC", 200));
			System.out
					.println(sistema.agregarPedidoElectronico(LocalDate.of(2020, 10, 15), 3100, "rotura Monitor", 210));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema);

		// System.out.println(sistema.toString());
		System.out.println("\n4-1) Traer todos los objetos Pedidos con motivo=rotura PC");
		System.out.println(sistema.traerPedido("rotura PC"));

		System.out.println("\n4-2) Traer el total general a pagar de todos los pedidos del sistema");
		System.out.println(sistema.calcularTotalGeneral());

	}
}
