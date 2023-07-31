package modelo;

import java.time.LocalDate;

public abstract class Servicio {
	protected String codServicio;
	protected double porcentajeDescuento;
	protected boolean enPromocion;

	public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) throws Exception {
		setCodServicio(codServicio);
		this.porcentajeDescuento = porcentajeDescuento;
		this.enPromocion = enPromocion;
	}

	public String getCodServicio() {
		return codServicio;
	}

	public void setCodServicio(String codServicio) throws Exception {
		validarCodigo(codServicio);
		this.codServicio = codServicio;
	}
	
	public boolean validarCodigo(String codServicio) throws Exception {
		if(codServicio.length() != 6) {
			throw new Exception("ERROR: La Longitud del Codigo debe ser igual a 6");
		}
		return true;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isEnPromocion() {
		return enPromocion;
	}

	public void setEnPromocion(boolean enPromocion) {
		this.enPromocion = enPromocion;
	}

	@Override
	public String toString() {
		return "Servicio [codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento
				+ ", enPromocion=" + enPromocion + "]";
	}

	public abstract double calcularPrecioFinal(LocalDate fecha);
}
