package autoskola;

public class Motor {
	private String marka;
	private String verzija;
	private int snaga;
	
	public Motor(String marka, String verzija, int snaga)
	{
		this.marka = marka;
		this.snaga = snaga;
		this.verzija = verzija;
	}
	
	public int getSnaga()
	{
		return snaga;
	}
	public String getMarka()
	{
		return marka;
	}
	public String getVerzija()
	{
		return verzija;
	}
	
	public void povecajSnagu(int snaga)
	{
		if(this.snaga + 20 > snaga && snaga > this.snaga)
			this.snaga = snaga;
		else
			System.out.println("Prevelika snaga unesena!");
	}
	
	@Override
	public String toString()
	{
		return marka + " " + verzija + "\nSnaga: " + snaga;
	}
}
