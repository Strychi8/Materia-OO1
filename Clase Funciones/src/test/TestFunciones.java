package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LocalDate fecha = LocalDate.of(2022, 2, 20);
       LocalTime hora = LocalTime.of(23, 20);
       String cadena = "2323211112";
       System.out.println("Es Bisiesto? " + Funciones.esBisiesto(1700));
       //System.out.println("Es Fecha Valida? " + Funciones.esFechaValida(fecha)); //INCOMPLETO
       System.out.println("Metodo traerFechaCorta ---> " + Funciones.traerFechaCorta(fecha));
       System.out.println("Metodo traerHoraCorta ---> " + Funciones.traerHoraCorta(hora));
       System.out.println("Metodo esDiaHabil ---> " + Funciones.esDiaHabil(fecha));
       System.out.println("Metodo traerDiaDeLaSemana ---> " + Funciones.traerDiaDeLaSemana(fecha));
       System.out.println("Metodo traerMesEnLetras ---> " + Funciones.traerMesEnLetras(fecha));
       System.out.println("Metodo traerFechaLarga ---> " + Funciones.traerFechaLarga(fecha));
       System.out.println("Metodo traerCantDiasDeUnMes ---> " + Funciones.traerCantDiasDeUnMes(9,2022));
       System.out.println("Metodo aproximar2Decimal ---> " + Funciones.aproximar2Decimal(12.456d));
       System.out.println("Metodo esNumero ---> " + Funciones.esNumero('6'));
       System.out.println("Metodo esLetra ---> " + Funciones.esLetra('d'));
       System.out.println("Metodo esCadenaNros ---> " + Funciones.esCadenaNros(cadena));
       System.out.println("Metodo esCadenaLetras ---> " + Funciones.esCadenaLetras(cadena));
       
       String codigo = "A2020";
       char[] gfg = codigo.toCharArray();
       for(int i=0; i<gfg.length; i++) {
    	   System.out.println(gfg[i]);
       }
       
       
	}

}
