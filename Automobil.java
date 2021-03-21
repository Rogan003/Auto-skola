

public class Automobil extends Vozilo{
    private int brojSedista;
    private int zapreminaGepeka;
    private int brojVrata;

    public Automobil(int brzina, String marka, String verzija, int godiste, String serijskiBroj, String boja, boolean automatik,
            int kilometraza, int rezervoar, int stanjeGoriva, Motor motor, Pneumatici pneumatici, int sedista, int gepek, int vrata) {
        super(brzina, marka, verzija, godiste, serijskiBroj, boja, automatik, kilometraza, rezervoar, stanjeGoriva, motor, pneumatici);
        this.brojSedista = sedista;
        this.zapreminaGepeka = gepek;
        this.brojVrata = vrata;
    }

    public int getbrSedista()
    {
        return brojSedista;
    }
    public int getZapreminaGepeka()
    {
        return zapreminaGepeka;
    }
    public int getbrVrata()
    {
        return brojVrata;
    }

    public enum PaketOpreme{
        nizak,srednji,visok;
       
    }

    
    
}
