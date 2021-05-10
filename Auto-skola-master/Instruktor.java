package autoskola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Instruktor extends Osoba{
    private int plata;
    public enum TipInstruktora{
        Teorija, Praksa
    }
    private TipInstruktora tipInstruktora;
    private int godineStaza;
    List<Ucenik> listaUcenika = new ArrayList<Ucenik>();

    public Instruktor(String ime, String prezime, LocalDate datumRodjenja, Pol pol,int plata, TipInstruktora tipInstruktora, int godineStaza, List listaUcenika){
        super();
        this.plata = plata;
        this.tipInstruktora = tipInstruktora;
        this.godineStaza = godineStaza;
        this.listaUcenika = listaUcenika;
    }

    public int getPlata(){
        return plata;
    }
    public TipInstruktora getTipInstruktora(){
        return tipInstruktora;
    }
    public int getGodineStaza(){
        return godineStaza;
    }
    public List<Ucenik> getArrayList(){
        return listaUcenika;
    }
    
    public List<Ucenik> dodajUcenika(){
        listaUcenika.add(/*Milan*/);
    }

    @Override
	public String toString()
	{
    	String tip;
    	if(tipInstruktora == TipInstruktora.Teorija)
    		tip = "Teorija";
    	else
    		tip = "Praksa";
    	return "Ime: " + ime + "\nPrezime: " + prezime + "\nDatum rodjenja: " + datumRodjenja
    			+ "\nPol: " + pol + "\nPlata: " + plata + "\nTip instruktora: " + tip
    			+ "\nGodine staza: " + godineStaza; 
	}

}
