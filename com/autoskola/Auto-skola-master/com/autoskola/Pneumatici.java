package com.autoskola;

public class Pneumatici {
	private int sirina;
	private int odnosSirineIVisine;
	private String konstrukcija;
	private int precnik;
	private int nosivost;
	private String indeksBrzine;
	private float dubinaGazecegSloja;

	public enum tip {
		Zimski, Letnji
	}

	tip Tip;

	public Pneumatici(int sirina, int odnosSirineIVisine, String konstrukcija, int precnik, int nosivost,
			String indeksBrzine, float dubinaGazecegSloja, tip Tip) {
		this.sirina = sirina;
		this.odnosSirineIVisine = odnosSirineIVisine;
		this.konstrukcija = konstrukcija;
		this.precnik = precnik;
		this.nosivost = nosivost;
		this.indeksBrzine = indeksBrzine;
		this.dubinaGazecegSloja = dubinaGazecegSloja;
		this.Tip = Tip;
	}

	public int getSirina() {
		return sirina;
	}

	public int getOdnosSirineIVisine() {
		return odnosSirineIVisine;
	}

	public String getKonstrukcija() {
		return konstrukcija;
	}

	public int getPrecnik() {
		return precnik;
	}

	public int getNosivost() {
		return nosivost;
	}

	public String getIndeksBrzine() {
		return indeksBrzine;
	}

	public float getDubinaGazecegSloja() {
		return dubinaGazecegSloja;
	}

	public String getTip() {
		if (Tip == tip.Letnji)
			return "Letnji";
		else
			return "Zimski";
	}

	public void promeniTip(tip Tip) {
		if (this.Tip != Tip)
			this.Tip = Tip;
		else
			System.out.println("Taj tip je vec aktivan!");
	}

	@Override
	public String toString() {
		return sirina + " " + odnosSirineIVisine + " " + konstrukcija + " " + precnik + " " + nosivost + " "
				+ indeksBrzine + " " + dubinaGazecegSloja + " " + getTip();
	}
}
