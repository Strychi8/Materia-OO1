package test;

import java.time.LocalDate;

import modelo.Sistema;

public class TestTema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sistema sistema = new Sistema();
       
       System.out.println("1) Agregar los siguientes empleados");
    
       System.out.println(sistema.agregarEmpleado("Alvarez", "Martin", "4526", 380d));
       System.out.println(sistema.agregarEmpleado("Araujo", "Mariana", "2698", 410d));
       
       System.out.println("\n2) Traer empleado");
       System.out.println(sistema.traerEmpleado("2698"));
       
       System.out.println("\n3) Agregar las siguientes Tareas");
       System.out.println(sistema.agregarTarea("Reparacion Cordoba altura 700-800", LocalDate.of(2021, 5, 11), LocalDate.of(2021, 6, 19), sistema.traerEmpleado("4526"), 7, true));
       System.out.println(sistema.agregarTarea("Reparacion semaforo Alsina y Balcarce", LocalDate.of(2021, 6, 16), LocalDate.of(2021, 7, 22), sistema.traerEmpleado("2698"), 6, false));
       
       System.out.println("\n4) Traer tarea id=1");
       System.out.println(sistema.traerTarea(1));
       
       System.out.println("\n5) Calcular Jornal id=1");
       System.out.println(sistema.traerTarea(1).calcularJornal());
       
       System.out.println("\n6) Para la tarea id=1, calcular calcular los dias trabajados mes=6, anio=2021");
       System.out.println(sistema.traerTarea(1).calcularCantDiasTrabajados(10, 2022));
       
       System.out.println("\n8) Traer tarea id=2");
       System.out.println(sistema.traerTarea(2));
       
       System.out.println("\n9) Calcular Jornal id=2");
       System.out.println(sistema.traerTarea(2).calcularJornal());
	}

}
