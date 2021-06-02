package com.autoskola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.autoskola.FunkcijeZaFajl;
import com.autoskola.Instruktor.TipInstruktora;
import com.autoskola.Osoba.Pol;
import com.autoskola.Osoba;
import com.autoskola.Pneumatici.tip;
import com.autoskola.Ucenik.Napredak;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int main(String[] args) throws IOException {
        Scanner unosScanner = new Scanner(System.in);
        int izbor;
        int izbor2;
        int izbor3;
        int izbor4;

        String naziv = "NASA AUTOSKOLA";
        int cena = 80000;
        int lokacija = 5;
        ArrayList<Ucenik> ucenici = new ArrayList<Ucenik>();
        ArrayList<Instruktor> instruktori = new ArrayList<Instruktor>();
        ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();

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
                            Instruktor instruktor;
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

                            // RANDOM INSTRUKTOR

                            Ucenik u = new Ucenik(ime, prezime, datumRodjenja, pol, napredak, brojCasova,
                                    brojPalihIspita, polozenaTeorija, polozenaPraksa, instruktor, id);

                            autoskola.dodajUcenika(u);
                            break;
                        case 2:
                            String ime1;
                            String prezime1;
                            String datumRodjenja1;
                            Pol pol1;
                            int plata;
                            TipInstruktora tipInstruktora;
                            List<Ucenik> listaUcenika;
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

                            // RANDOM NEKOLIKO UCENIKA

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
                    System.out.println(
                            "Izabrali ste prikazivanje. Sta zelite da prikazete?\n\n1 - Prikazi Ucenike\n2 - Prikazi Instruktore\n3 - Prikazi Vozila\n\n4 - Nazad");
                    izbor2 = unosScanner.nextInt();
                    switch (izbor2) {
                        case 1:
                            System.out.println("----------PRIKAZIVANJE UCENIKA----------");
                            // citanje i ubacivanje u listu
                            List<Ucenik> uceniks = new ArrayList<Ucenik>();
                            for (int i = 0; i < uceniks.size(); i++) {
                                System.out.println(i + 1 + ". Ucenik");
                                System.out.println(uceniks.get(i).getIme());
                                System.out.println(uceniks.get(i).getPrezime());
                                System.out.println(uceniks.get(i).getDatumRodjenja());
                                System.out.println(uceniks.get(i).getPol());
                                System.out.println(uceniks.get(i).getId());
                                System.out.println(uceniks.get(i).getNapredak());
                                System.out.println(uceniks.get(i).getBrojCasova());
                                System.out.println(uceniks.get(i).getBrojPalihIspita());
                                System.out.println(uceniks.get(i).getPolozenaTeorija());
                                System.out.println(uceniks.get(i).getPolozenaPraksa());
                                System.out.println(uceniks.get(i).getInstruktor());
                                // ovo se moze ulepsati
                            }
                            System.out.println("\n\n1 - Obrisi Nekog Ucenika\n 2 - nazad");
                            izbor3 = unosScanner.nextInt();
                            switch (izbor3) {
                                case 1:
                                    System.out.println("Izaberite ucenika za brisanje: ");
                                    int indexZaBrisanje = unosScanner.nextInt();
                                    // obrisi(Ucecnik, inedxZaBrisanje - 1);
                                    break;

                                case 2:
                                    // nazad
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("----------PRIKAZIVANJE INSTRUKTORA----------");
                            // citanje i ubacivanje u listu
                            List<Instruktor> instruktors = new ArrayList<Instruktor>();
                            for (int i = 0; i < instruktors.size(); i++) {
                                System.out.println(instruktors.get(i).getIme());
                                System.out.println(instruktors.get(i).getPrezime());
                                System.out.println(instruktors.get(i).getDatumRodjenja());
                                System.out.println(instruktors.get(i).getPol());
                                System.out.println(instruktors.get(i).getPlata());
                                System.out.println(instruktors.get(i).getTipInstruktora());
                                System.out.println(instruktors.get(i).getGodineStaza());
                                System.out.println(instruktors.get(i).getArrayList());
                            }
                            System.out.println("\n\n1 - Obrisi Nekog Ucenika\n 2 - nazad");
                            izbor3 = unosScanner.nextInt();
                            switch (izbor3) {
                                case 1:
                                    System.out.println("Izaberite ucenika za brisanje: ");
                                    int indexZaBrisanje = unosScanner.nextInt();
                                    // obrisi(Instruktor, inedxZaBrisanje - 1);
                                    break;

                                case 2:
                                    // nazad
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("----------PRIKAZIVANJE VOZILA----------");
                            // citanje i ubacivanje u listu
                            List<Vozilo> vozilas = new ArrayList<Vozilo>();
                            for (int i = 0; i < vozilas.size(); i++) {
                                System.out.println(vozilas.get(i).getMaxBrzina());
                                System.out.println(vozilas.get(i).getMarka());
                                System.out.println(vozilas.get(i).getVerzija());
                                System.out.println(vozilas.get(i).getGodiste());
                                System.out.println(vozilas.get(i).getSerijskiBroj());
                                System.out.println(vozilas.get(i).getBoja());
                                System.out.println(vozilas.get(i).getAutomatik());
                                System.out.println(vozilas.get(i).getKilometraza());
                                System.out.println(vozilas.get(i).getRezervoar());
                                System.out.println(vozilas.get(i).getMotor());
                                System.out.println(vozilas.get(i).getPneumatici());
                            }
                            System.out.println("\n\n1 - Obrisi Nekog Ucenika\n 2 - nazad");
                            izbor3 = unosScanner.nextInt();
                            switch (izbor3) {
                                case 1:
                                    System.out.println("Izaberite ucenika za brisanje: ");
                                    int indexZaBrisanje = unosScanner.nextInt();
                                    // obrisi(Vozilo, inedxZaBrisanje - 1);
                                    break;

                                case 2:
                                    // nazad
                                    break;
                            }
                            break;
                        case 4:
                            // nazad
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Dovidjenja :)");
                    return 0;
            }
        } while (izbor < 1 || izbor > 3);
        unosScanner.close();
        FunkcijeZaFajl fajl = new FunkcijeZaFajl();
        fajl.NapisiUFaljl("Provera");
    }
}
