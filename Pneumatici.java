package autoskola;

public class Pneumatici {
	private int sirina;
	private int odnosSirineIVisine;
	private String konstrukcija;
	private int precnik;
	private int nosivost;
	private String indeksBrzine;
	private float dubinaGazecegSloja;
	public enum tip
	{
		Zimski, Letnji
	}
	tip Tip;
	
	public Pneumatici(int sirina, int odnosSirineIVisine, String konstrukcija, int precnik, int nosivost, String indeksBrzine, float dubinaGazecegSloja, tip Tip)
	{
		this.sirina = sirina;
		this.odnosSirineIVisine = odnosSirineIVisine;
		this.konstrukcija = konstrukcija;
		this.precnik = precnik;
		this.nosivost = nosivost;
		this.indeksBrzine = indeksBrzine;
		this.dubinaGazecegSloja = dubinaGazecegSloja;
		this.Tip = Tip;
	}
	
	int getSirina()
	{
		return sirina;
	}
	int getOdnosSirineIVisine()
	{
		return odnosSirineIVisine;
	}
	String getKonstrukcija()
	{
		return konstrukcija;
	}
	int getPrecnik()
	{
		return precnik;
	}
	int getNosivost()
	{
		return nosivost;
	}
	String getIndeksBrzine()
	{
		return indeksBrzine;
	}
	float getDubinaGazecegSloja()
	{
		return dubinaGazecegSloja;
	}
	String getTip()
	{
		if(Tip == tip.Letnji)
			return "Letnji";
		else
			return "Zimski";
	}
	
	void promeniTip(tip Tip)
	{
		if(this.Tip != Tip)
			this.Tip = Tip;
		else
			System.out.println("Taj tip je vec aktivan!");
	}
}
