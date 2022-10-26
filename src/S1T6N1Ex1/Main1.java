package S1T6N1Ex1;

public class Main1 {

	public static void main(String[] args) {
		/*- Exercici 1
		Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
		juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
		Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.*/
		
		NoGenericMethods primer = new NoGenericMethods("Juanito", "Jorgito", "Jaimito");
		NoGenericMethods segon = new NoGenericMethods("Jaimito", "Juanito", "Jorgito");
		
		System.out.println(primer.getNom1() + primer.getNom2() + primer.getNom3());
		System.out.println(segon.getNom1() + segon.getNom2() + segon.getNom3());
		
		
	}

}
