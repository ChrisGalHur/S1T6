package S1T6N1Ex2;

public class Main2 {

	public static void main(String[] args) {
		/*- Exercici 2
		Crea una classe anomenada Persona amb els atributs nom, cognom i edat.
		Despr�s crea una classe anomenada GenericMethods amb un m�tode gen�ric que accepti tres arguments de tipus gen�ric.
		Aquest m�tode nom�s ha d�imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal,
		crida el m�tode gen�ric amb diferents tipus de par�metres.
		Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
		D�aquesta manera has comprovat que se li pot passar qualsevol tipus de par�metre i en qualsevol ordre.*/
		
		Persona yoMismo = new Persona("Christian", "G�lvez", 35);
		GenericMethods.genericMethod(yoMismo.getNom());
		GenericMethods.genericMethod(yoMismo.getCognom());
		GenericMethods.genericMethod(yoMismo.getEdad());
		
	}

}
