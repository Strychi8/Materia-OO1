package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Pasajero> pasajeros;
	private List<Venta> ventas;

	public Sistema() {
		this.pasajeros = new ArrayList<Pasajero>();
		this.ventas = new ArrayList<Venta>();
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Sistema [pasajeros=" + pasajeros + ", ventas=" + ventas + "]";
	}
	
	public boolean agregarPasajero(int dni,String apellido,String nombre) {
		int proxId = 1;
		if(pasajeros.size() > 0) {
			proxId = pasajeros.get(pasajeros.size()-1).getIdPasajero()+1;
		}
		return pasajeros.add(new Pasajero(proxId,apellido,nombre,dni));
	}
	
	public Pasajero traerPasajero(int idPasajero) {
		Pasajero pasajero = null;
		int indice = 0;
		while(pasajero == null && indice<pasajeros.size()) {
			if(pasajeros.get(indice).getIdPasajero() == idPasajero) {
				pasajero = pasajeros.get(indice);
			}
			indice++;
		}
		return pasajero;
	}
	
	public boolean agregarEstadia(LocalDate fechaVenta,Pasajero pasajero,LocalDate checkIn,int cantNoches,int cantPlazas) throws Exception {
		int proxId = 1;
		if(ventas.size() > 0) {
			proxId = ventas.get(ventas.size()-1).getIdVenta()+1;
		}
		return ventas.add(new Estadia(proxId,pasajero,fechaVenta,checkIn,cantNoches,cantPlazas));
	}
	
	public boolean agregarSpa(LocalDate fechaVenta,Pasajero pasajero,LocalDate fecha,LocalTime hora,int minutos) {
		int proxId = 1;
		if(ventas.size() > 0) {
			proxId = ventas.get(ventas.size()-1).getIdVenta()+1;
		}
		return ventas.add(new Spa(proxId,pasajero,fechaVenta,fecha,hora,minutos));
	}
	 //con todos sus atributos
	public Venta traerVenta(int idVenta) {
		Venta venta = null;
	    int indice = 0;
		while(venta == null && indice<ventas.size()) {
			if(ventas.get(indice).getIdVenta() == idVenta) {
				venta = ventas.get(indice);
			}
			indice++;
		}
		return venta;
	}
	/*
   + List<Spa> traerSpa(LocalDate dia, LocalTime hora) // trae todos los objetos Spa que se
   encuentran activas (se encuentran en el Spa) para ese día y la hora se encuentra entre hora
    entrada y salida al spa inclusive
    */
	public List<Spa> traerSpa(LocalDate fecha,LocalTime hora){
		List<Spa> listaSpa = new ArrayList<Spa>();
		
		for(int indice=0; indice<ventas.size(); indice++) {
			if(ventas.get(indice) instanceof Spa) {
				Spa spa = (Spa) ventas.get(indice);
				if(spa.getFecha().equals(fecha) && spa.getHora().equals(hora)) {
					listaSpa.add(spa);
				}
			}
		}
		return listaSpa;
	}

}
