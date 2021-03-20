import java.sql.Date;
import java.time.LocalDate;

public class Osoba {
    private String ime;
    private String prezime;
    private LocalDate datumRodjenja; // treba jos da skontam kako radi Date type
    private int godine;

    public enum Pol {
        Muski, Zenski
    }

    Pol pol;

    public Vozilo(String ime, String prezime, String datumRodjenja, Pol pol, int godine){
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        this.godine = godine;
    }

    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public LocalDate getDatumRodjenja(){
        return datumRodjenja;
    }
    public Pol getPol(){
        return pol;
    }

    public int getGodine(LocalDate datumRodjenja, LocalDate danasnjiDatum){
        return Period.between(datumRodjenja, danasnjiDatum).getYears();
        
    }
}
