package autoskola;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import autoskola.Instruktor.TipInstruktora;
import autoskola.Osoba.Pol;
import autoskola.Ucenik.Napredak;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

public class FunkcijeZaFajl {

    FunkcijeZaFajl() throws IOException {

    }

    ArrayList<Ucenik> citajUcenike() throws FileNotFoundException {
        File Fajl = new File("E:\\Skola\\OOP\\Zadaci\\autoskola\\src\\autoskola\\informacije.txt");
        Scanner citac = new Scanner(Fajl);
        ArrayList<Ucenik> lista = new ArrayList<>();
        String[] obj;
        while (citac.hasNextLine()) {
            String data = citac.nextLine();
            obj = data.split("/");
            Osoba.Pol p;
            if (obj[0].equals("Ucenik")) {
                if (obj[5].equals("Muski")) {
                    p = Osoba.Pol.Muski;
                } else {
                    p = Osoba.Pol.Zenski;
                }
                Ucenik.Napredak n;
                if (obj[5].equals("Teorija")) {
                    n = Ucenik.Napredak.Teorija;
                } else {
                    n = Ucenik.Napredak.Praksa;
                }
                boolean teor;
                if (obj[9].equals("true")) {
                    teor = true;
                } else {
                    teor = false;
                }
                boolean prak;
                if (obj[10].equals("true")) {
                    prak = true;
                } else {
                    prak = false;
                }
                int id = Integer.parseInt(obj[1]);
                int brc = Integer.parseInt(obj[7]);
                int brp = Integer.parseInt(obj[8]);
                Ucenik x = new Ucenik(obj[2], obj[3], obj[4], p, n, brc, brp, teor, prak, id);
                lista.add(x);
            }
        }
        citac.close();
        return lista;
    }

    ArrayList<Instruktor> citajInstruktore() throws FileNotFoundException {
        File Fajl = new File("E:\\Skola\\OOP\\Zadaci\\autoskola\\src\\autoskola\\informacijeInstruktori.txt");
        Scanner citac = new Scanner(Fajl);
        ArrayList<Instruktor> lista = new ArrayList<>();
        String[] obj;
        while (citac.hasNextLine()) {
            String data = citac.nextLine();
            obj = data.split("/");
            Osoba.Pol p;
            if (obj[0].equals("Instruktor")) {
                if (obj[4].equals("Muski")) {
                    p = Osoba.Pol.Muski;
                } else {
                    p = Osoba.Pol.Zenski;
                }
                Instruktor.TipInstruktora tip;
                if (obj[6].equals("Teorija")) {
                    tip = Instruktor.TipInstruktora.Teorija;// !!!!!!
                } else {
                    tip = Instruktor.TipInstruktora.Praksa;
                }
                ArrayList<Ucenik> ucenici = new ArrayList<>();
                ArrayList<Ucenik> sviUcenici = new ArrayList<>();
                sviUcenici = this.citajUcenike();
                String[] obj1 = obj[8].split("_");
                int i = 0;
                while (i < obj1.length) {
                    int f = Integer.parseInt(obj1[i]);
                    ucenici.add(sviUcenici.get(f));
                    ++i;
                }
                int pl = Integer.parseInt(obj[5]);
                int gs = Integer.parseInt(obj[7]);
                Instruktor x = new Instruktor(obj[1], obj[2], obj[3], p, pl, tip, gs, ucenici);
                lista.add(x);
            }
        }
        citac.close();
        return lista;
    }

    ArrayList<Vozilo> citajVozila() throws FileNotFoundException {
        File Fajl = new File("E:\\Skola\\OOP\\Zadaci\\autoskola\\src\\autoskola\\informacijeVozila.txt");
        Scanner citac = new Scanner(Fajl);
        ArrayList<Vozilo> lista = new ArrayList<>();
        String[] obj;
        while (citac.hasNextLine()) {
            String data = citac.nextLine();
            obj = data.split("/");
            int j1 = Integer.parseInt(obj[2]);
            int j2 = Integer.parseInt(obj[3]);
            int j3 = Integer.parseInt(obj[4]);
            Motor m = new Motor(obj[0], obj[1], j1, j2, j3);// !!!!!!
            int j4 = Integer.parseInt(obj[5]);
            int j5 = Integer.parseInt(obj[6]);
            int j6 = Integer.parseInt(obj[8]);
            int j7 = Integer.parseInt(obj[9]);
            int j8 = Integer.parseInt(obj[11]);
            Pneumatici.tip t;
            if (obj[12].equals("Zimski")) {
                t = Pneumatici.tip.Zimski;
            } else {
                t = Pneumatici.tip.Letnji;
            }
            Pneumatici p = new Pneumatici(j4, j5, obj[7], j6, j7, obj[10], j8, t);// !!!!
            int i1 = Integer.parseInt(obj[13]);
            int i2 = Integer.parseInt(obj[16]);
            int i3 = Integer.parseInt(obj[20]);
            int i4 = Integer.parseInt(obj[21]);
            int i5 = Integer.parseInt(obj[22]);
            boolean b;
            if (obj[19].equals(true)) {
                b = true;
            } else {
                b = false;
            }
            Vozilo x = new Vozilo(i1, obj[14], obj[15], i2, obj[17], obj[18], b, i3, i4, i5, m, p);
            lista.add(x);
        }
        citac.close();
        return lista;
    }

