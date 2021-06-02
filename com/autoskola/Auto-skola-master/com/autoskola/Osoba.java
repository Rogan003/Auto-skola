package com.autoskola;

public class Osoba {
    protected String ime;
    protected String prezime;
    protected String datumRodjenja;

    public enum Pol {
        Muski, Zenski;
    }

    Pol pol;

    public Osoba(String ime, String prezime, String datumRodjenja, Pol pol) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;

    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public Pol getPol() {
        return pol;
    }
}
