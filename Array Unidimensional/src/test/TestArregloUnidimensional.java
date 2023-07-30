package test;

import java.util.Arrays;

import modelo.ArrayUnidimensional;

public class TestArregloUnidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       int[] vector = {22,33,43,3,43};
       ArrayUnidimensional array = new ArrayUnidimensional(vector);
       
       int[] arrayRetorno1 = array.ordenarAscendente();
       String intArrayAString = Arrays.toString(arrayRetorno1);
       
       int[] arrayRetorno = array.ordenarDescendente();
       String intArrayAString1 = Arrays.toString(arrayRetorno);
       
       System.out.println("Traigo el MENOR del Array: " + array.traerMenor());
       System.out.println("Traigo el MAYOR del Array: " + array.traerMayor());
       System.out.println("El promedio del Array es: " + array.calcularPromedio());
       System.out.println("Ordenamiento Ascendente: " + intArrayAString1);
       System.out.println("Ordenamiento Descendente: " + intArrayAString);
       System.out.println("La frecuencia que sale este numero en el array es: " + array.traerFrecuencia(43));
       System.out.println("La moda es: " + array.traerModa());
      
	}

}
