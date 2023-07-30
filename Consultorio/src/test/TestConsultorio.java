package test;

import consultorio.Paciente;

import consultorio.Medico;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("Tomas", "Strycharski", 1.67f, 81);
		Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.90f, 100);
		Paciente paciente3 = new Paciente("Carlos","Salomon", 1.80f, 90);
		//Paciente paciente4 = null; //tampoco esta instanciado
		//Paciente paciente5 = new Paciente();//es un objeto creado a medias, va a fallar por alguna razon
		Paciente pacientes[] = {paciente1,paciente2,paciente3};
        Medico medico = new Medico("Daniel","Lopez","Odontologo",pacientes);
        
        //Object obj;
        System.out.println("Paciente: " + paciente1);
		System.out.println("Visita 1:");
		System.out.println(medico.traerNombreCompleto());
		System.out.println(paciente1.traerNombreCompleto() + " - IMC: " + medico.calcularIMC(paciente1));
		System.out.println(paciente2.traerNombreCompleto() + " - IMC: " + medico.calcularIMC(paciente2));
		System.out.println(paciente3.traerNombreCompleto() + " - IMC: " + medico.calcularIMC(paciente3));
		
		System.out.println("Traigo el menor IMC de un paciente: " + medico.traerElMenorImc());
		System.out.println("Traigo el paciente con MAYOR Estatura: " + medico.traerPacienteMayorEstatura());
		System.out.println("Traigo el promedio del peso de los pacientes: " + medico.traerPromedioPeso());
	}

}
