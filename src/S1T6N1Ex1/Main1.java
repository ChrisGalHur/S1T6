package S1T6N1Ex1;

public class Main1 {

	public static void main(String[] args) {
		/*- Exercici 1
		Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
		juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
		Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.*/
		
		Nebots primer = new Nebots("Juanito", "Jorgito", "Jaimito");
		Nebots segon = new Nebots("Jaimito", "Juanito", "Jorgito");
		Nebots tercer = new Nebots("Juanito","Jaimito", "Jorgito");
		
		NoGenericMethods.imprimeix(primer, segon, tercer);
		
		
	}

}
