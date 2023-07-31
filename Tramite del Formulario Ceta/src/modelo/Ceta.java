package modelo;

import java.time.LocalDate;

public class Ceta {
	private int idCeta;
	private LocalDate fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;

	public Ceta(int idCeta, LocalDate fecha, Contribuyente vendedor, Contribuyente comprador,
			double valorDeTransferencia){
		this.idCeta = idCeta;
		try {
			setFecha(fecha);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			setVendedorYComprador(vendedor, comprador);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		this.valorDeTransferencia = valorDeTransferencia;
		firmaComprador = false;
	}

	public int getIdCeta() {
		return idCeta;
	}

	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) throws Exception {
		LocalDate hoy = LocalDate.now();
        if (fecha.isAfter(hoy)) {
        	throw new Exception("ERROR: Fecha no puede ser mayor al dia de hoy");
        }
		this.fecha = fecha;
	}

	public void setVendedorYComprador(Contribuyente vendedor, Contribuyente comprador) throws Exception {
		if (comprador.equals(vendedor)) {
			throw new Exception("ERROR: Comprador y Vendedor no pueden ser iguales");
		}
		setComprador(comprador);
		setVendedor(vendedor);	
	}

	public Contribuyente getVendedor() {
		return vendedor;
	}

	public void setVendedor(Contribuyente vendedor) {
		this.vendedor = vendedor;
	}

	public Contribuyente getComprador() {
		return comprador;
	}

	public void setComprador(Contribuyente comprador) {
		this.comprador = comprador;
	}

	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}

	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}

	public boolean isFirmaComprador() {
		return firmaComprador;
	}

	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}

	public boolean equals(Ceta ceta) {
		return (ceta.idCeta==idCeta);
	}

	@Override
	public String toString() {
		return "Ceta [idCeta=" + idCeta + ", fecha=" + fecha + ", vendedor=" + vendedor.getCuil() + ", comprador=" + comprador.getCuil()
				+ ", valorDeTransferencia=" + valorDeTransferencia + ", firmaComprador=" + firmaComprador + "]";
	}

}
