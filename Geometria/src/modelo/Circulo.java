package modelo;

public class Circulo {
	private Punto origen;
	private double radio;

	public Circulo(Punto origen, double radio) { // constructor
		this.origen = origen;
		this.radio = radio;
	}

	public Circulo(Punto origen, Punto radio) {// contructor sobrecargado
		this.origen = origen;
		this.setRadio(radio); // set sobrecargado
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setRadio(Punto radio) {// sobrecargado
		this.radio = origen.calcularDistancia(radio);
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}

	public boolean equals(Circulo circulo) {
		return ((radio == circulo.getRadio()) && (origen.equals(circulo.getOrigen())));

	}
	public double calcularPerimetro() {
		return 2*3.14*radio;
	}
    
	public double calcularArea() {
		return 3.14*(radio*radio);
	}
	public double calcularDistancia(Circulo circulo) {

		return origen.calcularDistancia(circulo.getOrigen());

	}
}
