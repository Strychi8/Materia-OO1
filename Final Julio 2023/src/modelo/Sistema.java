package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Cliente> clientes;
	private List<Vuelo> vuelos;
	private List<Carga> cargas;

	public Sistema() {
		this.clientes = new ArrayList<Cliente>();
		this.vuelos = new ArrayList<Vuelo>();
		this.cargas = new ArrayList<Carga>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	@Override
	public String toString() {
		return "Sistema [clientes=" + clientes + ", vuelos=" + vuelos + ", cargas=" + cargas + "]";
	}
	
	public boolean agregarCliente(int idCliente, String nombre, String apellido, long dni) {
		return clientes.add(new Cliente(idCliente,nombre,apellido,dni));
	}
	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		int i = 0;
		while(cliente == null && i<clientes.size()) {
			if(clientes.get(i).getDni() == dni) {
				cliente = clientes.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public boolean agregarVuelo(String vuelo, LocalDateTime fechaHoraPartida, LocalDateTime fechaHoraArribo,
			int pesoMaximoEquipaje) throws Exception {
		int proxId = 1;
		if(vuelos.size() > 0) {
			proxId = vuelos.get(vuelos.size()-1).getIdVuelo()+1;
		}
		
		return vuelos.add(new Vuelo(proxId,vuelo,fechaHoraPartida,fechaHoraArribo,pesoMaximoEquipaje));
	}
	
	public Vuelo traerVuelo(String vuelo) {
		Vuelo v = null;
		int i = 0;
		
		while(v == null && i<vuelos.size()) {
			if(vuelos.get(i).getVuelo().equalsIgnoreCase(vuelo)) {
				v = vuelos.get(i);
			}
			i++;
		}
		
		return v;
	}
	
	public boolean agregarEquipaje(String aeropuertoOrigen, String aeropuertoDestino, int peso, Cliente cliente,
			Vuelo vuelo, boolean excedePeso) {
		int proxId = 1;
		if(cargas.size() > 0) {
			proxId = cargas.get(cargas.size()-1).getIdCarga()+1;
		}
		return cargas.add(new Equipaje(proxId, aeropuertoOrigen, aeropuertoDestino, peso, cliente, vuelo, excedePeso));
	}
	
	public boolean agregarEnvio(String aeropuertoOrigen, String aeropuertoDestino, int peso, Cliente cliente,
			Vuelo vuelo, String domicilioEntrega) {
		int proxId = 1;
		if(cargas.size() > 0) {
			proxId = cargas.get(cargas.size()-1).getIdCarga()+1;
		}
		return cargas.add(new Envio(proxId, aeropuertoOrigen, aeropuertoDestino, peso, cliente, vuelo, domicilioEntrega));
	}
	
	public List<Equipaje> traer(Vuelo vuelo, boolean excedePeso){
		List<Equipaje> lstEquipajes = new ArrayList<Equipaje>();
			
		for(int i=0; i<cargas.size(); i++) {
			if(cargas.get(i).getVuelo().equals(vuelo) && cargas.get(i) instanceof Equipaje) {
				Equipaje equipaje = (Equipaje) cargas.get(i);
				if(equipaje.isExcedePeso() == excedePeso) {
					lstEquipajes.add(equipaje);
				}
			}
		}
		
		return lstEquipajes;
	}
	

}
