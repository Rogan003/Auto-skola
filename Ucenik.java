package autoskola;

public class Ucenik extends Osoba {
    private int id;

    public enum Napredak {
        Teorija, Praksa
    }

    private Napredak napredak;
    private int brojCasova;
    private int brojPalihIspita;
    private boolean polozenaTeorija;
    private boolean polozenaPraksa;

    public Ucenik(String ime, String prezime, String datumRodjenja, Pol pol, Napredak napredak, int brojCasova,
            int brojPalihIspita, boolean polozenaTeorija, boolean polozenaPraksa, int id) {
        super(ime, prezime, datumRodjenja, pol);
        this.id = id;
        this.napredak = napredak;
        this.brojCasova = brojCasova;
        this.brojPalihIspita = brojPalihIspita;
        this.polozenaTeorija = polozenaTeorija;
        this.polozenaPraksa = polozenaPraksa;
    }

    public int getId() {
        return id;
    }

    public Napredak getNapredak() {
        return napredak;
    }

    public int getBrojCasova() {
        return brojCasova;
    }

    public int getBrojPalihIspita() {
        return brojPalihIspita;
    }

    public boolean getPolozenaTeorija() {
        return polozenaTeorija;
    }

    public boolean getPolozenaPraksa() {
        return polozenaPraksa;
    }

    public void polozioTeoriju() {
        polozenaTeorija = true;
    }

    public void polozioPraksu() {
        polozenaPraksa = true;
    }

    public void pao() {
        brojPalihIspita += 1;
    }

    @Override
    public String toString() {
        String pt = "Ne";
        String pp = "Ne";
        if (polozenaTeorija)
            pt = "Da";
        if (polozenaPraksa)
            pp = "Da";
        return "Ime: " + ime + "\nPrezime: " + prezime + "\nDatum rodjenja: " + datumRodjenja + "\nPol: " + pol
                + "\nID: " + id + "\nNapredak: " + napredak + "\nBroj casova: " + brojCasova + "\nBroj palih ispita"
                + brojPalihIspita + "\nPolozena teorija: " + pt + "\nPolozena praksa: " + pp + "\n";
    }
}