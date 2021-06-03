package autoskola;

import java.util.ArrayList;
import java.util.List;

public class Instruktor extends Osoba {
    private int plata;

    public enum TipInstruktora {
        Teorija, Praksa
    }

    private TipInstruktora tipInstruktora;
    private int godineStaza;
    ArrayList<Ucenik> listaUcenika = new ArrayList<Ucenik>();

    public Instruktor(String ime, String prezime, String datumRodjenja, Pol pol, int plata,
            TipInstruktora tipInstruktora, int godineStaza, ArrayList<Ucenik> listaUcenika) {
        super(ime, prezime, datumRodjenja, pol);
        this.plata = plata;
        this.tipInstruktora = tipInstruktora;
        this.godineStaza = godineStaza;
        this.listaUcenika = listaUcenika;
    }

    public int getPlata() {
        return plata;
    }

    public TipInstruktora getTipInstruktora() {
        return tipInstruktora;
    }

    public int getGodineStaza() {
        return godineStaza;
    }

    public ArrayList<Ucenik> getArrayList() {
        return listaUcenika;
    }

    public void dodajUcenika(Ucenik ucenik) {
        listaUcenika.add(ucenik);
    }

    @Override
    public String toString() {
        String tip;
        if (tipInstruktora == TipInstruktora.Teorija)
            tip = "Teorija";
        else
            tip = "Praksa";
        return "Ime: " + ime + "\nPrezime: " + prezime + "\nDatum rodjenja: " + datumRodjenja + "\nPol: " + pol
                + "\nPlata: " + plata + "\nTip instruktora: " + tip + "\nGodine staza: " + godineStaza;
    }
    
    public boolean equals(Instruktor i) {
    	if(this.ime.equals(i.getIme()) && this.prezime.equals(i.getPrezime()) && this.datumRodjenja.equals(i.getDatumRodjenja()) &&
    		this.pol == i.getPol() && this.plata == i.getPlata() &&
            this.tipInstruktora == i.getTipInstruktora() && this.godineStaza == i.getGodineStaza())
    		return true;
    	return false;
    }

}