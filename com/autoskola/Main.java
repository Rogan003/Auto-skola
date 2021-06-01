package com.autoskola;


import java.util.Scanner;


import com.autoskola.Instruktor.TipInstruktora;

import com.autoskola.Osoba.Pol;



import java.io.IOException;

import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
      /*  Scanner unosScanner = new Scanner(System.in);
        int izbor;
        int izbor2;
        do {
            System.out.println("1 - Dodaj\n2 - Prikazi3 - Izmeni\n\n4 - Izadji");
            izbor = unosScanner.nextInt();

            switch (izbor) {
                case 1:
                    System.out.println("Izabrali ste dodavanje. Sta zelite da dodate?\n\n1 - Novi Ucenik\n2 - Novi Instruktor\n3 - Novo Vozilo\n\n4 - Nazad");
                    izbor2 = unosScanner.nextInt();
                    switch (izbor2) {
                        case 1:
                            String ime;
                            String prezime;
                            LocalDate datumRodjenja;
                            Pol pol;

                            System.out.println("----------DODAVANJE NOVOG UCENIKA----------");
                            System.out.println("Unesite Ime: ");
                            ime = unosScanner.nextLine();
                            System.out.println("Unesite Prezime: ");
                            prezime = unosScanner.nextLine();
                            System.out.println("Unesite Datum Rodjenja ()");
                            //datumRodjenja = unosScanner.   moram da nadjem koji scanner da koristim
                            //pol = unosScanner.             isto

                            //dodajUcenika();
                            break;
                        case 2:
                            String ime1;
                            String prezime1;
                            LocalDate datumRodjenja1;
                            Pol pol1;
                            int plata;
                            TipInstruktora tipInstruktora;
                            List<Ucenik> listaUcenika;

                            System.out.println("----------DODAVANJE NOVOG INSTRUKTORA----------");
                            System.out.println("Unesite Ime: ");
                            ime1 = unosScanner.nextLine();
                            System.out.println("Unesite Prezime: ");
                            prezime1 = unosScanner.nextLine();
                            System.out.println("Unesite Datum Rodjenja ()");
                            //datumRodjenja = unosScanner.   moram da nadjem koji scanner da koristim
                            System.out.println("Unesite Pol (Muski, Zenski): ");
                            //pol = unosScanner.             isto
                            System.out.println("Unesite Platu: ");
                            plata = unosScanner.nextInt();
                            System.out.println("Unesite Tip Istruktora (Teorija, Praksa): ");
                            //tipInstruktora = unosScanner.   enum glupi
                            System.out.println("Unesite Ucenike ovog Instruktora: ");
                            //list.add() ovo cu kasniije treba da napravim celu petlju

                            //dodajInstruktora();
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
                            Motor motor;
                            Pneumatici pneumatici;

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
                            
                            System.out.println("Unesite Kilometrazu: ");
                            System.out.println("Unesite Velicinu Rezervoara: ");
                            System.out.println("-----UNOSENJE MOTORA-----");
                            System.out.println("-----UNOSENJE PNEUMATIKA-----");
                            
                            
                            break;
                        case 4:

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Izabrali ste prikazivanje. Sta zelite da prikazete?\n\n1 - Prikazi Ucenike\n2 - Prikazi Instruktore\n3 - Prikazi Vozila\n\n4 - Nazad");
                    izbor2 = unosScanner.nextInt();
                    switch (izbor2) {
                        case 1:
                            
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }
                    break;
                case 3:
                    System.out.println("Izabrali ste pizmenjivanje. Sta zelite da izmenite?\n\n1 - Izmeni Ucenika\n2 - Izmeni Instruktora\n3 - Izmeni Vozilo\n\n4 - Nazad");
                    izbor2 = unosScanner.nextInt();
                    switch (izbor2) {
                        case 1:
                            
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }
                    break;
                case 4:
                    System.out.println("Dovidjenja :)");
                    return;
            }
            unosScanner.close();
        } while ( izbor < 1 || izbor > 4);*/
        
        FunkcijeZaFajl fajl = new FunkcijeZaFajl();
        
        List<Ucenik> lista = fajl.citajUcenike();
        

    }
}
