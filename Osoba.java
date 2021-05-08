package autoskola;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    protected String ime;
    protected String prezime;
    protected LocalDate datumRodjenja; // treba jos da skontam kako radi Date type
    

    public enum Pol {
        Muski, Zenski;
    }

    Pol pol;

    public Osoba(String ime, String prezime, LocalDate datumRodjenja, Pol pol){
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        
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
