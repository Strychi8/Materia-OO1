package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
     private List<Audiovisual> lstAudiovisual;

	public Sistema() {
		this.lstAudiovisual = new ArrayList<Audiovisual>();
	}

	public List<Audiovisual> getLstAudiovisual() {
		return lstAudiovisual;
	}

	public void setLstAudiovisual(List<Audiovisual> lstAudiovisual) {
		this.lstAudiovisual = lstAudiovisual;
	}

	@Override
	public String toString() {
		return "Sistema [lstAudiovisual=" + lstAudiovisual + "]";
	}
	
	public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, int duracion) {
	   return lstAudiovisual.add(new Pelicula(codAudiovisual,titulo,anio,estreno,genero,duracion));
	}
	
    public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, boolean capitulosUnitarios) {
	   return lstAudiovisual.add(new Serie(codAudiovisual,titulo,anio,estreno,genero,capitulosUnitarios));
	}
    
    public Audiovisual traerAudiovisual(String codAudiovisual) {
    	Audiovisual audiovisual = null;
    	int indice = 0;
    	
    	while(audiovisual == null && indice < lstAudiovisual.size()) {
    		if(lstAudiovisual.get(indice).getCodAudiovisual().equalsIgnoreCase(codAudiovisual)) {
    			audiovisual = lstAudiovisual.get(indice);
    		}
    		indice++;
    	}
    	
    	return audiovisual;
    }
    
    public Serie traerSerie(String codAudiovisual) {
    	Serie serie = null;
    	for(int indice=0; indice<lstAudiovisual.size(); indice++) {
    		if(lstAudiovisual.get(indice) instanceof Serie) {
    			Serie auxSerie = (Serie) lstAudiovisual.get(indice);
    			if(auxSerie.getCodAudiovisual().equalsIgnoreCase(codAudiovisual)) {
    				serie = (Serie) lstAudiovisual.get(indice);
    			}
    		}
    	}
    	return serie;
    }
     
     
}
