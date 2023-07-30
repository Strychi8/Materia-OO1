package modelo;

public class OperadorMovil {
	private int codigoMovil;
	private String companiaMovil;

	public OperadorMovil(int codigoMovil, String companiaMovil) {
		this.codigoMovil = codigoMovil;
		this.companiaMovil = companiaMovil;
	}

	public int getCodigoMovil() {
		return codigoMovil;
	}

	public void setCodigoMovil(int codigoMovil) {
		this.codigoMovil = codigoMovil;
	}

	public String getCompaniaMovil() {
		return companiaMovil;
	}

	public void setCompaniaMovil(String companiaMovil) {
		this.companiaMovil = companiaMovil;
	}

	@Override
	public String toString() {
		return "OperadorMovil [codigoMovil=" + codigoMovil + ", companiaMovil=" + companiaMovil + "]";
	}
    
}
