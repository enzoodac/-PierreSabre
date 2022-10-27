package histoire;

import personnages.Commerçant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.gagnerArgent(15);
		marco.boire();
	}

}
