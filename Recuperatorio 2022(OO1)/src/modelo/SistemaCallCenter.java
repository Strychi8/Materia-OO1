package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaCallCenter {
	private List<Llamada> lstLlamadas;
	private List<Persona> lstPersonas;

	public SistemaCallCenter() {
		super();
		this.lstLlamadas = new ArrayList<Llamada>();
		this.lstPersonas = new ArrayList<Persona>();
	}

	public List<Llamada> getLstLlamadas() {
		return lstLlamadas;
	}

	public void setLstLlamadas(List<Llamada> lstLlamadas) {
		this.lstLlamadas = lstLlamadas;
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	@Override
	public String toString() {
		return "SistemaCallCenter [lstLlamadas=" + lstLlamadas + ", lstPersonas=" + lstPersonas + "]";
	}
	
	public Persona traerPersona(long dni) {
		Persona persona = null;
		int indice = 0;
		while(persona == null && indice<lstPersonas.size()) {
			if(lstPersonas.get(indice).getDni() == dni) {
				persona = lstPersonas.get(indice);
			}
			indice++;
		}
		return persona;
	}
	
	public boolean agregarCliente(String nombre, String apellido, long dni, LocalDate fechaDeAlta, boolean activo) throws Exception {
		int proxId = 1;
		if(traerPersona(dni) != null) {
			throw new Exception("ERROR: Ya existe una persona con ese DNI");
		}
		if(lstPersonas.size()>0) {
			proxId = lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
		}
		return lstPersonas.add(new Cliente(proxId,nombre,apellido,dni,fechaDeAlta,activo));
	}
	
	public boolean agregarEmpleado(String nombre, String apellido, long dni, LocalDate fechaDeAlta, int sueldoBase) throws Exception {
		int proxId = 1;
		if(traerPersona(dni) != null) {
			throw new Exception("ERROR: Ya existe una persona con ese DNI");
		}
		if(lstPersonas.size()>0) {
			proxId = lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
		}
		return lstPersonas.add(new Empleado(proxId,nombre,apellido,dni,fechaDeAlta,sueldoBase));
	}
	
	public boolean agregarLlamada(LocalDate fecha, LocalTime hora, Cliente cliente, Empleado empleado, int nivelDeSatisfaccion) throws Exception {
		int proxId = 1;
		if(lstLlamadas.size()>0) {
			proxId = lstLlamadas.get(lstLlamadas.size()-1).getIdLlamada()+1;
		}
		return lstLlamadas.add(new Llamada(proxId,fecha,hora,cliente,empleado,nivelDeSatisfaccion));
	}
	
	public List<Cliente> traerClientes(boolean estadoCliente){
		List<Cliente> auxList = new ArrayList<Cliente>();
		
		for(int indice=0; indice<lstPersonas.size(); indice++) {
			if(lstPersonas.get(indice) instanceof Cliente) {
				Cliente cliente = (Cliente) lstPersonas.get(indice);
				if(cliente.isActivo() == estadoCliente) {
					auxList.add(cliente);
				}
			}
		}
		
		return auxList;
	}
	
	public List<Persona> traerPersonasAntiguedad(int mayorIgualA){
		List<Persona> auxList = new ArrayList<Persona>();
		
		for(int indice=0; indice<lstPersonas.size(); indice++) {
			if(lstPersonas.get(indice).antiguedadEnAnios() >= mayorIgualA) {
				auxList.add(lstPersonas.get(indice));
			}
		}
		return auxList;
	}
	
	public List<Llamada> traerLlamadas(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta){
		List<Llamada> auxList = new ArrayList<Llamada>();
		
		for(int i=0; i<lstLlamadas.size(); i++) {
			if(lstLlamadas.get(i).getFecha().isEqual(fecha) && (lstLlamadas.get(i).getHora().isAfter(horaDesde) ||
					lstLlamadas.get(i).getHora().equals(horaDesde))
					&& lstLlamadas.get(i).getHora().isBefore(horaHasta) || lstLlamadas.get(i).getHora().equals(horaHasta)) {
				auxList.add(lstLlamadas.get(i));
			}
		}
		
		return auxList;
	}

}
