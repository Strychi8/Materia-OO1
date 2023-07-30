package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Numero num = new Numero(6);
         System.out.println("La suma es: " + num.sumar(4));
         System.out.println("La multiplicacion es: " + num.multiplicar(34));
         System.out.println("Es par? " + num.esPar());
         System.out.println("Es primo? " + num.esPrimo());
         System.out.println("Valor Convertido(String): " + num.convertirAString());
         System.out.println("Valor convertido:(Double) " + num.convertirDouble());
         System.out.println("La potencia es: " + num.calcularPotencia(2));
         System.out.println("El numero binario es: " + num.pasaBase2());
         System.out.println("El factorial del numero dado me da: " + num.calcularFactorial());
         System.out.println("El numero combinatorio es: " + num.numeroCombinatorio(4));
         
	}

}
