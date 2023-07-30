package test;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestLocalDateYLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha = LocalDate.of(2022, 2, 23);
		// Creamos otra fecha, restamos 5 dias a la anterior
		LocalDate fecha1 = fecha.minusDays(5);
		// Creamos otra fecha, sumamos 4 meses a la anterior
		LocalDate fecha2 = fecha1.plusMonths(4);
		
		LocalTime hora = LocalTime.of(14, 20, 23);
		LocalTime hora1 = hora.minusHours(4);
		LocalTime hora2 = hora.plusHours(3);
		LocalTime hora3 = hora2.minusHours(2);
         
		System.out.println("Primer Fecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear());
		System.out.println("Segunda Fecha: " + fecha1.getDayOfMonth() + "/" + fecha1.getMonthValue() + "/" + fecha1.getYear());
		System.out.println("Tercer Fecha: " + fecha2.getDayOfMonth() + "/" + fecha2.getMonthValue() + "/" + fecha2.getYear());
		System.out.println("Hora ORIGINAL: " + hora);
		System.out.println("Sumo horas(Hora 2): " + hora2);
		System.out.println("Resto horas(Hora 1): " + hora1);
		System.out.println("Hora 3: " + hora3);
		System.out.println("Comparo hora : " + hora +" y hora 3 " + hora1 + " ---> "+ hora.equals(hora1));

	}

}
