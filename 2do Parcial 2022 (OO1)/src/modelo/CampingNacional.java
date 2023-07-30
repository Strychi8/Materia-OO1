package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CampingNacional {
	private List<Persona> lstPersonas;
	private List<Servicio> lstServicios;

	public CampingNacional() {
		this.lstPersonas = new ArrayList<Persona>();
		this.lstServicios = new ArrayList<Servicio>();
	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	public List<Servicio> getLstServicios() {
		return lstServicios;
	}

	public void setLstServicios(List<Servicio> lstServicios) {
		this.lstServicios = lstServicios;
	}

	@Override
	public String toString() {
		return "CampingNacional [lstPersonas=" + lstPersonas + ", lstServicios=" + lstServicios + "]";
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
	
	public boolean agregarPersona(String apellido, String nombre, long dni) throws Exception {
		int proxId = 1;
		if(traerPersona(dni) != null) {
			throw new Exception("ERROR: Ya existe una persona con ese dni");
		}
		if(lstPersonas.size() > 0) {
			proxId = lstPersonas.get(lstPersonas.size()-1).getIdPersona() + 1;
		}
		return lstPersonas.add(new Persona(proxId,apellido,nombre,dni));
	}
	
	public boolean agregarRecreo(String codIngreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
			int cantPersonas, double precioPersona) throws Exception {
		int proxId = 1;
		if(lstServicios.size() > 0) {
			proxId = lstServicios.get(lstServicios.size()-1).getIdServicio() + 1;
		}
		return lstServicios.add(new Recreo(proxId, codIngreso, fechaIngreso, checkOut, responsable, cantPersonas, precioPersona));
	}
	
	public boolean agregarCampamento(String codIngreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
			LocalDate fechaEgreso, int cantCarpas, double precioCarpa) throws Exception {
		int proxId = 1;
		if(lstServicios.size() > 0) {
			proxId = lstServicios.get(lstServicios.size()-1).getIdServicio() + 1;
		}
		return lstServicios.add(new Campamento(proxId,codIngreso,fechaIngreso,checkOut,responsable,fechaEgreso,cantCarpas,precioCarpa));
	}
	
	public List<Servicio> traerServiciosPorPrecioFinal(double mayorIgualA){
		List<Servicio> servicios = new ArrayList<Servicio>();
		
		for(int indice=0; indice<lstServicios.size(); indice++) {
			if(lstServicios.get(indice).calcularPrecioFinal() >= mayorIgualA && lstServicios.get(indice).isCheckOut() == true) {
			    servicios.add(lstServicios.get(indice));
			}
		}
		return servicios;
	}
	
	public List<Campamento> traerCampamentosPorDias(int mayorIgualA){
		List<Campamento> campamentos = new ArrayList<Campamento>();
		
		for(int indice=0; indice<lstServicios.size(); indice++) {
			if(lstServicios.get(indice) instanceof Campamento) {
				Campamento camp = (Campamento) lstServicios.get(indice);
				if(camp.cantidadDias() >= mayorIgualA) {
					campamentos.add(camp);
				}
			}
		}
		return campamentos;
		
	}
}
