package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dispositivo {
	private int id;
	private String nombre;
	private String codigo;
	private List<Metrica> lstMetricas;
	private Empresa empresa;

	public Dispositivo(int id, String nombre, String codigo, Empresa empresa) throws Exception {
		this.id = id;
		this.nombre = nombre;
		setCodigo(codigo);
		this.lstMetricas = new ArrayList<Metrica>();
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		validarCodigo(codigo);
		this.codigo = codigo;
	}

	public List<Metrica> getLstMetricas() {
		return lstMetricas;
	}

	public void setLstMetricas(List<Metrica> lstMetricas) {
		this.lstMetricas = lstMetricas;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", lstMetricas=" + lstMetricas
				+ ", empresa=" + empresa.getNombre() + "]";
	}
    
	public boolean validarCodigo(String codigo) throws Exception {
		if(codigo.length() != 5) {
			throw new Exception("Su longitud no puede exceder a 5");
		}
		char[] codAux = codigo.toCharArray();
		if(codAux[0] != 'A' && codAux[0] != 'B') {
			throw new Exception("La letra debe ser A o B");
		}
		boolean cuatroNumeros = true;
		int i = 1;
		Integer suma = 0; //nos permite convertir un tipo básico int en un objeto. 
		//Esta clase contiene varios métodos estáticos que permiten realizar conversiones comunes 
		//de una forma rápida entre int e Integer o entre Integer y String
		
		while(i < codigo.length() && cuatroNumeros==true) {
			if(!Character.isDigit(codAux[i])) { // No Character.isDigit negado sera falso
				cuatroNumeros = false;
			}else {
				//el valueOf de String me va a devolver un valor primitivo de un objeto String como un tipo de dato cadena
				suma = suma + Integer.valueOf(Character.toString(codAux[i]));                                   
			}
			i++;
		}
		
		if(!cuatroNumeros) {
			throw new Exception("Codigo no cumple con el formato A1111");
		}
		
		if(codAux[0] == 'A') {
			//intValue() es un método incorporado en java que devuelve el valor de este entero como un int
			if(suma.intValue() % 2 != 0)
				throw new Exception("Codigo Invalido");
		}else {
			if(suma.intValue() % 2 == 0) 
			  throw new Exception("Codigo Invalido");
		}
	  return true;
	}
	public boolean agregarMetrica(int valor, LocalDate fecha, LocalTime hora) {
       return lstMetricas.add(new Metrica(valor, fecha, hora));
	}

	public Metrica traerMetrica(LocalDate fecha, LocalTime hora) {
		Metrica metrica = null;
		int indice = 0;

		while (metrica == null && indice < lstMetricas.size()) {
			if (lstMetricas.get(indice).getFecha().equals(fecha) && lstMetricas.get(indice).getHora().equals(hora)) {
				metrica = lstMetricas.get(indice);
			}
			indice++;
		}
		return metrica;
	}

	public List<Metrica> traerMetricas(LocalDate desde, LocalDate hasta) {
		List<Metrica> metrica = new ArrayList<Metrica>();

		for (int indice=0; indice < lstMetricas.size(); indice++) {
			if ((lstMetricas.get(indice).getFecha().isAfter(desde) || lstMetricas.get(indice).getFecha().isEqual(desde))
					&& (lstMetricas.get(indice).getFecha().isBefore(hasta) || lstMetricas.get(indice).getFecha().isEqual(hasta))) {
				metrica.add(lstMetricas.get(indice));
			}
		}
		return metrica;
	}
	

}