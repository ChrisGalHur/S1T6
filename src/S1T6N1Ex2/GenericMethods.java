package S1T6N1Ex2;

import java.util.Collection;

public class GenericMethods {

	//Un métode generic te un parámetre de tipus (l'operador de diamant que tanca el tipus) avans del tipus de retorn de la declaració del métode
	//Els métodes generics poden tenir diferents tipus de parámetres separats per comes a la firma del métode
	static <T> void genericMethod(T a) {
	    System.out.println(a);    
	}
	
}
