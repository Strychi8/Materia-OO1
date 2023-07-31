package modelo;

import java.time.LocalDate;

public class Interno extends Proyecto {
	private int creditos;

	public Interno(int id, LocalDate fechaInicio, int duracionEstimada, boolean finalizado, int creditos) {
		super(id, fechaInicio, duracionEstimada, finalizado);
		this.creditos = creditos;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Interno [" + super.toString() + ", creditos=" + creditos + "]";
	}

}
