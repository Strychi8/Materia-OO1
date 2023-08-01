package test;

import java.util.Scanner;

import modelo.ArregloBidimensional;

public class TestArregloBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CU 1
		//ArregloBidimensional matriz1 = new ArregloBidimensional();
		double[][] matriz1 = {{10,21},{13,33}};
		ArregloBidimensional m1 = new ArregloBidimensional(matriz1);
		double[][] matriz2 = {{3,10},{3,3}};
		ArregloBidimensional m2 = new ArregloBidimensional(matriz2);
		
		System.out.println("\n1) Matriz 1:");
		m1.mostrarMatriz();
		
		System.out.println("\n2) Matriz 2:");
		m2.mostrarMatriz();
		
		ArregloBidimensional matrizSuma = new ArregloBidimensional(m1.sumar(matriz2));
		System.out.println("\n3) Matriz 3(SUMA): ");
		matrizSuma.mostrarMatriz();
		
		ArregloBidimensional matrizResta = new ArregloBidimensional(m1.restar(matriz2));
		System.out.println("\n4) Matriz 4(RESTA): ");
		matrizResta.mostrarMatriz();
		
		ArregloBidimensional transpuesta = new ArregloBidimensional(m1.transpuesta());
		m1.mostrarMatriz();
		System.out.println("\n5) Matriz 5(TRANSPUESTA): ");
		transpuesta.mostrarMatriz();
		
		ArregloBidimensional multiplicacion = new ArregloBidimensional(m1.multiplicar(3));
		System.out.println("\n6) Matriz a multiplicar:");
		m1.mostrarMatriz();
		System.out.println("\n6-1) Matriz 6(POR UN ESCALAR): ");
		multiplicacion.mostrarMatriz();
		
		ArregloBidimensional m3 = new ArregloBidimensional();
		double[][] m4 = iniciarMatriz();
		ArregloBidimensional matrizC = new ArregloBidimensional(m3.multiplicar(m4));
		System.out.println("\n7) Matriz 7(MULTIPLICACION DE MATRICES): ");
		matrizC.mostrarMatriz();
	}
	
	private static void iniciarMatrizAleatoria(double[][] matriz) {
		int rand = (int)(Math.random()*10-1)+1;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = rand; 
            }
        }
	}
	
	private static double[][] iniciarMatriz() {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Por favor ingrese la cantidad de filas: ");
		int f = teclado.nextInt();
		System.out.print("Por favor ingrese la cantidad de columnas: ");
		int c = teclado.nextInt();
		double[][]matriz = new double[f][c];

		for (int i = 0; i < f; i++) {
			for (int j = 0; j <c; j++) {
				System.out.print("Ingrese dato para la posicion ["+i+"] ["+j+"] : ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		return matriz;
	}

}
