package S1T6N1Ex1;

import java.util.ArrayList;

public class NoGenericMethods {
	
	//Atributs
	private String nom1;
	private String nom2;
	private String nom3;
	
	//Constructor
	public NoGenericMethods(String paraula1, String paraula2, String paraula3) {
		this.nom1 = paraula1;
		this.nom2 = paraula2;
		this.nom3 = paraula3;
	}

	//Getters
	public String getNom1() {
		return nom1;
	}

	public String getNom2() {
		return nom2;
	}

	public String getNom3() {
		return nom3;
	}

	//Setters
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}

	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}

	public void setNom3(String nom3) {
		this.nom3 = nom3;
	}

	
}
