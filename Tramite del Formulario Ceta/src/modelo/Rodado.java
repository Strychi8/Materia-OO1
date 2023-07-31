package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rodado {
	private int idRodado;
	private String dominio;
	private String modelo;
	private String marca;

	public Rodado(int idRodado, String dominio, String modelo, String marca) throws Exception{
		this.idRodado = idRodado;
		setDominio(dominio);
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getIdRodado() {
		return idRodado;
	}

	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) throws Exception {
	  try {
		if(validarDominio(dominio)) {
			this.dominio = dominio;
		}
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
		
	}

	public boolean validarDominio(String dominio) throws Exception {
        Pattern patronNuevo = Pattern.compile("[A-Z]{2}-[0-9]{6}-[A-Z]{2}"); // Formato de la patente, 2 letras y 6 números y 2 letras
        Pattern patronViejo = Pattern.compile("[A-Z]{3}-[0-9]{3}"); // Formato de la patente, 3 letras y 3 numeros
		Matcher m = patronNuevo.matcher(dominio);
		Matcher m1 = patronViejo.matcher(dominio);
		
		if (!m.matches()) {
			if(!m1.matches()) {
				throw new Exception("ERROR: Patente no Valida");
			}
		}

		return true;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Rodado [id=" + idRodado + ", dominio=" + dominio + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	public boolean equals(Rodado rodado) {
		return (rodado.getDominio().equals(dominio));
	}

}
