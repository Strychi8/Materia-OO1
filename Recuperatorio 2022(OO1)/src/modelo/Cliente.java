package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente extends Persona {
	private boolean activo;

	public Cliente(int idPersona, String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) {
		super(idPersona, nombre, apellido, dni, fechaDeAlta);
		this.activo = activo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Cliente [" + super.toString() + ", activo=" + activo + "]";
	}

	public int antiguedadEnAnios() {
       int dias = 0;
       if(activo) {
    	   dias = Period.between(fechaDeAlta, LocalDate.now()).getDays();
       }
       return dias;
	}

}
