package modelo;

import java.util.Objects;

public class Cliente {
	protected int id;
	protected long numeroCliente;

	public Cliente(int id, long numeroCliente) {
		super();
		this.id = id;
		this.numeroCliente = numeroCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(long numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", numeroCliente=" + numeroCliente + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numeroCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id && numeroCliente == other.numeroCliente;
	}
	
	

}
