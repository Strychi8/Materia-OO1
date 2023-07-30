package modelo;

import java.time.LocalDate;

public class PedidoElectronico extends Pedido {
	private String motivo;
	private double porcentajeExtra;

	public PedidoElectronico(int idPedido, LocalDate fechaCreacion, double montoBase, String motivo,
			double porcentajeExtra) throws Exception {
		super(idPedido, fechaCreacion, montoBase);
		setMotivo(motivo);
		this.porcentajeExtra = porcentajeExtra;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) throws Exception {
		if(motivo.equalsIgnoreCase("")) {
    		throw new Exception("ERROR: El motivo esta Vacio");
    	}
		this.motivo = motivo;
	}

	public double getPorcentajeExtra() {
		return porcentajeExtra;
	}

	public void setPorcentajeExtra(double porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}

	@Override
	public String toString() {
		return "PedidoElectronico [motivo=" + motivo + ", porcentajeExtra=" + porcentajeExtra + 
				" "+ super.toString()+"]";
	}
	
	public double calcularPrecioFinal() {
		return (montoBase * porcentajeExtra)/100;
	}
    
	
	
}
