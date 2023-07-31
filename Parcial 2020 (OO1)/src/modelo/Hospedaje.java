package modelo;

import java.time.LocalDate;

public class Hospedaje extends Servicio {
	private String hospedaje;
	private double precioPorNoche;

	public Hospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje,
			double precioPorNoche) throws Exception {
		super(codServicio, porcentajeDescuento, enPromocion);
		this.hospedaje = hospedaje;
		this.precioPorNoche = precioPorNoche;
	}

	public String getHospedaje() {
		return hospedaje;
	}

	public void setHospedaje(String hospedaje) {
		this.hospedaje = hospedaje;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	@Override
	public String toString() {
		return "Hospedaje [hospedaje=" + hospedaje + ", precioPorNoche=" + precioPorNoche + "]";
	}
	
	public double calcularPrecioFinal(LocalDate fecha) {
		int diaHabil = fecha.getDayOfWeek().getValue();
		if(isEnPromocion() == true && diaHabil >= 1 && diaHabil <= 5) {
			return precioPorNoche/porcentajeDescuento;
		}
		return precioPorNoche;
	}

}
