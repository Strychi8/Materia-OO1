package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
	private int idTarjeta;
	private String codigo;
	private String codigoCliente;
	private List<Compra> compras;
     
	public Tarjeta() {
		this.compras = new ArrayList<Compra>();
	}
	public Tarjeta(int idTarjeta, String codigo, String codigoCliente) throws Exception {
		super();
		this.idTarjeta = idTarjeta;
		setCodigo(codigo);
		this.codigoCliente = codigoCliente;
		this.compras = new ArrayList<Compra>();
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) throws Exception {
		if(!validarCodigo(codigo)) {
			throw new Exception("Error: El codigo tiene que tener maximo 12 caracteres, con 6 letras y 6 numeros");
		}
	    this.codigo = codigo;
	}
	
	public boolean validarCodigo(String codigo) {
		int numeros = 0;
		int letras = 0;
		
		if(codigo.length() == 12) {
			for(int i=0; i<codigo.length(); i++) {
				if(Character.isDigit(codigo.charAt(i))) {
					numeros = numeros + 1;
				}
				if(Character.isLetter(codigo.charAt(i))) {
					letras = letras + 1;
				}
			}
		}
		
		return (numeros == 6 && letras == 6 && codigo.length() == 12);
		
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + idTarjeta + ", codigo=" + codigo + ", codigoCliente=" + codigoCliente
				+ ", compras=" + compras + "]";
	}
	
	public boolean agregarCompra(LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados,
			double puntosExtra) {
		int proxId = 1;
		if(compras.size()>0) {
			proxId = compras.get(compras.size()-1).getIdCompra()+1;
		}
		return compras.add(new Efectivo(proxId,fecha,hora,puntosPorLitro,litrosComprados,puntosExtra));
	}
	
	public boolean agregarCompra(LocalDate fecha, LocalTime hora, double puntosPorLitro, double litrosComprados,
			String medio, double puntosDeRegalo) {
		int proxId = 1;
		if(compras.size()>0) {
			proxId = compras.get(compras.size()-1).getIdCompra()+1;
		}
		return compras.add(new Electronica(proxId,fecha,hora,puntosPorLitro,litrosComprados,medio,puntosDeRegalo));
	}
	
	public double calcularPuntaje() {
		double total = 0;
		for(Compra compra: compras) {
			total = total + compra.calcularPuntajeFinal();
		}
		return total;
	}
	
	public double calcularPuntaje(LocalDate fecha) {
		double total = 0;
		for(Compra compra: compras) {
		   if(compra.getFecha().isEqual(fecha)) {
			total = total + compra.calcularPuntajeFinal();
		   }
		}
		return total;
	}
	
	public double calcularPuntaje(int anio,int mes) {
		double total = 0;
		
		for(Compra compra: compras) {
		   if(compra.getFecha().getYear() == anio && compra.getFecha().getMonthValue() == mes) {
			total = total + compra.calcularPuntajeFinal();
		   }
		}
		return total;
	}
	
	

}
