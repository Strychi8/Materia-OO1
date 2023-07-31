package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private int id;
	private LocalDate fechaInicio;
	private int duracionEstimada;
	private boolean finalizado;
	private List<Programador> programadores;
	private List<Proyecto> proyectos;
    
	public Proyecto() {
		this.programadores = new ArrayList<Programador>();
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public Proyecto(int id, LocalDate fechaInicio, int duracionEstimada, boolean finalizado) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.duracionEstimada = duracionEstimada;
		this.finalizado = finalizado;
		this.programadores = new ArrayList<Programador>();
		this.proyectos = new ArrayList<Proyecto>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getDuracionEstimada() {
		return duracionEstimada;
	}

	public void setDuracionEstimada(int duracionEstimada) {
		this.duracionEstimada = duracionEstimada;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public List<Programador> getProgramadores() {
		return programadores;
	}

	public void setProgramadores(List<Programador> programadores) {
		this.programadores = programadores;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", fechaInicio=" + fechaInicio + ", duracionEstimada=" + duracionEstimada
				+ ", finalizado=" + finalizado + ", programadores=" + programadores + ", proyectos=" + proyectos + "]";
	}

	public boolean agregarProgramador(String nombre, String apellido, String categoria) {
		int proxId = 1;
		if(programadores.size()>0) {
			proxId = programadores.get(programadores.size()-1).getId()+1;
		}
		return programadores.add(new Programador(proxId,nombre,apellido,categoria));
	}
	
	public boolean agregarProyecto(LocalDate fechaInicio, int duracionEstimada, boolean finalizado, 
			double valorHoraProgramador) {
		int proxId = 1;
		if(proyectos.size()>0) {
			proxId = proyectos.get(proyectos.size()-1).getId()+1;
		}
		return proyectos.add(new Comercial(proxId,fechaInicio,duracionEstimada,finalizado,valorHoraProgramador));
	}
	
	public boolean agregarProyecto(LocalDate fechaInicio, int duracionEstimada, boolean finalizado, 
			int creditos) {
		int proxId = 1;
		if(proyectos.size()>0) {
			proxId = proyectos.get(proyectos.size()-1).getId()+1;
		}
		return proyectos.add(new Interno(proxId,fechaInicio,duracionEstimada,finalizado,creditos));
	}
	
	public Programador traerProgramador(int id) {
		Programador programador = null;
		int indice = 0;
		while(programador == null && indice<programadores.size()) {
			if(programadores.get(indice).getId() == id) {
				programador = programadores.get(indice);
			}
			indice++;
		}
		return programador;
	}
	
	public Proyecto traerProyecto(int id) {
		Proyecto proyecto = null;
		int indice = 0;
		while(proyecto == null && indice<proyectos.size()) {
			if(proyectos.get(indice).getId() == id) {
				proyecto = proyectos.get(indice);
			}
			indice++;
		}
		return proyecto;
	}
	
	public boolean asignarProgramador(Programador programador) {
		return programadores.add(programador);
	}
	
	public List<Proyecto> traerProyectos(LocalDate desde,LocalDate hasta){
		List<Proyecto> auxProyectos = new ArrayList<Proyecto>();
		
		for(int indice=0; indice<proyectos.size(); indice++) {
			if(proyectos.get(indice).getFechaInicio().isAfter(desde) || proyectos.get(indice).getFechaInicio().isEqual(desde)
					&& proyectos.get(indice).getFechaInicio().isBefore(hasta) || proyectos.get(indice).getFechaInicio().isEqual(hasta)) {
				auxProyectos.add(proyectos.get(indice));
			}
		}
		
		return auxProyectos;
	}
	
	/*public LocalDate calcularFechaFinalizacionEstimada() {
		int diaHabil = fechaInicio.getDayOfWeek().getValue();
		return fechaInicio;
		//NO COMPLETO
	}*/
	
	


}
