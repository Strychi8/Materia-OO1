package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Acumar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Acumar sistema = new Acumar();
        
        System.out.println("1) Agregar las estaciones:");
        try {
			System.out.println(sistema.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7f, -58.4f, 100f));
			System.out.println(sistema.agregarEstacion("Avellaneda", "Av. Manuel Belgrano 2800", -34.681667f, -58.349722f, 200f));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("\n2) Traer estacion Lanus agregada:");
        System.out.println(sistema.traerEstacion("Lanus"));
        
        System.out.println("\n3) Intentar agregar nuevamente la estacion Lanus:");
        try {
			System.out.println(sistema.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7f, -58.4f, 100f));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        System.out.println("\n4) Agregar las mediciones:");
        System.out.println(sistema.agregarMedicion(sistema.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(13, 00), 17.6f, 49f, 9.7f, "E", 0f));
        System.out.println(sistema.agregarMedicion(sistema.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(14, 00), 18.4f, 45f, 6.2f, "SE", 0f));
        System.out.println(sistema.agregarMedicion(sistema.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(16, 00), 19f, 39f, 7.3f, "S", 0f));
        System.out.println(sistema.agregarMedicion(sistema.traerEstacion("Avellaneda"), LocalDate.of(2022, 9, 1), LocalTime.of(15, 00), 18.8f, 42f, 6.8f, "S", 0f));
        
        System.out.println("\n5) Traer Mediciones de estacion Avellaneda:");
        System.out.println(sistema.traerMediciones(sistema.traerEstacion("Avellaneda")));
        
        System.out.println("\n6) Traer promedio:");
        System.out.println(sistema.promedioTemperatura(sistema.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(12, 00), LocalTime.of(15, 30)));
        
        System.out.println("\n7) Traer distancia:");
        System.out.println(sistema.traerEstacion("Lanus").distanciaConEstacion(sistema.traerEstacion("Avellaneda")));
        
        System.out.println("\n8) Traer temperatura:");
        System.out.println(sistema.traerMedicion(sistema.traerEstacion("Lanus"), LocalDate.of(2022, 9, 1), LocalTime.of(16, 00)).temperaturaCorregidaPorAltura());
        
	}

}
