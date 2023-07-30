package test;

import modelo.Circulo;
import modelo.Punto;

public class TestGeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto(1, 1);
		Punto punto2 = new Punto(2, 3);

		System.out.println(punto1 + " equals " + punto2 + " --- retorna --> " + punto1.equals(punto2));
		System.out.println("Distancia entre " + punto1 + " y " + punto2 + " = " + punto1.calcularDistancia(punto2));

		Circulo c1 = new Circulo(punto1, punto2);
		System.out.println("c1 = " + c1);

		Circulo c2 = new Circulo(punto2, 7);
		System.out.println("c2 = " + c2);

		System.out.println("El perimetro del circulo es ---> " + c1.calcularPerimetro());
		System.out.println("El area del circulo es ----> " + c1.calcularArea());
		System.out.println("distancia entre " + c1 + " y " + c2 + " = " + c1.calcularDistancia(c2));

		System.out.println("distancia entre " + c2 + " y " + c1 + " = " + c2.calcularDistancia(c1));
	}

}
