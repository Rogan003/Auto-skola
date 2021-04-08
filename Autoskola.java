package autoskola;

import java.time.LocalDate;

import autoskola.Osoba.Pol;
import autoskola.Ucenik.Napredak;
import java.lang.Math; 

public class Autoskola {
	private int cena;
	private int lokacija;
	private Ucenik[] ucenici;//treba lista, a ne niz... :(
	private Instruktor[] instruktori;
	
	public Autoskola(int cena, int lokacija, Ucenik[] ucenici, Instruktor[] instruktori)
	{
		this.cena = cena;
		this.lokacija = lokacija;
		this.ucenici = new Ucenik[ucenici.length];
		this.ucenici = ucenici;//ako radi odlicno, ako ne kod ispod
		this.instruktori = new Instruktor[instruktori.length];
		this.instruktori = instruktori;//isto kao i za ucenike
		/*
		for(int i = 0;i < ucenici.length;++i)
		{
			this.ucenici[i] = new Ucenik(ucenici[i].getIme(), ucenici[i].getPrezime(), ucenici[i].getDatumRodjenja(), ucenici[i].getPol(), ucenici[i].getId(), ucenici[i].getNapredak(), ucenici[i].getBrojCasova(), ucenici[i].getBrojPalihIspita(), ucenici[i].getPolozenaTeorija(), ucenici[i].getPolozenaPraksa(), ucenici[i].getInstruktor());			
		}
		*/
	}
	
	int getCena()
	{
		return cena;
	}
	int getLokacija()
	{
		return lokacija;
	}
	//geteri za ucenici i instruktori?
	//dodaj instruktora i ucenika
	
	void polaganjeTeorije(int kolicina)
	{
		for(int i = 0;i < kolicina;++i)
		{
			if(Math.random() * 10 + 1 < 8)
				ucenici[i].polozioTeoriju();
			else
				ucenici[i].pao();
		}
	}
	void polaganjePrakse()
	{
		double tezina = Math.random() * 3 + 1; //1-strogi, 2-srednje, 3-popustljivi
		if(Math.random() * 10 + 1 < 5 + tezina)
		{
			ucenici[0].polozioPraksu();
			//izbaciti ga iz liste ucenika i svih ostalih listi
		}
		else
			ucenici[0].pao();
	}
}
