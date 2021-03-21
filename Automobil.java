public class Automobil extends Vozilo{
    private int brojSedista;
    private int zapreminaGepeka;
    private int brojVrata;
    private boolean multimedija;
    public enum PaketOpreme{
        nizak,srednji,visok;
       
    }
    PaketOpreme oprema;
    Motor motor;

    public Automobil(PaketOpreme oprema, int brzina, String marka, String verzija, int godiste, String serijskiBroj, String boja, boolean automatik,
            int kilometraza, int rezervoar, int stanjeGoriva, Motor motor, Pneumatici pneumatici, int sedista, int gepek, int vrata, Motor motor2, boolean multimedija) {
        super(brzina, marka, verzija, godiste, serijskiBroj, boja, automatik, kilometraza, rezervoar, stanjeGoriva, motor, pneumatici);
        this.brojSedista = sedista;
        this.zapreminaGepeka = gepek;
        this.brojVrata = vrata;
        this.oprema = oprema;
        this.motor = motor2;
        this.multimedija = multimedija;
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
    public boolean getMultimedija()
    {
        return multimedija;
    }
    //ako neko ima neku ideju za ovo aj majke vam napise u discrod ja nisam pametan


    
    
}
