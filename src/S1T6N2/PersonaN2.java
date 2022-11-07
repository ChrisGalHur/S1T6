package S1T6N2;

public class PersonaN2 {

	private String nom;
	private String cognom;
	private int edad;
	
	//Constructor
	public PersonaN2(String nom, String cognom, int edad) {
		this.nom = nom;
		this.cognom = cognom;
		this.edad = edad;
	}
	
	//Getters
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCognom() {
		return cognom;
	}
	
	//Setters
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "PersonaN2 [nom=" + nom + ", cognom=" + cognom + ", edad=" + edad + "]";
	}
	
	
}
