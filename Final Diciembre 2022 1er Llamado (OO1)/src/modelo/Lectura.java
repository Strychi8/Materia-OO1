package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Lectura {
	private int id;
	private LocalDate fecha;
	private Cliente cliente;
	private int estadoMedidor;

	public Lectura(int id, LocalDate fecha, Cliente cliente, int estadoMedidor) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
		this.estadoMedidor = estadoMedidor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getEstadoMedidor() {
		return estadoMedidor;
	}

	public void setEstadoMedidor(int estadoMedidor) {
		this.estadoMedidor = estadoMedidor;
	}

	@Override
	public String toString() {
		return "Lectura [id=" + id + ", fecha=" + fecha + ", cliente=" + cliente + ", estadoMedidor=" + estadoMedidor
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lectura other = (Lectura) obj;
		return Objects.equals(cliente, other.cliente) && id == other.id;
	}
	
	public int calcularConsumo(Lectura lecturaAnterior) {
		return lecturaAnterior.getEstadoMedidor() - getEstadoMedidor();
	}
	
	

}
