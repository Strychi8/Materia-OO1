package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.OperadorMovil;
import modelo.Sistema;

public class TestTema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sistema sistema = new Sistema();
       
       System.out.println("\n1-1) Intentar agregar a la lista el objeto SMS:");
       
       OperadorMovil operadorOrigen1 = new OperadorMovil(1,"Personal");
       OperadorMovil operadorOrigen = new OperadorMovil(3,"Claro");
       OperadorMovil operadorDestino = new OperadorMovil(2,"Movistar");
       try {
		System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567, 159876543, "Estoy rindiendo el final de oo1",  operadorOrigen , operadorDestino));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
       
      
        System.out.println("\n1-2) Agregar a la lista e imprimir el objeto SMS:");
        try {
			System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(16, 36), 151234567, 1598765432, "Estoy rindiendo el final de oo1",  operadorOrigen , operadorDestino));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

        System.out.println("\n1-3) Intentar agregar a la lista el objeto Email:");
        try {
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16, 28), "oo1@unla.gob.ar", "alumno.com.ar", "Orientacion a Objetos 1 - UNLa", "Estimado alumno, debe presentarse a rendir el final de OO1 el dia 1/12 a las 9Hs"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        System.out.println("\n1-4) Agregar a la lista e imprimir el objeto Email:");
        try {
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 12, 12), LocalTime.of(16, 28), "oo1@unla.gob.ar", "alumno@gmail.com", "Orientacion a Objetos 1 - UNLa", "Estimado alumno, debe presentarse a rendir el final de OO1 el dia 1/12 a las 9Hs"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
        System.out.println("\n2-1) Traer e imprimir el SMS con IdMensaje = 1 y cambiar el estado a Visto=true");
        System.out.println(sistema.traerMensaje(1));
        
        System.out.println("\n2-2) Traer e imprimir el Email con IdMensaje = 2 y cambiar el estado a Recibido=true");
        System.out.println(sistema.traerMensaje(2));
       
        System.out.println("\n3) Agregar los siguientes objetos a la lista, al finalizar la carga, imprimirla:");
        try {
			System.out.println(sistema.agregarSMS(LocalDate.of(2020, 11, 20), LocalTime.of(17, 19), 151234567, 1598765431, "Recibido OK",  operadorOrigen1 , operadorDestino));
			System.out.println(sistema.agregarSMS(LocalDate.of(2020, 12, 15), LocalTime.of(10, 24), 151234567, 1598765430, "Gracias",  operadorOrigen1 , operadorDestino));
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 11, 20), LocalTime.of(17, 15), "oo1@unla.gob.ar", "alumno@gmail.com", "Orientacion a Objetos 1 - UNLa", "Se adjunta la grilla de inscripciones al final de Diciembre"));
			System.out.println(sistema.agregarEmail(LocalDate.of(2020, 12, 11), LocalTime.of(15, 12), "info@gmail.gob.ar", "persona@gmail.com.ar", "Promocion", "Aproveche nuestras promociones"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
       
        System.out.println(sistema.toString());
       
        System.out.println("\n4-1) Traer e imprimir los mensajes que tengan como operadorOrigen la compania Personal");
        System.out.println(sistema.traerMensaje("Personal"));
        
        System.out.println("\n4-2) Traer e imprimir los mensajes que se hayan enviado el dia 11/12/2020 entre las 13 y las 17Hs");
        System.out.println(sistema.traerMensaje(LocalDate.of(2020, 12, 11), LocalTime.of(13, 00), LocalTime.of(17, 00)));
        
        System.out.println("\n4-3) Traer e imprimir los mensajes que se hayan enviado el dia 10/12/2020 entre las 16 y las 18Hs y que tengan como compania origen Claro");
        System.out.println(sistema.traerMensaje(LocalDate.of(2020, 12, 10), LocalTime.of(16, 00), LocalTime.of(18, 00), "Claro"));
	}

}
