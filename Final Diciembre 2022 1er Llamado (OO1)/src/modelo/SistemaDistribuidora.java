package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaDistribuidora {
	private List<Tarifa> lstTarifas;
	private List<Lectura> lstLecturas;
	private List<Cliente> lstClientes;

	public SistemaDistribuidora() {
		super();
		this.lstTarifas = new ArrayList<Tarifa>();
		this.lstLecturas = new ArrayList<Lectura>();
		this.lstClientes = new ArrayList<Cliente>();
	}

	public List<Tarifa> getLstTarifas() {
		return lstTarifas;
	}

	public void setLstTarifas(List<Tarifa> lstTarifas) {
		this.lstTarifas = lstTarifas;
	}

	public List<Lectura> getLstLecturas() {
		return lstLecturas;
	}

	public void setLstLecturas(List<Lectura> lstLecturas) {
		this.lstLecturas = lstLecturas;
	}

	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	@Override
	public String toString() {
		return "SistemaDistribuidora [lstTarifas=" + lstTarifas + ", lstLecturas=" + lstLecturas + ", lstClientes="
				+ lstClientes + "]";
	}
	
	public boolean agregarCliente(long numeroCliente, String nombre, String apellido, int dni, int kWSubsidio) {
		int proxId = 1;
		if(lstClientes.size()>0) {
			proxId = lstClientes.get(lstClientes.size()-1).getId()+1;
		}
		return lstClientes.add(new ClienteResidencial(proxId,numeroCliente,nombre,apellido,dni,kWSubsidio));
	}
	
	public boolean agregarCliente(long numeroCliente, long cuit, String razonSocial) {
		int proxId = 1;
		if(lstClientes.size()>0) {
			proxId = lstClientes.get(lstClientes.size()-1).getId()+1;
		}
		return lstClientes.add(new ClienteCorporativo(proxId,numeroCliente,cuit,razonSocial));
	}
	
	public boolean agregarTarifa(int consumoDesde, int consumoHasta, float cargoFijo, float cargoVariable) {
		int proxId = 1;
		if(lstTarifas.size()>0) {
			proxId = lstTarifas.get(lstTarifas.size()-1).getId()+1;
		}
		return lstTarifas.add(new Tarifa(proxId,consumoDesde,consumoHasta,cargoFijo,cargoVariable));
	}
	
	public Cliente traerCliente(long numeroCliente) {
		Cliente cliente = null;
		int indice = 0;
		while(cliente == null && indice<lstClientes.size()) {
			if(lstClientes.get(indice).getNumeroCliente() == numeroCliente) {
				cliente = lstClientes.get(indice);
			}
			indice++;
		}
		return cliente;
	}
	
	public boolean agregarLectura(LocalDate fecha,Cliente cliente,int estadoMedidor) {
		int proxId = 1;
		if(lstLecturas.size()>0) {
			proxId = lstLecturas.get(lstLecturas.size()-1).getId()+1;
		}
		return lstLecturas.add(new Lectura(proxId,fecha,cliente,estadoMedidor));
	}
	
	public Lectura traerLectura(int mes, int anio, Cliente cliente) {
		Lectura lectura = null;
		int indice = 0;
		
		while(lectura == null && indice<lstLecturas.size()) {
			if(lstLecturas.get(indice).getFecha().getMonthValue() == mes && lstLecturas.get(indice).getFecha().getYear() == anio
					&& lstLecturas.get(indice).getCliente().equals(cliente)) {
				lectura = lstLecturas.get(indice);
			}
			indice++;
		}
		return lectura;
	}
	
	public Tarifa traerTarifa(int consumo) {
		Tarifa tarifa = null;
		int indice = 0;
		
		while(tarifa == null && indice<lstTarifas.size()) {
			if(lstTarifas.get(indice).getConsumoDesde() <= consumo && lstTarifas.get(indice).getConsumoHasta() >= consumo) {
				tarifa = lstTarifas.get(indice);
			}
			indice++;
		}
		
		return tarifa;
	}
	

}
