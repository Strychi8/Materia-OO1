package modelo;

import java.util.Objects;

public class Genero {
    private int idGenero;
    private String genero;
    
	public Genero(int idGenero, String genero) {
		this.idGenero = idGenero;
		this.genero = genero;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", genero=" + genero + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(genero, other.genero) && idGenero == other.idGenero;
	}
}
