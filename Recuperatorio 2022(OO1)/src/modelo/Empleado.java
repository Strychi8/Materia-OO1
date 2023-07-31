package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona {
	private int sueldoBase;

	public Empleado(int idPersona, String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) {
		super(idPersona, nombre, apellido, dni, fechaDeAlta);
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [" + super.toString() + ", sueldoBase=" + sueldoBase + "]";
	}
	
	public int antiguedadEnAnios() {
		int dias = 0;
		LocalDate fechaFin = LocalDate.now().plusMonths(1).withDayOfMonth(1);
		while(fechaFin.getDayOfWeek().getValue() > 5) {
			fechaFin = fechaFin.plusDays(1);
		}
		dias = Period.between(fechaDeAlta, fechaFin).getDays();
		
		return dias;
	}

}
