package modelo;

import java.time.LocalDate;

public class Comercial extends Proyecto {
	private double valorHoraProgramador;

	public Comercial(int id, LocalDate fechaInicio, int duracionEstimada, boolean finalizado,
			double valorHoraProgramador) {
		super(id, fechaInicio, duracionEstimada, finalizado);
		this.valorHoraProgramador = valorHoraProgramador;
	}

	public double getValorHoraProgramador() {
		return valorHoraProgramador;
	}

	public void setValorHoraProgramador(double valorHoraProgramador) {
		this.valorHoraProgramador = valorHoraProgramador;
	}

	@Override
	public String toString() {
		return "Comercial [" + super.toString() + ", valorHoraProgramador=" + valorHoraProgramador + "]";
	}
	
   

}
