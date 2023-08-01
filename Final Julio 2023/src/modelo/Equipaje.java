package modelo;

public class Equipaje extends Carga{
    private boolean excedePeso;

	public Equipaje(int idCarga, String aeropuertoOrigen, String aeropuertoDestino, int peso, Cliente ciente,
			Vuelo vuelo, boolean excedePeso) {
		super(idCarga, aeropuertoOrigen, aeropuertoDestino, peso, ciente, vuelo);
		this.excedePeso = excedePeso;
	}

	public boolean isExcedePeso() {
		return excedePeso;
	}

	public void setExcedePeso(boolean excedePeso) {
		this.excedePeso = excedePeso;
	}

	@Override
	public String toString() {
		return "Equipaje [" + super.toString()   + ", excedePeso=" + excedePeso + "]";
	}
    
    
}
