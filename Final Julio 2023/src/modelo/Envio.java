package modelo;

public class Envio extends Carga{
    private String domicilioEntrega;

	public Envio(int idCarga, String aeropuertoOrigen, String aeropuertoDestino, int peso, Cliente ciente, Vuelo vuelo,
			String domicilioEntrega) {
		super(idCarga, aeropuertoOrigen, aeropuertoDestino, peso, ciente, vuelo);
		this.domicilioEntrega = domicilioEntrega;
	}

	public String getDomicilioEntrega() {
		return domicilioEntrega;
	}

	public void setDomicilioEntrega(String domicilioEntrega) {
		this.domicilioEntrega = domicilioEntrega;
	}

	@Override
	public String toString() {
		return "Envio [" + super.toString() + ", domicilioEntrega=" + domicilioEntrega + "]";
	}
    
	
    
}
