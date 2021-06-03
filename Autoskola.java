package autoskola;

import java.util.ArrayList;

import java.lang.Math;

public class Autoskola {
	private String naziv;
	private int cena;
	private int lokacija;
	private ArrayList<Ucenik> ucenici;
	private ArrayList<Instruktor> instruktori;
	private ArrayList<Vozilo> vozila;

	public Autoskola(String naziv, int cena, int lokacija, ArrayList<Ucenik> ucenici, ArrayList<Instruktor> instruktori,
			ArrayList<Vozilo> vozila) {
		this.naziv = naziv;
		this.cena = cena;
		this.lokacija = lokacija;
		this.ucenici = new ArrayList<Ucenik>();
		this.ucenici = ucenici;
		this.instruktori = new ArrayList<Instruktor>();
		this.instruktori = instruktori;
		this.vozila = new ArrayList<Vozilo>();
		this.vozila = vozila;

		/*
		 * for(int i = 0;i < ucenici.length;++i) { this.ucenici[i] = new
		 * Ucenik(ucenici[i].getIme(), ucenici[i].getPrezime(),
		 * ucenici[i].getDatumRodjenja(), ucenici[i].getPol(), ucenici[i].getId(),
		 * ucenici[i].getNapredak(), ucenici[i].getBrojCasova(),
		 * ucenici[i].getBrojPalihIspita(), ucenici[i].getPolozenaTeorija(),
		 * ucenici[i].getPolozenaPraksa(), ucenici[i].getInstruktor()); }
		 */
	}

	String getNaziv() {
		return naziv;
	}

	int getCena() {
		return cena;
	}

	int getLokacija() {
		return lokacija;
	}

	void dodajInstruktora(Instruktor instruktor) {
		instruktori.add(instruktor);
	}

	void dodajUcenika(Ucenik ucenik) {
		ucenici.add(ucenik);
	}

	void dodajVozilo(Vozilo vozilo) {
		vozila.add(vozilo);
	}
	
	Instruktor getInstruktor(int i) {
		return instruktori.get(i - 1);
	}
	Ucenik getUcenik(int i) {
		return ucenici.get(i - 1);
	}
	Vozilo getVozilo(int i) {
		return vozila.get(i - 1);
	}
	
	int getDuzinaInstruktora() {
		return instruktori.size();
	}
	
	int brojUcenikaKojiNisuPoloziliTeoriju()
	{
		int number = 0;
		for(int i = 0;i < ucenici.size();++i)
		{
			if(!(ucenici.get(i).getPolozenaTeorija()))
				++number;
		}
		return number;
	}
	
	void polaganjeTeorije(int kolicina) {
		int i = 0;
		if(kolicina <= this.brojUcenikaKojiNisuPoloziliTeoriju()) {
			for (int j = 0; i < kolicina; ++j) {
				if(!(ucenici.get(j).getPolozenaTeorija())) {
					if (Math.random() * 10 + 1 < 8) {
						ucenici.get(j).polozioTeoriju();
						System.out.println(ucenici.get(j).getIme() + " " + ucenici.get(j).getPrezime() + " je polozio!");
					}
					else {
						ucenici.get(j).pao();
						System.out.println(ucenici.get(j).getIme() + " " + ucenici.get(j).getPrezime() + " nije polozio!");
					}
					++i;
				}
			}
		}
	}

	void polaganjePrakse() {
		int index = 0;
		while(index < ucenici.size())
		{
			if(!(ucenici.get(index).getPolozenaTeorija()))
				++index;
			else
				break;
		}
		if(index < ucenici.size()) {
			double tezina = Math.random() * 3 + 1; // 1-strogi, 2-srednje, 3-popustljivi
			if (Math.random() * 10 + 1 < 5 + tezina) {
				ucenici.get(index).polozioPraksu();
				System.out.println(ucenici.get(index).getIme() + " " + ucenici.get(index).getPrezime() + " je polozio!");
				ucenici.remove(index);
			} else {
				ucenici.get(index).pao();
				System.out.println(ucenici.get(index).getIme() + " " + ucenici.get(index).getPrezime() + " nije polozio!");
			}
		}
		else
			System.out.println("Nijedan od ucenika nema polozenu teoriju!");
	}

	@Override
	public String toString() {
		String nesto = "";
		nesto += "Naziv: " + naziv + "\n";
		nesto += "Lokacija: " + lokacija + "\n";
		nesto += "Cena: " + cena + "\n";
		for (Ucenik ucenik : ucenici) {
			nesto += ucenik + "\n";
		}
		for (Instruktor instruktor : instruktori) {
			nesto += instruktor + "\n";
		}
		for (Vozilo vozilo : vozila) {
			nesto += vozilo + "\n";
		}
		return nesto;

	}
}