package modelo;

import java.time.LocalDate;

public class Estadia extends Venta {
	private LocalDate checkIn;
	private int cantNoches;
	private int cantDePlazas;

	public Estadia(int idVenta, Pasajero pasajero, LocalDate fechaVenta, LocalDate checkIn, int cantNoches,
			int cantDePlazas) throws Exception {
		super(idVenta, pasajero, fechaVenta);
		setCheckIn(checkIn);
		this.cantNoches = cantNoches;
		this.cantDePlazas = cantDePlazas;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) throws Exception {
		if(checkIn.isBefore(fechaVenta)) {
			throw new Exception("ERROR: La fecha de checkIn es anterior a la fecha de venta");
		}
		this.checkIn = checkIn;
	}

	public int getCantNoches() {
		return cantNoches;
	}

	public void setCantNoches(int cantNoches) {
		this.cantNoches = cantNoches;
	}

	public int getCantDePlazas() {
		return cantDePlazas;
	}

	public void setCantDePlazas(int cantDePlazas) {
		this.cantDePlazas = cantDePlazas;
	}

	@Override
	public String toString() {
		return "Estadia [checkIn=" + checkIn + ", cantNoches=" + cantNoches + ", cantDePlazas=" + cantDePlazas + ","
				+ super.toString() + "]";
	}

}
