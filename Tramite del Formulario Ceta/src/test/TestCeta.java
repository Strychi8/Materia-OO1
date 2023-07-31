package test;

import java.time.LocalDate;

import modelo.Ceta;
import modelo.Contribuyente;
import modelo.Rodado;

public class TestCeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("1) CUIL INCORRECTO:");
			Contribuyente contribuyente = new Contribuyente(1,"Gutierrez", "Ana", 36500548L ,'F', "24-10465339-7");
			
			System.out.println("\n2) SEXO INCORRECTO:");
			Contribuyente contribuyente1 = new Contribuyente(2, "Alonso", "Elias", 34666999L, 'K', "20-34666999-4");
			
			System.out.println("\n3) DOMINIO INCORRECTO:");
			Rodado rodado1 = new Rodado(0, "AC-123", "10", "Ford");
			Rodado rodado2 = new Rodado(1, "AB-13-CD", "10", "Ford");
			
			System.out.println("\n4) COMPRADOR Y VENDEDOR SON EL MISMO:"); //no me funciona
			Contribuyente comprador1 = new Contribuyente(3, "Alonso", "Elias", 44093293, 'M', "20-44093293-3");
			Contribuyente vendedor1 = new Contribuyente(4, "Alonso", "Elias", 44093293, 'M', "20-44093293-3");
			Ceta planilla = new Ceta(1, LocalDate.of(2023,4,7), vendedor1, comprador1, 450000d);
			
			System.out.println("\n5) FECHA POSTERIOR A LA ACTUAL:");
			Contribuyente contribuyente2 = new Contribuyente(5, "Castillo", "Carla", 44666999L, 'F', "27-13597893-6");
			Ceta planilla1 = new Ceta(1, LocalDate.of(2024,4,7), contribuyente2, comprador1, 450000d);
			
			System.out.println("\n5) SISTEMA CORRECTO:");
			Contribuyente comprador2 = new Contribuyente(6, "Alonso", "Javier", 45000111, 'M', "20-45000111-3");
			Contribuyente contribuyente3 = new Contribuyente(7, "Nora", "Leone", 13597893, 'F', "27-13597893-6");
			Rodado rodado = new Rodado(2, "ABC-123", "10", "Ford");
			//Rodado rodado3 = new Rodado(3, "AB-123456-BV", "10", "Ford"); //Tambien funciona
			System.out.println(rodado);
			Ceta ceta = new Ceta(2, LocalDate.of(2023, 6, 12), contribuyente3, comprador2, 15000);
			System.out.println(ceta);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
    
	}

}
