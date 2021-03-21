import java.time.LocalDate;

public class Ucenik extends Osoba{
    private int id;
    public enum Napredak{
        Teorija, Praksa
    }
    private Napredak napredak;
    private int brojCasova;
    private int brojPalihIspita;
    private boolean polozenaTeorija;
    private boolean polozenaPraksa;
    private Instruktor instruktor;

    public Ucenik(String ime, String prezime, LocalDate datumRodjenja, Pol pol, int id, Napredak napredak, int brojCasova, int brojPalihIspita, boolean polozenaTeorija, boolean polozenaPraksa, Instruktor instruktor){
        super(ime, prezime, datumRodjenja, pol);   //lol nemam pojma da li je ovo sve sto treba i mrzi me sad da istrazujem 1 ujutru je
        this.id = id;
        this.napredak = napredak;
        this.brojCasova = brojCasova;
        this.brojPalihIspita = brojPalihIspita;
        this.polozenaTeorija = polozenaTeorija;
        this.polozenaPraksa = polozenaPraksa;
        this.instruktor = instruktor;
    }

    public int getId(){
        return id;
    }
    public Napredak getNapredak(){
        return napredak;
    }
    public int getBrojcasova(){
        return brojCasova;
    }
    public int getBrojPalihIspita(){
        return brojPalihIspita;
    }
    public boolean getPolozenaTeorija(){
        return polozenaTeorija;
    }
    public boolean getPolozenaPraksa(){
        return polozenaPraksa;
    }
    public Instruktor getInstruktor(){
        return instruktor;
    }

    //dodacu kao upisi se metod, gledace godine i tipa ako je 16 moze da udje
    // takodje metod izadji na ispit teorije i voznje, gleda sta je sve polozeno i godine ucenika

}
