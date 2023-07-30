package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {
	//after(despues) before(antes)
	public static boolean esBisiesto(int anio) {
		return ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
	}

	public static boolean esFechaValida(LocalDate fecha) {
		return esBisiesto(fecha.getYear());
	}

	public static String traerFechaCorta(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}

	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute();
	}

	public static boolean esDiaHabil(LocalDate fecha) {
		int diaHabil = fecha.getDayOfWeek().getValue();
		return diaHabil >= 1 && diaHabil <= 5;
	}

	public static String traerDiaDeLaSemana(LocalDate fecha) {
		int d = fecha.getDayOfWeek().getValue();
		String dia = new String();
		switch (d) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miércoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			break;
		}
		return dia;
	}

	public static String traerMesEnLetras(LocalDate fecha) {
		int m = fecha.getMonthValue();
		String mes = new String();
		switch (m) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
			break;
		}
		return mes;
	}

	public static String traerFechaLarga(LocalDate fecha) {
		return traerDiaDeLaSemana(fecha) + " " + fecha.getDayOfMonth() + " de " + traerMesEnLetras(fecha) + " del "
				+ fecha.getYear();
	}

	public static int traerCantDiasDeUnMes(int mes, int anio) {
       LocalDate fecha = LocalDate.of(anio, mes, 1);
       return fecha.lengthOfMonth();
	}

	public static double aproximar2Decimal(double valor) {
		return Math.round(valor * 100.0) / 100.0;
	}

	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	public static boolean esLetra(char c) {
		return Character.isLetter(c);
	}

	public static boolean esCadenaNros(String cadena) {
		boolean esNumero = true;
		int indice = 0;
		while(indice<cadena.length() && esNumero) {
			if(esLetra(cadena.charAt(indice))) {
				esNumero = false;
			}
			indice++;
		}
		return esNumero;
	}

	public static boolean esCadenaLetras(String cadena) {
		boolean esLetra = true;
		int indice = 0;
		while (esLetra && indice < cadena.length()) {
			if (esNumero(cadena.charAt(indice))) {
				esLetra = false;
			}
			indice++;
		}
		return esLetra;
	}

}
