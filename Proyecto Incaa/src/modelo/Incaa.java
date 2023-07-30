package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	private List<Pelicula> catalogo = new ArrayList<Pelicula>();

	public Incaa(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		String ret = "";
		for(Pelicula p: catalogo) {
			ret = ret + p.toString() + "\n";
		}
		return ret;
	}
	
	public boolean agregarPelicula(String pelicula,Genero genero) throws Exception {
		int indice = 0;
        
		while (indice < catalogo.size()) {
			if (catalogo.get(indice).getPelicula().equalsIgnoreCase(pelicula)) {
				throw new Exception("Esta pelicula se repite");
			}
			indice++;
		}
		return catalogo.add(new Pelicula(indice + 1, pelicula, genero));
	}
	//Sobrecarga
	public List<Pelicula> traerPelicula(Genero genero)  {
		List<Pelicula> lstPeliculas = new ArrayList<Pelicula>();
		int indice = 0;
		    
		    while(indice < catalogo.size()) {
		    	if(catalogo.get(indice).getGenero().equals(genero) ) {
		    		lstPeliculas.add(catalogo.get(indice));
		    	}
		    	indice++;
		    }
		
		   return lstPeliculas;
	 
	}
	public Pelicula traerPelicula(int idPelicula) {
		Pelicula pelicula = null;
		int indice = 0;
		    
		  while(pelicula == null && indice < catalogo.size()) {
		    	if(catalogo.get(indice).getIdPelicula() == idPelicula) {
		    		pelicula = catalogo.get(indice);
		    	}
		    	indice++;
		    }
      return pelicula;
	
	}
	public List<Pelicula> traerPelicula(String partePelicula){
		List<Pelicula> encontrados = new ArrayList<Pelicula>();
		int indice=0;
		while(indice<catalogo.size()) {
			if(catalogo.get(indice).getPelicula().equalsIgnoreCase(partePelicula)) {
				encontrados.add(catalogo.get(indice));
			}
			indice++;
		}
		return encontrados;
	}
	
	public void modificarPelicula(int idPelicula,String pelicula,Genero genero) throws Exception {
		Pelicula movie = traerPelicula(idPelicula);
		int indice = 0;
	    if(movie == null) {
	    	throw new Exception("ERROR: Esa pelicula no existe");
	    }
		while(movie != null && indice<catalogo.size()) {
			if(catalogo.get(indice).getIdPelicula() == idPelicula) {
				catalogo.get(indice).setPelicula(pelicula);
				catalogo.get(indice).setGenero(genero);
			}
			indice++;
		}	
	}
	public boolean eliminarPelicula(int idPelicula) throws Exception {
		int indice=0;
		Pelicula movie = traerPelicula(idPelicula);
		if(movie == null) {
			throw new Exception("ERROR: Esta pelicula no existe");
		}
		while(indice<catalogo.size()) {
			if(catalogo.get(indice).getIdPelicula() == idPelicula) {
				movie = catalogo.get(indice);
			}
			indice++;
		}
		
	   return catalogo.remove(movie);
	}
	
	

}
