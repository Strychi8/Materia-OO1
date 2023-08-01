package modelo;

import java.time.LocalDateTime;

public class Vuelo {
	private int idVuelo;
	private String vuelo;
	private LocalDateTime fechaHoraPartida;
	private LocalDateTime fechaHoraArribo;
	private int pesoMaximoEquipaje;

	public Vuelo(int idVuelo, String vuelo, LocalDateTime fechaHoraPartida, LocalDateTime fechaHoraArribo,
			int pesoMaximoEquipaje) throws Exception {
		this.idVuelo = idVuelo;
		this.vuelo = vuelo;
		setFechaHoraPartidaYArribo(fechaHoraPartida, fechaHoraArribo);
		this.pesoMaximoEquipaje = pesoMaximoEquipaje;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public LocalDateTime getFechaHoraPartida() {
		return fechaHoraPartida;
	}
 
	public void setFechaHoraPartida(LocalDateTime fechaHoraPartida){
		this.fechaHoraPartida = fechaHoraPartida;
	}

	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}

	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo){
		this.fechaHoraArribo = fechaHoraArribo;
	}
	
	public void setFechaHoraPartidaYArribo(LocalDateTime fechaHoraPartida, LocalDateTime fechaHoraArribo) throws Exception {
		if(fechaHoraArribo == null && LocalDateTime.now().isAfter(fechaHoraPartida)) {
			throw new Exception("ERROR: El vuelo no arribo, por lo tanto la fechaHora es anterior a la actual");
		}
		this.fechaHoraPartida = fechaHoraPartida;
		this.fechaHoraArribo = fechaHoraArribo;
	}

	public int getPesoMaximoEquipaje() {
		return pesoMaximoEquipaje;
	}

	public void setPesoMaximoEquipaje(int pesoMaximoEquipaje) {
		this.pesoMaximoEquipaje = pesoMaximoEquipaje;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", vuelo=" + vuelo + ", fechaHoraPartida=" + fechaHoraPartida
				+ ", fechaHoraArriba=" + fechaHoraArribo + ", pesoMaximoEquipaje=" + pesoMaximoEquipaje + "]\n";
	}

}
