package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaYPF {
	private List<Tarjeta> tarjetas;

	public SistemaYPF() {
		super();
		this.tarjetas = new ArrayList<Tarjeta>();
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString() {
		return "SistemaYPF [tarjetas=" + tarjetas + "]";
	}
	
	public Tarjeta traerTarjeta(String codigoCliente) {
		Tarjeta tarjeta = null;
		int indice = 0;
		while(tarjeta == null && indice<tarjetas.size()) {
			if(tarjetas.get(indice).getCodigoCliente().equalsIgnoreCase(codigoCliente)) {
				tarjeta = tarjetas.get(indice);
			}
			indice++;
		}
		return tarjeta;
	}
	
	public boolean agregarTarjeta(String codigo,String codigoCliente) throws Exception {
		int proxId = 1;
		if(tarjetas.size()>0) {
			proxId = tarjetas.get(tarjetas.size()-1).getIdTarjeta()+1;
		}
		return tarjetas.add(new Tarjeta(proxId,codigo,codigoCliente));
	}
	
	public List<Tarjeta> traerTarjetasComprasEfectivo(LocalDate fechaDesde, LocalDate fechaHasta){
		List<Tarjeta> auxLista = new ArrayList<Tarjeta>();
		boolean encontrado = false;
		int j = 0;
		
		for(int indice=0; indice<tarjetas.size(); indice++) {
			while(encontrado == false && j < tarjetas.get(indice).getCompras().size()) {
				if(tarjetas.get(indice).getCompras().get(j) instanceof Efectivo) {
					Efectivo efectivo = (Efectivo) tarjetas.get(indice).getCompras().get(j);
					if(efectivo.getFecha().isAfter(fechaDesde) && efectivo.getFecha().isBefore(fechaHasta)) {
						auxLista.add(tarjetas.get(indice));
						encontrado = true;
					  }
				    }
				  j++;
				}	
			}
		
		return auxLista;
	}
	
	

}
