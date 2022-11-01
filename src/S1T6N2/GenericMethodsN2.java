package S1T6N2;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodsN2 {

	//Un m�tode generic te un par�metre de tipus (l'operador de diamant que tanca el tipus) avans del tipus de retorn de la declaraci� del m�tode
	//Els m�todes generics poden tenir diferents tipus de par�metres separats per comes a la firma del m�tode
	static <T, E> void genericMethod(T a, String b, ArrayList<E> c) {
	    System.out.println(a + " " + b + " " + c);    
	}
	
}
