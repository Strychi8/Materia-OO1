package modelo;

public class Programador {
	private int id;
	private String nombre;
	private String apellido;
	private String categoria;

	public Programador(int id, String nombre, String apellido, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Programador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria
				+ "]";
	}

}
