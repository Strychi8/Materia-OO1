package modelo;

public class Estacion {
	private int id;
	private String nombre;
	private String direccion;
	private double latitud;
	private double longitud;
	private float altura;

	public Estacion(int id, String nombre, String direccion, double latitud, double longitud, float altura) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.altura = altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", altura=" + altura + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		return id == other.id;
	}
	
	public double distanciaConEstacion(Estacion estacion) {
		return Math.sqrt(Math.pow(estacion.getLatitud()-latitud, 2) + Math.pow(estacion.getLongitud()-longitud, 2))*100;
	}
	
	

}
