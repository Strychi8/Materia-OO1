package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Servicio> lstServicio;

	public Sistema() {
		this.lstServicio = new ArrayList<Servicio>();
	}

	public List<Servicio> getLstServicio() {
		return lstServicio;
	}

	public void setLstServicio(List<Servicio> lstServicio) {
		this.lstServicio = lstServicio;
	}

	@Override
	public String toString() {
		return "Sistema [lstServicio=" + lstServicio + "]";
	}
    
	public Servicio traerServicio(String codServicio) {
		Servicio servicio = null;
		int indice=0;
		
		while(servicio == null && indice<lstServicio.size()) {
			if(lstServicio.get(indice).getCodServicio().equalsIgnoreCase(codServicio)) {
				servicio = lstServicio.get(indice);
			}
			indice++;
		}
		return servicio;
	}
	
	public List<Servicio> traerServicio(boolean enPromocion){
		List<Servicio> servicios = new ArrayList<Servicio>();
		
		for(int indice=0; indice<lstServicio.size(); indice++) {
			if(lstServicio.get(indice).isEnPromocion() == enPromocion){
				servicios.add(lstServicio.get(indice));
			}
		}
		return servicios;
	}
	
	//+ traerServicio (boolean enPromocion, LocalDate dia) : Servicio //retorna una lista de los servicios según la
	//fecha parámetros
	public List<Servicio> traerServicio(boolean enPromocion, LocalDate fecha){
	  List<Servicio> servicios = new ArrayList<Servicio>();
	  List<Servicio> auxList = traerServicio(enPromocion);
	
	  for(int indice=0; indice<auxList.size(); indice++) {
		 if(fecha.isEqual(fecha)){
			servicios.add(auxList.get(indice));
		 }
	  }
	    return servicios;
	
	}
	
	//+ agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String
	//gastronomia, double precio, int diaSemDesc) : boolean //implementar excepción si existe el objeto
	public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, 
			String gastronomia, double precio, int diaSemDesc) throws Exception {
		if(traerServicio(codServicio) != null) {
			throw new Exception("ERROR: El Codigo de Servicio ya existe");
		}
		return lstServicio.add(new Gastronomia(codServicio,porcentajeDescuento,enPromocion,gastronomia,precio,diaSemDesc));
	}
    
	//+ agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String
	//hospedaje,double precioPorNoche) : boolean //implementar excepción si existe el objeto
	public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion,
			String hospedaje, double precioPorNoche) throws Exception {
		if(traerServicio(codServicio) != null) {
			throw new Exception("ERROR: El Codigo de Servicio ya existe");
		}
		return lstServicio.add(new Hospedaje(codServicio,porcentajeDescuento,enPromocion,hospedaje,precioPorNoche));
	}

}
