package modelo;

import java.util.Arrays;

public class ArrayUnidimensional {
	private int[] vector = new int[5];

	public ArrayUnidimensional(int[] vector) {
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "ArrayUnidimensional [vector=" + Arrays.toString(vector) + "]";
	}

	public int traerMenor() {
		int menor = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		return menor;
	}

	public int traerMayor() {
		int mayor = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		return mayor;
	}

	public double calcularPromedio() {
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return suma / 5;
	}

	public int[] ordenarAscendente() {
		int auxiliar;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] >= vector[j + 1]) {
					auxiliar = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = auxiliar;
				}
			}
		}
		return vector;
	}

	public int[] ordenarDescendente() {
		int auxiliar;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] <= vector[j + 1]) {
					auxiliar = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = auxiliar;
				}
			}
		}
		return vector;
	}

	public int traerFrecuencia(int numero) {
		int frecuencia = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == numero) {
				frecuencia++;
			}

		}
		if (frecuencia != 0) {
			numero = frecuencia;
		}
		return numero;
	}

	public int traerModa() {
		int moda = 0;
		int mayorFrecuencia = 0;

		for (int i = 0; i < vector.length; i++) {
			int contador = 0;
			for (int j = 0; j < vector.length; j++) {
				if (vector[i] == vector[j]) {
					contador++;
				}
				if (contador > mayorFrecuencia) {
					moda = vector[i];
					mayorFrecuencia = contador;
				}
			}
		}
		return moda;
	}
	
	public void mostrarVector() {
		for(int i=0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

}
