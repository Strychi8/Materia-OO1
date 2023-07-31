package modelo;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Audiovisual {
	private boolean capitulosUnitarios;
	private List<Capitulo> lstCapitulos;
	
	public Serie(String codAudiovisual, String titulo, int anio, boolean estreno, String genero,
			boolean capitulosUnitarios) {
		super(codAudiovisual, titulo, anio, estreno, genero);
		this.capitulosUnitarios = capitulosUnitarios;
		this.lstCapitulos = new ArrayList<Capitulo>();
	}

	public boolean isCapitulosUnitarios() {
		return capitulosUnitarios;
	}

	public void setCapitulosUnitarios(boolean capitulosUnitarios) {
		this.capitulosUnitarios = capitulosUnitarios;
	}

	public List<Capitulo> getLstCapitulos() {
		return lstCapitulos;
	}

	public void setLstCapitulos(List<Capitulo> lstCapitulos) {
		this.lstCapitulos = lstCapitulos;
	}

	@Override
	public String toString() {
		return "Serie [" + super.toString() + ", capitulosUnitarios=" + capitulosUnitarios + ", lstCapitulos="
				+ lstCapitulos + "]";
	}
	
	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion) {
		return lstCapitulos.add(new Capitulo(capitulo,nroCapitulo,duracion));
	}
	
	public int calcularDuracion() {
		int suma = 0;
		for(int i=0; i<lstCapitulos.size(); i++) {
			suma = suma + lstCapitulos.get(i).getDuracion();
		}
		return suma;
	}

}
