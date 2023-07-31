package test;

import java.time.LocalDate;

import modelo.Proyecto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Proyecto sistema = new Proyecto();
       
       System.out.println("1) Agregar los siguientes programadores:");
       System.out.println(sistema.agregarProgramador("Nom 1", "Ape 1", "Junior"));
       System.out.println(sistema.agregarProgramador("Nom 2", "Ape 2", "Semi Senior"));
       System.out.println(sistema.agregarProgramador("Nom 3", "Ape 3", "Semi Senior"));
       System.out.println(sistema.agregarProgramador("Nom 4", "Ape 4", "Senior"));
       
       System.out.println("\n2) Agregar los siguientes proyectos:");
       System.out.println(sistema.agregarProyecto(LocalDate.of(2022, 9, 1), 40, true, 100.5d));
       System.out.println(sistema.agregarProyecto(LocalDate.of(2022, 9, 2), 30, true, 120));
       System.out.println(sistema.agregarProyecto(LocalDate.of(2022, 11, 1), 60, false, 130.5d));
       System.out.println(sistema.agregarProyecto(LocalDate.of(2022, 11, 10), 50, false, 110));
       
       System.out.println("\n3) Traer e imprimir al programador con id=1");
       System.out.println(sistema.traerProgramador(1));
       System.out.println("\n4) Traer e imprimir el proyecto con id=1");
       System.out.println(sistema.traerProyecto(1));
       
       System.out.println("\n5) Realizar las siguientes asignaciones e imprimir la lista de proyectos:");
       System.out.println(sistema.traerProyecto(1).asignarProgramador(sistema.traerProgramador(4)));
       System.out.println(sistema.traerProyecto(1).asignarProgramador(sistema.traerProgramador(3)));
       System.out.println(sistema.traerProyecto(2).asignarProgramador(sistema.traerProgramador(2)));
       System.out.println(sistema.traerProyecto(2).asignarProgramador(sistema.traerProgramador(1)));
       System.out.println(sistema.traerProyecto(3).asignarProgramador(sistema.traerProgramador(4)));
       System.out.println(sistema.traerProyecto(3).asignarProgramador(sistema.traerProgramador(3)));
       System.out.println(sistema.traerProyecto(4).asignarProgramador(sistema.traerProgramador(2)));
       System.out.println(sistema.traerProyecto(4).asignarProgramador(sistema.traerProgramador(1)));
       System.out.println(sistema.getProyectos());
       
       System.out.println("\n6) Calcular la fecha de estimacion para el proyecto 3:");
       System.out.println(sistema);//NO COMPLETO
       
       System.out.println("\n7) Traer los proyectos entre fechas:");
       System.out.println(sistema.traerProyectos(LocalDate.of(2022, 9, 2), LocalDate.of(2022, 11, 6)));
       
       
       
       
       
	}

}
