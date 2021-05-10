

import java.util.ArrayList;
import java.lang.Math; 

public class Autoskola {
	private String naziv;
	private int cena;
	private int lokacija;
	private ArrayList<Ucenik> ucenici;
	private ArrayList<Instruktor> instruktori;
	
	public Autoskola(String naziv, int cena, int lokacija, ArrayList<Ucenik> ucenici, ArrayList<Instruktor> instruktori)
	{
		this.naziv = naziv;
		this.cena = cena;
		this.lokacija = lokacija;
		this.ucenici = new ArrayList<Ucenik>();
		this.ucenici = ucenici;
		this.instruktori = new ArrayList<Instruktor>();
		this.instruktori = instruktori;
		/*
		for(int i = 0;i < ucenici.length;++i)
		{
			this.ucenici[i] = new Ucenik(ucenici[i].getIme(), ucenici[i].getPrezime(), ucenici[i].getDatumRodjenja(), ucenici[i].getPol(), ucenici[i].getId(), ucenici[i].getNapredak(), ucenici[i].getBrojCasova(), ucenici[i].getBrojPalihIspita(), ucenici[i].getPolozenaTeorija(), ucenici[i].getPolozenaPraksa(), ucenici[i].getInstruktor());			
		}
		*/
	}
	
	String getNaziv()
	{
		return naziv;
	}
	int getCena()
	{
		return cena;
	}
	int getLokacija()
	{
		return lokacija;
	}

	void dodajInstruktora(Instruktor instruktor)
	{
		instruktori.add(instruktor);
	}
	
	void dodajUcenika(Ucenik ucenik)
	{
		ucenici.add(ucenik);
	}
	
	void polaganjeTeorije(int kolicina)
	{
		for(int i = 0;i < kolicina;++i)
		{
			if(Math.random() * 10 + 1 < 8)
				ucenici.get(i).polozioTeoriju();
			else
				ucenici.get(i).pao();
		}
	}
	void polaganjePrakse()
	{
		double tezina = Math.random() * 3 + 1; //1-strogi, 2-srednje, 3-popustljivi
		if(Math.random() * 10 + 1 < 5 + tezina)
		{
			ucenici.get(0).polozioPraksu();
			ucenici.remove(0);
		}
		else
			ucenici.get(0).pao();
	}
	
	@Override
	public String toString()
	{
		String nesto = "";
		nesto += "Naziv: " + naziv + "\n";
		nesto += "Lokacija: " + lokacija + "\n";
		nesto += "Cena: " + cena + "\n";
		for(Ucenik ucenik:ucenici)
		{
			nesto += ucenik + "\n";
		}
		for(Instruktor instruktor:instruktori)
		{
			nesto += instruktor + "\n";
		}
		return nesto;
	}
}
