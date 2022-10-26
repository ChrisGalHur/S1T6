package S1T6N1Ex2;

public class Main2 {

	public static void main(String[] args) {
		/*- Exercici 2
		Crea una classe anomenada Persona amb els atributs nom, cognom i edat.
		Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric.
		Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal,
		crida el mètode genèric amb diferents tipus de paràmetres.
		Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
		D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.*/
		
		Persona yoMismo = new Persona("Christian", "Gálvez", 35);
		GenericMethods.genericMethod(yoMismo.getNom());
		GenericMethods.genericMethod(yoMismo.getCognom());
		GenericMethods.genericMethod(yoMismo.getEdad());
		
	}

}
