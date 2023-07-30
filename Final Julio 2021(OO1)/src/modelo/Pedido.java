package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Stock {
	private List<NotaPedido> notasPedidos;

	public Pedido(int idStock, Producto producto) {
		super(idStock, producto);
		this.notasPedidos = new ArrayList<NotaPedido>();
	}

	public List<NotaPedido> getNotasPedidos() {
		return notasPedidos;
	}

	public void setNotasPedidos(List<NotaPedido> notasPedidos) {
		this.notasPedidos = notasPedidos;
	}

	@Override
	public String toString() {
		return "Pedido [" + super.toString() + ", notasPedidos=" + notasPedidos + "]";
	}
	
	public boolean agregarNotaPedido(LocalDate fecha, int cantidad, String cliente) {
		return notasPedidos.add(new NotaPedido(fecha,cantidad,cliente));
	}

}
