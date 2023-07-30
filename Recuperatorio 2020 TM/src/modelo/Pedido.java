package modelo;

import java.time.LocalDate;

public abstract class Pedido {
	protected int idPedido;
	protected LocalDate fechaCreacion;
	protected double montoBase;

	public Pedido(int idPedido, LocalDate fechaCreacion, double montoBase) {
		this.idPedido = idPedido;
		this.fechaCreacion = fechaCreacion;
		this.montoBase = montoBase;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public double getMontoBase() {
		return montoBase;
	}

	public void setMontoBase(double montoBase) {
		this.montoBase = montoBase;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaCreacion=" + fechaCreacion + ", montoBase=" + montoBase + "]";
	}
    
	public abstract double calcularPrecioFinal();
	
	
}