    void pisiUcenika(ArrayList<Ucenik> u) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("informacije.txt");
        int i = 0;
        while (i < u.size()) {
            int id = u.get(i).getId();
            String p, n;
            if (u.get(i).pol == Pol.Muski) {
                p = "Muski";
            } else {
                p = "Zenski";
            }
            if (u.get(i).getNapredak() == Napredak.Teorija) {
                n = "Teorija";
            } else {
                n = "Praksa";
            }
            pw.write("Ucenik/" + id + "/" + u.get(i).ime + "/" + u.get(i).prezime + "/" + u.get(i).datumRodjenja + "/"
                    + p + "/" + n + "/" + u.get(i).getBrojCasova() + "/" + u.get(i).getBrojPalihIspita() + "/"
                    + u.get(i).getPolozenaTeorija() + "/" + u.get(i).getPolozenaPraksa() + "\n");
        }
        pw.close();
    }

    void pisiInstruktora(ArrayList<Instruktor> u) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("informacijeInstruktori.txt");
        int i = 0;
        while (i < u.size()) {
            String p, n;
            if (u.get(i).pol == Pol.Muski) {
                p = "Muski";
            } else {
                p = "Zenski";
            }
            if (u.get(i).getTipInstruktora() == TipInstruktora.Teorija) {
                n = "Teorija";
            } else {
                n = "Praksa";
            }
            pw.write("Instruktor/" + u.get(i).ime + "/" + u.get(i).prezime + "/" + u.get(i).datumRodjenja + "/" + p
                    + "/" + u.get(i).getPlata() + "/" + n + "/" + u.get(i).getGodineStaza() + "/" + "\n");
            int [] indexi = new int[u.get(i).listaUcenika.size()];
            //jako komplikovano za odraditi sad
        	//treba izvuci sve ucenike i njima gledati da li im je ovo instruktor
            for (Integer uc : indexi) {
                pw.write(uc + "*");
            }
        }
        pw.close();
    }

    void pisiVozilo(ArrayList<Vozilo> u) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("informacijeInstruktori.txt");
        int i = 0;
        while (i < u.size()) {
            pw.write(u.get(i).motor.getMarka() + "/" + u.get(i).motor.getVerzija() + "/" + u.get(i).motor.getSnaga()
                    + "/" + u.get(i).motor.getKubikaza() + "/" + u.get(i).motor.getbrCilindara() + "/");
            pw.write(u.get(i).pneumatici.getSirina() + "/" + u.get(i).pneumatici.getOdnosSirineIVisine() + "/"
                    + u.get(i).pneumatici.getKonstrukcija() + "/" + u.get(i).pneumatici.getPrecnik() + "/"
                    + u.get(i).pneumatici.getNosivost() + "/" + u.get(i).pneumatici.getIndeksBrzine() + "/"
                    + u.get(i).pneumatici.getDubinaGazecegSloja() + "/" + u.get(i).pneumatici.getTip() + "/");
            pw.write(u.get(i).getMaxBrzina() + "/" + u.get(i).getMarka() + "/" + u.get(i).getVerzija() + "/"
                    + u.get(i).getGodiste() + "/" + u.get(i).getSerijskiBroj() + "/" + u.get(i).getBoja() + "/"
                    + u.get(i).getAutomatik() + "/" + u.get(i).getKilometraza() + "/" + u.get(i).getRezervoar() + "/"
                    + u.get(i).getStanjeGoriva());

        }
        pw.close();
    }

}