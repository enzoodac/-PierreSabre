package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		roro.provoquer(yaku);
		
		
		}
	
	
//	QUESTIONS : -J'AI CREEE UN getClan() DANS YAKUZA POUR PROVOQUER DE RONIN EST-CE EXACT ?
//	
//				-

}
