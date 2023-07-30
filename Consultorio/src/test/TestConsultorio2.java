package test;

import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("Tomas", "Strycharski", 1.67f, 81f);
		Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.60f, 90);
		Paciente pacientes[] = {paciente1,paciente2};
        Medico medico = new Medico("Daniel","Lopez","Odontologo",pacientes);
        paciente1.setPeso(80f);
        paciente2.setPeso(65f);
		System.out.println("Visita 2:");
		System.out.println(medico.traerNombreCompleto());
		System.out.println(paciente1.traerNombreCompleto() + " IMC " + medico.calcularIMC(paciente1));
		System.out.println(paciente2.traerNombreCompleto() + " IMC " + medico.calcularIMC(paciente2));
		
		System.out.println("\nMedico: " + medico.toString());
	}

}
