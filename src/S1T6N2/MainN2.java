package S1T6N2;

import java.util.ArrayList;

import S1T6N1Ex2.GenericMethods;
import S1T6N1Ex2.Persona;

public class MainN2 {

	public static void main(String[] args) {
		/*- Exercici 1
		Modifica l'exercici anterior de manera que un dels arguments del m�tode gen�ric no sigui gen�ric.

		- Exercici 2
		Modifica l'apartat anterior de manera que els arguments del m�tode gen�ric siguin una llista d'arguments de variable indefinida.*/

		
		//Creao dos ArrayList con argumentos de variable diferentes y llamo al m�todo con las dos para ver que funciona le mande la que le mande
		Persona yoMismo = new Persona("Christian", "G�lvez", 35);
		ArrayList<String> edadPartidaS= new ArrayList<>();
		edadPartidaS.add("3");
		edadPartidaS.add("5");
		
		ArrayList<String> edadPartidaI= new ArrayList<>();
		edadPartidaI.add("3");
		edadPartidaI.add("5");
		
		GenericMethodsN2.genericMethod(yoMismo.getNom(), yoMismo.getCognom(), edadPartidaS);
		GenericMethodsN2.genericMethod(yoMismo.getNom(), yoMismo.getCognom(), edadPartidaI);
		
	}

}
