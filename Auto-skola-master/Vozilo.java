package autoskola;

public class Vozilo {
	protected int maxBrzina;
	protected String marka;
	protected String verzija;
	protected int godiste;
	protected String serijskiBroj;
	protected String boja;
	protected boolean automatik;
	protected int kilometraza;
	protected int rezervoar;
	protected int stanjeGoriva;
	protected Motor motor;
	protected Pneumatici pneumatici;
	
	public Vozilo(int brzina, String marka, String verzija, int godiste, String serijskiBroj, String boja, boolean automatik, int kilometraza, int rezervoar, int stanjeGoriva, Motor motor, Pneumatici pneumatici)
	{
		this.maxBrzina = brzina;
		this.marka = marka;
		this.verzija = verzija;
		this.godiste = godiste;
		this.serijskiBroj = serijskiBroj;
		this.boja = boja;
		this.automatik = automatik;
		this.kilometraza = kilometraza;
		this.rezervoar = rezervoar;
		this.stanjeGoriva = stanjeGoriva;
		this.motor = motor; //ako treba redefinisati equals
		this.pneumatici = pneumatici;
	}
	

	public int getMaxBrzina()
	{
		return maxBrzina;
	}
	public String getMarka()
	{
		return marka;
	}
	public String getVerzija()
	{
		return verzija;
	}
	public int getGodiste()
	{
		return godiste;
	}
	public String getSerijskiBroj()
	{
		return serijskiBroj;
	}
	public String getBoja()
	{
		return boja;
	}
	public String getAutomatik()
	{
		if(automatik)
			return "Da";
		else 
			return "Ne";
	}
	public int getKilometraza()
	{
		return kilometraza;
	}
	public int getRezervoar()
	{
		return rezervoar;
	}
	public int getStanjeGoriva()
	{
		return stanjeGoriva;
	}
	public Motor getMotor()
	{
		return motor;
	}
	public Pneumatici getPneumatici()
	{
		return pneumatici;
	}
	
	public void vozi(int presli, int potrosili)
	{
		this.kilometraza += presli;
		this.stanjeGoriva -= potrosili; //generisati gresku ako je manje od stanjaGoriva
	}
	public void promeniBoju(String boja)
	{
		this.boja = boja; //generisati gresku ako je ista boja npr
	}
	
	@Override
	public String toString()
	{
		return "Marka: " + marka + " Verzija: " + verzija + " Godiste: " + godiste + " Serijski broj: " + serijskiBroj
				+ "\nBoja: " + boja + " Automatik: " + getAutomatik()
				+ "\nKilometraza: " + kilometraza
				+ "\nRezervoar: " + rezervoar + " Stanje goriva: " + stanjeGoriva
				+ "\nMotor:\n" + motor
				+ "\nPneumatici:\n" + pneumatici;
	}
}
