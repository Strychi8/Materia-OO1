package test;

import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sistema sistema = new Sistema();
      
       System.out.println("\n3) Agregar e imprimir los siguientes audiovisuales:");
       System.out.println(sistema.agregarAudiovisual("3748916", "Coronados de Gloria", 2019, false, "Documental", false));
       System.out.println(sistema.traerSerie("3748916").agregarCapitulo("El primer capitulo", 2, 13));
       System.out.println(sistema.traerSerie("3748916").agregarCapitulo("La genesis de la generacion dorada",1,14));
       System.out.println(sistema.agregarAudiovisual("4689735", "Luna de Avellaneda", 2004, false, "Comedia Dramatica", 139));
       System.out.println(sistema.agregarAudiovisual("7389182", "Todos tenemos un muerto...", 2021, true, "Comedia Dramatica", 103));
       System.out.println(sistema.agregarAudiovisual("1732489", "Los Simuladores", 2003, false, "Drama Social", true));
       System.out.println(sistema.traerSerie("1732489").agregarCapitulo("Capitulo 1", 1, 40));
       System.out.println(sistema.traerSerie("1732489").agregarCapitulo("Capitulo 2",2,35));
       
       System.out.println(sistema);
       
       System.out.println("\n4) Traer e imprimir audiovisual:");
       System.out.println(sistema.traerAudiovisual("4689735"));
       System.out.println("\n5) Calcular tiempo del audiovisual:");
       System.out.println(sistema.traerAudiovisual("4689735").calcularDuracion());
       System.out.println("\n6) Traer e imprimir audiovisual:");
       System.out.println(sistema.traerAudiovisual("3748916"));
       System.out.println("\n7) Calcular tiempo del audiovisual:");
       System.out.println(sistema.traerAudiovisual("3748916").calcularDuracion());
	}

}
