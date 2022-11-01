package S1T6N2;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodsN2 {

	//Un métode generic te un parámetre de tipus (l'operador de diamant que tanca el tipus) avans del tipus de retorn de la declaració del métode
	//Els métodes generics poden tenir diferents tipus de parámetres separats per comes a la firma del métode
	static <T, E> void genericMethod(T a, String b, ArrayList<E> c) {
	    System.out.println(a + " " + b + " " + c);    
	}
	
}
