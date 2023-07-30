package modelo;

import java.time.LocalDate;

public class Empleado extends Persona{
	private long legajo;
     private long sueldoMensual;
	
     public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			long sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo = legajo;
		this.sueldoMensual = sueldoMensual;
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public long getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(long sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
     
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", sueldoMensual= " + sueldoMensual + ", nombre= " + getNombre() 
		+ ", apellido= " + getApellido() + ", dni= " + getDni() + ", fecha de nacimiento= " + getFechaNacimiento() + "]" ;
	}

	public float calcularSueldo(int diasAusente){
		float resultado = 0;
		if(diasAusente >= 5) {
			resultado = sueldoMensual - sueldoMensual;
		}
		if(diasAusente >= 1 && diasAusente < 5) {
			resultado = sueldoMensual - 30000;
		}
		return resultado;
	}
	
	public String hablar(){
		return "Soy un Empleado";
		}

}
