package modelo;

import java.time.LocalDate;

public abstract class Venta {
	protected int idVenta;
	protected Pasajero pasajero;
	protected LocalDate fechaVenta;

	public Venta(int idVenta, Pasajero pasajero, LocalDate fechaVenta) {
		this.idVenta = idVenta;
		this.pasajero = pasajero;
		this.fechaVenta = fechaVenta;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public LocalDate getFecha() {
		return fechaVenta;
	}

	public void setFecha(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", pasajero=" + pasajero + ", fecha=" + fechaVenta + "]";
	}


}
