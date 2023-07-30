package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaSaludDispositivos {
	private List<Empresa> lstEmpresas;
	private List<Dispositivo> lstDispositivos;

	public SistemaSaludDispositivos() {
		this.lstEmpresas = new ArrayList<Empresa>();
		this.lstDispositivos = new ArrayList<Dispositivo>();
	}

	public List<Empresa> getLstEmpresas() {
		return lstEmpresas;
	}

	public void setLstEmpresas(List<Empresa> lstEmpresas) {
		this.lstEmpresas = lstEmpresas;
	}

	public List<Dispositivo> getLstDispositivos() {
		return lstDispositivos;
	}

	public void setLstDispositivos(List<Dispositivo> lstDispositivos) {
		this.lstDispositivos = lstDispositivos;
	}

	@Override
	public String toString() {
		return "SistemaSaludDispositivos [lstEmpresas=" + lstEmpresas + ", lstDispositivos=" + lstDispositivos + "]";
	}

	public boolean agregarEmpresa(String nombre) {
       int proxId = 1;

	   if (lstEmpresas.size() > 0) {
		  proxId = lstEmpresas.get(lstEmpresas.size() - 1).getId() + 1;
	   }
		
		 return lstEmpresas.add(new Empresa(proxId,nombre));
	}

	public Empresa traerEmpresa(String nombre) {
		Empresa empresa = null;
		int indice = 0;

		while (empresa == null && indice < lstEmpresas.size()) {
			if (lstEmpresas.get(indice).getNombre().equalsIgnoreCase(nombre)) {
				empresa = lstEmpresas.get(indice);
			}
			indice++;
		}
		return empresa;
	}

	public boolean agregarDispositivo(String nombre, String codigo, Empresa empresa) throws Exception {
		int proxId = 1;
		
		if (lstDispositivos.size() > 0) {
			proxId = lstDispositivos.get(lstDispositivos.size() - 1).getId() + 1;
		}
		
		return lstDispositivos.add(new Dispositivo(proxId,nombre,codigo,empresa));
	}

	public Dispositivo traerDispositivo(String codigo) {
		Dispositivo dispositivo = null;
		int indice = 0;

		while (dispositivo == null && indice < lstDispositivos.size()) {
			if (lstDispositivos.get(indice).getCodigo().equalsIgnoreCase(codigo)) {
				dispositivo = lstDispositivos.get(indice);
			}
			indice++;
		}
		return dispositivo;
	}
	
	public List<Metrica> traerMetricas(Dispositivo dispositivo, LocalDate desde, LocalDate hasta, int menorValor) {
		List<Metrica> metrica = new ArrayList<Metrica>();
		List<Metrica> auxList = dispositivo.traerMetricas(desde, hasta);

		for (int indice=0; indice<auxList.size(); indice++) {
			if (auxList.get(indice).getValor() < menorValor) {
			  metrica.add(auxList.get(indice));
		    }
	     }
		return metrica;
	}

}