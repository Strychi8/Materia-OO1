package modelo;

import java.time.LocalDate;

public class PedidoPapelMensual extends Pedido {
	private LocalDate fechaEntrega;
	private int cantidadResmas;

	public PedidoPapelMensual(int idPedido, LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega,
			int cantidadResmas) throws Exception {
		super(idPedido, fechaCreacion, montoBase);
		this.fechaEntrega = fechaEntrega;
		setCantidadResmas(cantidadResmas);
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getCantidadResmas() {
		return cantidadResmas;
	}

	public void setCantidadResmas(int cantidadResmas) throws Exception {
		if(cantidadResmas <= 0) {
			throw new Exception("ERROR: La cantidad de Resmas no debe ser menor o igual a 0");
		}
		this.cantidadResmas = cantidadResmas;
	}

	@Override
	public String toString() {
		return "PedidoPapelMensual [fechaEntrega=" + fechaEntrega + ", cantidadResmas=" + cantidadResmas + 
				" "+ super.toString()+"]";
	}
    
	public double calcularPrecioFinal() {
		return montoBase * cantidadResmas;
	}
}
