package personnages;

import java.security.PublicKey;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);

	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
		}
	
	
	}
	public void gagnerArgent(int gain) {
		argent += gain;
		System.out.println(gain + " sous ! Je te remercie généreux donateur !");
		
	}
	public void perdreArgent(int perte) {
		if (argent < perte) {
			argent = 0;
		}else
		{
			argent-=perte;
		}
	}
}
