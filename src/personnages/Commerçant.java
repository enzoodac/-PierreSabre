package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);

	}

	public int seFaireExtorquer() {
		int oldArgent = getArgent();
		perdreArgent(getArgent());
		System.out.println("J'ai tout perdu ! Le monde est trop injuste...");
		return oldArgent;
	}

}
