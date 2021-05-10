package autoskola;

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
        super();
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
    public int getBrojCasova(){
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
    public void polozioTeoriju()
    {
    	polozenaTeorija = true;
    }
    public void polozioPraksu()
    {
    	polozenaPraksa = true;
    }
    public void pao()
    {
    	brojPalihIspita += 1;
    }
    
    @Override
	public String toString()
	{
    	String pt = "Ne";
    	String pp = "Ne";
    	if(polozenaTeorija)
    		pt = "Da";
    	if(polozenaPraksa)
    		pp = "Da";
    	return "Ime: " + ime + "\nPrezime: " + prezime + "\nDatum rodjenja: " + datumRodjenja
    			+ "\nPol: " + pol + "\nID: " + id + "\nNapredak: " + napredak + "\nBroj casova: " + brojCasova
    			+ "\nBroj palih ispita" + brojPalihIspita + "\nPolozena teorija: " + pt + "\nPolozena praksa: "
    			+ pp + "\nInstruktor: " + instruktor + "\n";
	}

    //dodacu kao upisi se metod, gledace godine i tipa ako je 16 moze da udje
    // takodje metod izadji na ispit teorije i voznje, gleda sta je sve polozeno i godine ucenika

}
