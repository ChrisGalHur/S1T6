package S1T6N1Ex2;

import java.util.Collection;

public class GenericMethods {

	//Un m�tode generic te un par�metre de tipus (l'operador de diamant que tanca el tipus) avans del tipus de retorn de la declaraci� del m�tode
	//Els m�todes generics poden tenir diferents tipus de par�metres separats per comes a la firma del m�tode
	static <T> void genericMethod(T a) {
	    System.out.println(a);    
	}
	
}
