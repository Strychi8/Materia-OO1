package test;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado("Sergio","Ochoa",33444666,LocalDate.of(1998, 5, 12),234,160000);
		
		Persona persona1 = new Cliente("Mario","Veliz",43333444,LocalDate.of(2001, 5, 12),"20-43333444-9",50000);
		Cliente cliente1 = (Cliente)persona1;
		
		System.out.println(empleado.toString());
		
		System.out.println(empleado.calcularEdad(LocalDate.of(2000, 7, 20)));
		System.out.println("Metodo calcularSueldo: " + empleado.calcularSueldo(5));
		System.out.println("Metodo estadoCredito : " + cliente1.estadoCredito());
	}

}
