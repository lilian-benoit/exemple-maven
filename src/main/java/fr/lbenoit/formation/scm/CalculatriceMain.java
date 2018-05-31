package fr.lbenoit.formation.scm;

public class CalculatriceMain {

	public static void main(String[] args) {
		Calculatrice calculette = new Calculatrice();
		
		long nb1 = 5;
		long nb2 = 3;
		
		long resultat = calculette.addition(nb1, nb2);
		System.out.println("> " + nb1 + " + " + nb2 + " = " + resultat);
	}

}
