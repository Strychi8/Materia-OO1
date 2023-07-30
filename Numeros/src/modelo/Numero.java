package modelo;

public class Numero {
	private int numero;

	public Numero(int n) {
		this.numero = n;
	}

	public int getN() {
		return numero;
	}

	public void setN(int n) {
		this.numero = n;
	}

	@Override
	public String toString() {
		return "Numero [n=" + numero + "]";
	}

	public int sumar(int n1) {
		return numero + n1;
	}

	public int multiplicar(int n1) {
		return numero * n1;
	}

	public boolean esPar() {
		return numero % 2 == 0;
	}

	public boolean esPrimo() {
		int contador = 2;
		boolean primo = true;
		
		while((primo) && (contador!=numero)){
			// Si es divisible por cualquiera de estos números, no es primo
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return primo;

	}

	public String convertirAString() {
       return String.valueOf(numero);
	}

	public double convertirDouble() {
		//String stringValue = "400";
		return Double.parseDouble(convertirAString());
	}

	public double calcularPotencia(int exp) {
		return Math.pow(numero, exp);
	}

	public String pasaBase2() {
		String binario = " ";
		int numCopia = numero;
		
		while (numCopia > 0) {
			binario = numCopia % 2 + binario;
			numCopia = numCopia / 2;
		}
		
		return binario;
	}
    
	public int calcularFactorial() {
		return calcularFactorial(numero);
	}
	
	public int calcularFactorial(int numero) {
		int factorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public float numeroCombinatorio(int n1) {
		Numero numero1 = new Numero(n1);
		Numero numeroK = new Numero(this.numero-numero1.getN());
		
		return this.calcularFactorial()/(numero1.calcularFactorial()*numeroK.calcularFactorial());
	}

}
