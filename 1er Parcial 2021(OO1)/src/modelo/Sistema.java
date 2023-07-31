package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Empleado> lstEmpleados;
	private List<Tarea> lstTareas;

	public Sistema() {
		this.lstEmpleados = new ArrayList<Empleado>();
		this.lstTareas = new ArrayList<Tarea>();
	}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}

	public List<Tarea> getLstTareas() {
		return lstTareas;
	}

	public void setLstTareas(List<Tarea> lstTareas) {
		this.lstTareas = lstTareas;
	}

	@Override
	public String toString() {
		return "Sistema [lstEmpleados=" + lstEmpleados + ", lstTareas=" + lstTareas + "]";
	}
	
	//6) + agregarEmpleado(String apellido, String nombre, String nroLegajo, double valorHora) : boolean
     public boolean agregarEmpleado(String apellido,String nombre, String nroLegajo, double valorHora) {
    	 return lstEmpleados.add(new Empleado(apellido,nombre,nroLegajo,valorHora));
     }
     public boolean agregarTarea(String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado
    		 responsable, int cantHorasDiarias, boolean habil) {
    	 int idTarea = 1;
    	 if(lstTareas.size() > 0) {
    		 idTarea = lstTareas.get(lstTareas.size()-1).getIdTarea()+1;
    	 }
    	 return lstTareas.add(new Tarea(idTarea,tarea,fechaInicio,fechaFin,responsable,cantHorasDiarias,habil));
     }
     
     public Empleado traerEmpleado(String nroLegajo) {
    	 Empleado empleado = null;
    	 int indice=0;
    	 while(empleado == null && indice<lstEmpleados.size()) {
    		 if(lstEmpleados.get(indice).getNroLegajo().equalsIgnoreCase(nroLegajo)) {
    			 empleado = lstEmpleados.get(indice);
    		 }
    		 indice++;
    	 }
    	 return empleado;
     }
     
     public Tarea traerTarea(int idTarea) {
    	 Tarea tarea = null;
    	 int indice=0;
    	 while(tarea == null && indice<lstTareas.size()) {
    		 if(lstTareas.get(indice).getIdTarea() == idTarea) {
    			 tarea = lstTareas.get(indice);
    		 }
    		 indice++;
    	 }
    	 return tarea;
     }
}
