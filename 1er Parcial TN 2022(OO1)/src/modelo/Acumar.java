package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Acumar {
	private List<Estacion> lstEstaciones;
	private List<Medicion> lstMediciones;

	public Acumar() {
		super();
		this.lstEstaciones = new ArrayList<Estacion>();
		this.lstMediciones = new ArrayList<Medicion>();
	}

	public List<Estacion> getLstEstaciones() {
		return lstEstaciones;
	}

	public void setLstEstaciones(List<Estacion> lstEstaciones) {
		this.lstEstaciones = lstEstaciones;
	}

	public List<Medicion> getLstMediciones() {
		return lstMediciones;
	}

	public void setLstMediciones(List<Medicion> lstMediciones) {
		this.lstMediciones = lstMediciones;
	}

	@Override
	public String toString() {
		return "Acumar [lstEstaciones=" + lstEstaciones + ", lstMediciones=" + lstMediciones + "]";
	}
	
	public Estacion traerEstacion(String nombre) {
		Estacion estacion = null;
		int indice = 0;
		while(estacion == null && indice<lstEstaciones.size()) {
			if(lstEstaciones.get(indice).getNombre().equalsIgnoreCase(nombre)) {
				estacion = lstEstaciones.get(indice);
			}
			indice++;
		}
		return estacion;
	}
	
	public boolean agregarEstacion(String nombre, String direccion, double latitud, double longitud, float altura) throws Exception {
		int proxId = 1;
		if(traerEstacion(nombre) != null) {
			throw new Exception("ERROR: Ya existe una Estacion con el mismo nombre");
		}
		if(lstEstaciones.size()>0) {
			proxId = lstEstaciones.get(lstEstaciones.size()-1).getId()+1;
		}
		return lstEstaciones.add(new Estacion(proxId,nombre,direccion,latitud,longitud,altura));
	}
	
	public boolean agregarMedicion(Estacion estacion, LocalDate fecha, LocalTime hora, float temperatura, float humedad,
			float vientoVel, String vientoDir, float precipitacion) {
		return lstMediciones.add(new Medicion(estacion,fecha,hora,temperatura,humedad,vientoVel,vientoDir,precipitacion));
	}
	
	public Medicion traerMedicion(Estacion estacion, LocalDate fecha, LocalTime hora) {
		Medicion medicion = null;
		int indice = 0;
		while(medicion == null && indice < lstMediciones.size()) {
			if(lstMediciones.get(indice).getEstacion().equals(estacion) && lstMediciones.get(indice).getFecha().equals(fecha)
					&& lstMediciones.get(indice).getHora().equals(hora)) {
				medicion = lstMediciones.get(indice);
			}
			indice++;
		}
		return medicion;
	}
	
	public List<Medicion> traerMediciones(Estacion estacion) {
		List<Medicion> auxLista = new ArrayList<Medicion>();
		
		for(int i=0; i<lstMediciones.size(); i++) {
			if(lstMediciones.get(i).getEstacion().equals(estacion)) {
				auxLista.add(traerMedicion(estacion,lstMediciones.get(i).getFecha(),lstMediciones.get(i).getHora()));
			}
		}
		return auxLista;
	}
	
	public float promedioTemperatura(Estacion estacion, LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) {
		float suma = 0;
	    int contador = 0;
		for(int i=0; i<lstMediciones.size(); i++) {
			if(lstMediciones.get(i).getEstacion().equals(estacion) && lstMediciones.get(i).getFecha().isEqual(fecha)
					&& lstMediciones.get(i).getHora().isAfter(horaDesde) && lstMediciones.get(i).getHora().isBefore(horaHasta)) {
				suma = suma + lstMediciones.get(i).getTemperatura();
				contador++;
			}
		}
		return suma/contador;
	}

}
