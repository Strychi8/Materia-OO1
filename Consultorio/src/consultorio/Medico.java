package consultorio;

import java.util.Arrays;

public class Medico {
	// Atributos
	private String nombre;
	private String apellido;
	private String especialidad;
	private Paciente[] pacientesFrecuentes;

	public Medico(String nombre, String apellido, String especialidad, Paciente[] pacientesFrecuentes) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.pacientesFrecuentes = pacientesFrecuentes;
	}

	// Gets y Sets
    public String traerNombreCompleto() {
		return "Medico: " + nombre + " " + apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Paciente[] getPacientesFrecuentes() {
		return pacientesFrecuentes;
	}

	public void setPacientesFrecuentes(Paciente[] pacientesFrecuentes) {
		this.pacientesFrecuentes = pacientesFrecuentes;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ ", pacientesFrecuentes=" + Arrays.toString(pacientesFrecuentes) + "]";
	}

	public float calcularIMC(Paciente paciente) {
		float imc = paciente.getPeso() / (paciente.getEstatura() * paciente.getEstatura());
		return imc;
	}
    
    public double traerPromedioPeso() {
    	double sumarPeso = 0;
    	for(int i=0; i<pacientesFrecuentes.length; i++) {
    		sumarPeso = sumarPeso + pacientesFrecuentes[i].getPeso();
    	}
       return sumarPeso/pacientesFrecuentes.length;
       
    }
	public Paciente traerPacienteMayorEstatura() {
		Paciente pacienteMayorEstatura = pacientesFrecuentes[0];
		
		for(int i=0; i<pacientesFrecuentes.length; i++) {
			if(pacientesFrecuentes[i].getEstatura() > pacienteMayorEstatura.getEstatura()) {
				pacienteMayorEstatura = pacientesFrecuentes[i];
			}
		}
		return pacienteMayorEstatura;
	}
	public Paciente traerElMenorImc() {
	    Paciente pacienteMenorIMC = pacientesFrecuentes[0];
	    
	    for(int i=0; i<pacientesFrecuentes.length; i++) {
	    		if(calcularIMC(pacientesFrecuentes[i]) < calcularIMC(pacienteMenorIMC)) {
	    			pacienteMenorIMC = pacientesFrecuentes[i];
	    		}
	    }
	    return pacienteMenorIMC;
	    
	}
}
