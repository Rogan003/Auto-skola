package autoskola;

public class Motor {
	private int trenutniObrtaji = 0;
	private String marka;
	private String verzija;
	private int snaga;
	private int kubikaza;
	private int brCilindara;
	
	public Motor(String marka, String verzija, int snaga, int kubikaza, int brCilindara)
	{
		this.marka = marka;
		this.snaga = snaga;
		this.verzija = verzija;
		this.kubikaza = kubikaza;
		this.brCilindara = brCilindara;
	}
	
	public int getTrenutniObrtaji()
	{
		return trenutniObrtaji;
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
	public int getKubikaza()
	{
		return kubikaza;
	}
	public int getbrCilindara()
	{
		return brCilindara;
	}
	public void setObrtaji(int O)
	{
		this.trenutniObrtaji = O;
	}

	public void chipTuning(int snaga)
	{
		if(this.snaga + 20 > snaga && snaga > this.snaga)
			this.snaga = snaga;
		else
			System.out.println("Prevelika snaga unesena!");
	}
	public void upaliMotor()
	{
		setObrtaji(1500);
	}
	
	@Override
	public String toString()
	{
		return marka + " " + verzija + "\nSnaga: " + snaga + " \nKubikaza: " + kubikaza + "\nCilindri:" + brCilindara;
	}
}
