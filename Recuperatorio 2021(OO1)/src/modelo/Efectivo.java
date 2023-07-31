package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Efectivo extends Compra {
	private double puntosExtra;

	public Efectivo(int idCompra, LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados,
			double puntosExtra) {
		super(idCompra, fecha, hora, puntosPorLitro, litrosComprados);
		this.puntosExtra = puntosExtra;
	}

	public double getPuntosExtra() {
		return puntosExtra;
	}

	public void setPuntosExtra(double puntosExtra) {
		this.puntosExtra = puntosExtra;
	}

	@Override
	public String toString() {
		return "Efectivo [" + super.toString() + ", puntosExtra=" + puntosExtra + "]";
	}
	
	public double calcularPuntajeFinal() {
		return (puntosExtra + puntosPorLitro) * litrosComprados;
	}

}
