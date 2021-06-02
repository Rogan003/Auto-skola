package autoskola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import autoskola.FunkcijeZaFajl;
import autoskola.Instruktor.TipInstruktora;
import autoskola.Osoba.Pol;
import autoskola.Osoba;
import autoskola.Pneumatici.tip;
import autoskola.Ucenik.Napredak;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void  main(String[] args) throws IOException {
        Scanner unosScanner = new Scanner(System.in);
        int izbor;
        int izbor2;
        FunkcijeZaFajl fajl = new FunkcijeZaFajl();
        String naziv = "NASA AUTOSKOLA";
        int cena = 80000;
        int lokacija = 5;
        ArrayList<Ucenik> ucenici = new ArrayList<Ucenik>();
        ucenici = fajl.citajUcenike();
        ArrayList<Instruktor> instruktori = new ArrayList<Instruktor>();
        instruktori = fajl.citajInstruktore();
        ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();
        vozila = fajl.citajVozila();
        Autoskola autoskola = new Autoskola(naziv, cena, lokacija, ucenici, instruktori, vozila);
        String temp;
        do {
            System.out.println("1 - Dodaj\n2 - Prikazi\n\n3 - Izadji");
            izbor = unosScanner.nextInt();
            switch (izbor) {
                case 1:
                    System.out.println(
                            "Izabrali ste dodavanje. Sta zelite da dodate?\n\n1 - Novi Ucenik\n2 - Novi Instruktor\n3 - Novo Vozilo\n\n4 - Nazad");
                    izbor2 = unosScanner.nextInt();
                    switch (izbor2) {
                        case 1:
                            String ime;
                            String prezime;
                            String datumRodjenja;
                            Pol pol;
                            Napredak napredak;
                            int brojCasova = 0;
                            int brojPalihIspita = 0;
                            boolean polozenaTeorija = false;
                            boolean polozenaPraksa = false;
                            int id;

                            System.out.println("----------DODAVANJE NOVOG UCENIKA----------");
                            System.out.println("Unesite Ime: ");
                            ime = unosScanner.nextLine();
                            System.out.println("Unesite Prezime: ");
                            prezime = unosScanner.nextLine();
                            System.out.println("Unesite id:");
                            id = unosScanner.nextInt();
                            System.out.println("Unesite Datum Rodjenja (YYYY-MM-DD)");
                            datumRodjenja = unosScanner.nextLine();
                            System.out.println("Unesite Pol (Muski, Zenski): ");
                            temp = unosScanner.nextLine();
                            pol = Pol.valueOf(temp);
                            System.out.println("Unesite Napredak (Teorija, Praksa):");
                            temp = unosScanner.nextLine();
                            napredak = Napredak.valueOf(temp);
                            Ucenik u = new Ucenik(ime, prezime, datumRodjenja, pol, napredak, brojCasova,
                                    brojPalihIspita, polozenaTeorija, polozenaPraksa, id);

                            autoskola.dodajUcenika(u);
                            break;
                        case 2:
                            String ime1;
                            String prezime1;
                            String datumRodjenja1;
                            Pol pol1;
                            int plata;
                            TipInstruktora tipInstruktora;
                            int godineStaza = 0;

                            System.out.println("----------DODAVANJE NOVOG INSTRUKTORA----------");
                            System.out.println("Unesite Ime: ");
                            ime1 = unosScanner.nextLine();
                            System.out.println("Unesite Prezime: ");
                            prezime1 = unosScanner.nextLine();
                            System.out.println("Unesite Datum Rodjenja ()");
                            datumRodjenja1 = unosScanner.nextLine();
                            System.out.println("Unesite Pol (Muski, Zenski): ");
                            temp = unosScanner.nextLine();
                            pol1 = Pol.valueOf(temp);
                            System.out.println("Unesite Platu: ");
                            plata = unosScanner.nextInt();
                            System.out.println("Unesite Tip Istruktora (Teorija, Praksa): ");
                            temp = unosScanner.nextLine();
                            tipInstruktora = TipInstruktora.valueOf(temp);
                            ArrayList<Ucenik> listaUcenika = new ArrayList<>();
                            Instruktor i = new Instruktor(ime1, prezime1, datumRodjenja1, pol1, plata, tipInstruktora,
                                    godineStaza, listaUcenika);
                            autoskola.dodajInstruktora(i);
                            break;
                        case 3:
                            int maxBrzina;
                            String marka;
                            String verzija;
                            int godiste;
                            String serijskiBroj;
                            String boja;
                            boolean automatik;
                            int kilometraza;
                            int rezervoar;
                            int stanjeGoriva = 100;

                            String motorMarka;
                            String motorVerzija;
                            int motorSnaga;
                            int motorKubikaza;
                            int motorBrCilindara;

                            int pneumaticiSirina;
                            int pneumaticiOdnosSirineIVisine;
                            String pneumaticiKonstrukcija;
                            int pneumaticiPrecnik;
                            int pneumaticiNosivost;
                            String pneumaticiIndeksBrzine;
                            float pneumaticiDubinaGazecegSloja;
                            tip pneumaticiTipGuma;

                            System.out.println("----------DODAVANJE NOVOG VOZILA----------");
                            System.out.println("Unesite Maksimalnu Brzinu: ");
                            maxBrzina = unosScanner.nextInt();
                            System.out.println("Unesite Marku: ");
                            marka = unosScanner.nextLine();
                            System.out.println("Unesite Verziju: ");
                            verzija = unosScanner.nextLine();
                            System.out.println("Unesite Godiste: ");
                            godiste = unosScanner.nextInt();
                            System.out.println("Unesite Serijski broj: ");
                            serijskiBroj = unosScanner.nextLine();
                            System.out.println("Unesite Boju: ");
                            boja = unosScanner.nextLine();
                            System.out.println("Unseite Vrstu Menjaca (true - automatik, false - manualni): ");
                            temp = unosScanner.nextLine();
                            automatik = Boolean.valueOf(temp);
                            System.out.println("Unesite Kilometrazu: ");
                            kilometraza = unosScanner.nextInt();
                            System.out.println("Unesite Velicinu Rezervoara: ");
                            rezervoar = unosScanner.nextInt();

                            System.out.println("-----UNOSENJE MOTORA-----");
                            // unosenje motora
                            System.out.println("Unesite Marku Motora: ");
                            motorMarka = unosScanner.nextLine();
                            System.out.println("Unesite Verziju Motora: ");
                            motorVerzija = unosScanner.nextLine();
                            System.out.println("Unesite Snagu Motora: ");
                            motorSnaga = unosScanner.nextInt();
                            System.out.println("Unesite Kubikazu Motora: ");
                            motorKubikaza = unosScanner.nextInt();
                            System.out.println("Unesite Broj Cilindara Motora: ");
                            motorBrCilindara = unosScanner.nextInt();

                            Motor m = new Motor(motorMarka, motorVerzija, motorSnaga, motorKubikaza, motorBrCilindara);

                            System.out.println("-----UNOSENJE PNEUMATIKA-----");
                            System.out.println("Unesite Sirinu Pneumatika: ");
                            pneumaticiSirina = unosScanner.nextInt();
                            System.out.println("Unesite Odnos Sirine I Visine Pneumatika: ");
                            pneumaticiOdnosSirineIVisine = unosScanner.nextInt();
                            System.out.println("Unesite Konstrukciju Pneumatika: ");
                            pneumaticiKonstrukcija = unosScanner.nextLine();
                            System.out.println("Unesite Precnik Pneumatika: ");
                            pneumaticiPrecnik = unosScanner.nextInt();
                            System.out.println("Unesite Nosivost Pneumatika: ");
                            pneumaticiNosivost = unosScanner.nextInt();
                            System.out.println("Unesite Indeks Brzine Pneumatika: ");
                            pneumaticiIndeksBrzine = unosScanner.nextLine();
                            System.out.println("Unesite Dubina Gazeceg Sloja Pneumatika: ");
                            pneumaticiDubinaGazecegSloja = unosScanner.nextFloat();
                            System.out.println("Unesite Tip Pneumatika (Zimski, Letnji): ");
                            temp = unosScanner.nextLine();
                            pneumaticiTipGuma = tip.valueOf(temp);

                            Pneumatici p = new Pneumatici(pneumaticiSirina, pneumaticiOdnosSirineIVisine,
                                    pneumaticiKonstrukcija, pneumaticiPrecnik, pneumaticiNosivost,
                                    pneumaticiIndeksBrzine, pneumaticiDubinaGazecegSloja, pneumaticiTipGuma);

                            Vozilo v = new Vozilo(maxBrzina, marka, verzija, godiste, serijskiBroj, boja, automatik,
                                    kilometraza, rezervoar, stanjeGoriva, m, p);

                            autoskola.dodajVozilo(v);

                            break;
                        case 4:
                            // nazad
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Izabrali ste prikazivanje.\n");
                    System.out.println(autoskola);
                    break;
                case 3:
                    System.out.println("Dovidjenja :)");
                    izbor = 5;
                    break;
            }
        } while (izbor >= 1 && izbor <= 3);
        unosScanner.close();
    }
}