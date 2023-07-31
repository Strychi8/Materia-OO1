package modelo;

import java.time.LocalDate;

public class Tarea {
	private int idTarea;
	private String tarea;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Empleado responsable;
	private int cantHorasDiarias;
	private boolean habil;

	public Tarea(int idTarea, String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado responsable,
			int cantHorasDiarias, boolean habil) {
		this.idTarea = idTarea;
		this.tarea = tarea;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.responsable = responsable;
		this.cantHorasDiarias = cantHorasDiarias;
		this.habil = habil;
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public int getCantHorasDiarias() {
		return cantHorasDiarias;
	}

	public void setCantHorasDiarias(int cantHorasDiarias) {
		this.cantHorasDiarias = cantHorasDiarias;
	}

	public boolean isHabil() {
		return habil;
	}

	public void setHabil(boolean habil) {
		this.habil = habil;
	}

	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", tarea=" + tarea + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", responsable=" + responsable + ", cantHorasDiarias=" + cantHorasDiarias + ", habil="
				+ habil + "]";
	}
     
	public double calcularJornal() {
		double jornal = 0;
			 if(habil == true) {
				 jornal = cantHorasDiarias * responsable.getValorHora();
			 }else {
				 jornal = cantHorasDiarias * responsable.getValorHora()*1.5;
			 }
		return jornal;
	}
	
	public int calcularCantDiasTrabajados(int mes,int anio) {
		LocalDate fecha = LocalDate.of(anio, mes, 12);
		int diaSem = fecha.getDayOfWeek().getValue();
		int cantDias = 0;
	
		if(habil == true) {
			if(diaSem >= 1 && diaSem <= 5) {
				 cantDias = cantDias + 1;
			}else {
				 cantDias = cantDias + 1;
			}
		}
       return cantDias;
	}
	
	//CALCULAR HONORARIOS ME FALTA
}
