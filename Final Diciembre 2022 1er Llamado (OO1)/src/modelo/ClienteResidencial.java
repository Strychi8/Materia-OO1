package modelo;

public class ClienteResidencial extends Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	private int kWSubsidio;

	public ClienteResidencial(int id, long numeroCliente, String nombre, String apellido, int dni, int kWSubsidio) {
		super(id, numeroCliente);
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.kWSubsidio = kWSubsidio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getkWSubsidio() {
		return kWSubsidio;
	}

	public void setkWSubsidio(int kWSubsidio) {
		this.kWSubsidio = kWSubsidio;
	}

	@Override
	public String toString() {
		return "ClienteResidencial [" + super.toString() + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", kWSubsidio="
				+ kWSubsidio + "]";
	}

}
