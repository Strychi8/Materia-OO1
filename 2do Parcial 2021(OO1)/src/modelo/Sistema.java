package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Persona> lstPersonas;
	private List<Seguridad> lstSeguridad;

	public Sistema() {
		this.lstPersonas = new ArrayList<Persona>();
		this.lstSeguridad = new ArrayList<Seguridad>();
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public List<Seguridad> getLstSeguridad() {
		return lstSeguridad;
	}

	public void setLstSeguridad(List<Seguridad> lstSeguridad) {
		this.lstSeguridad = lstSeguridad;
	}

	@Override
	public String toString() {
		return "Sistema [lstPersonas=" + lstPersonas + ", lstSeguridad=" + lstSeguridad + "]";
	}

	public boolean agregarEmpleado(String apellido, String nombre, int dni, int nroLegajo) {
		int proxId = 1;
		if (lstPersonas.size() > 0) {
			proxId = lstPersonas.get(lstPersonas.size() - 1).getId() + 1;
		}
		return lstPersonas.add(new Empleado(proxId, apellido, nombre, dni, nroLegajo));
	}

	public boolean agregarVisita(String apellido, String nombre, int dni, String empresa) {
		int proxId = 1;
		if (lstPersonas.size() > 0) {
			proxId = lstPersonas.get(lstPersonas.size() - 1).getId() + 1;
		}
		return lstPersonas.add(new Visita(proxId, apellido, nombre, dni, empresa));
	}

	public Persona traerPersona(int id) {
		Persona persona = null;
		int indice = 0;
		while (persona == null && indice < lstPersonas.size()) {
			if (lstPersonas.get(indice).getId() == id) {
				persona = lstPersonas.get(indice);
			}
			indice++;
		}
		return persona;
	}

	public List<Seguridad> traerSeguridad(LocalDate fecha, Persona persona) {
		List<Seguridad> listaSeguridad = new ArrayList<Seguridad>();

		for (int indice = 0; indice < lstSeguridad.size(); indice++) {
			if (lstSeguridad.get(indice) instanceof Seguridad) {
				Seguridad seguridad = (Seguridad) lstSeguridad.get(indice);
				if (seguridad.getFecha().equals(fecha) && seguridad.getPersona().equals(persona)) {
					listaSeguridad.add(seguridad);
				}
			}
		}
		return listaSeguridad;
	}

	/*
	 * 5) + agregarSeguridad(LocalDate fecha, LocalTime hora, boolean entrada,
	 * Persona persona) : boolean
	 * Excepción: una persona no puede registrar dos
	 * veces la salida o la entrada 
	 * Reutilizando el CU4: Si la lista Seguridad no
	 * está vacía se debe verificar que el último objeto el valor del atributo
	 * entrada no sea igual al parámetro recibido. De suceder este escenario
	 * significa que la persona está intentando marcar dos veces la entrada o salida
	 */
	public boolean agregarSeguridad(LocalDate fecha, LocalTime hora, boolean entrada, Persona persona) throws Exception {
		List<Seguridad> auxList = traerSeguridad(fecha,persona);
		int indice=0;
		
		while(auxList != null && indice<auxList.size()) {
			if(auxList.get(auxList.size()-1).isEntrada() == entrada) {
	        	throw new Exception("ERROR: Una persona no puede registrar dos veces la salida o la entrada");
	           }
			  indice++;
		    }
		int proxId = 1;
		if(lstSeguridad.size()>0) {
			proxId = lstSeguridad.get(lstSeguridad.size() - 1).getId() + 1;
		}
		return lstSeguridad.add(new Seguridad(proxId, fecha, hora, entrada, persona));
	}

	public List<Seguridad> traerVisitas(LocalDate fecha) {
		List<Seguridad> listaSeguridad = new ArrayList<Seguridad>();

		for (Seguridad seguridad : lstSeguridad) {
			if (seguridad.getFecha().equals(fecha) && seguridad.getPersona() instanceof Visita) {
				listaSeguridad.add(seguridad);
			}
		}
		return listaSeguridad;
	}

}
