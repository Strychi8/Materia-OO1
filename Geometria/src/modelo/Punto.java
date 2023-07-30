package modelo;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean equals(Punto punto) {
		return (this.x == punto.getX()) && (this.y == punto.getY());
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public double calcularDistancia(Punto p) {
		double catX = x - p.getX();
		double catY = y - p.getY();
		return Math.sqrt(Math.pow(catX, 2) + Math.pow(catY, 2));

	}
}
