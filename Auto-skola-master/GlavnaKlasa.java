package autoskola;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		/*napraviti fajl sa listom ucenika i listom instruktora, kao i nazivom, ocenom lokacije(1-5) i cenom autoskole
		ovde citati taj fajl i dati vrednosti tim promenljivim iz fajla*/
		String naziv;
		int cena;
		int lokacija;
		ArrayList<Ucenik> ucenici;
		ArrayList<Instruktor> instruktori;
		Autoskola autoskola = new Autoskola(naziv,cena,lokacija,ucenici,instruktori);
		System.out.println(autoskola);
		//ovde se malo igrati sa tim, dati da neko polaze i to...
	}

}
