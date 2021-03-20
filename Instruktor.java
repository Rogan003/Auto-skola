public class Instruktor extends Osoba{
    private int plata;
    public enum TipInstruktora{
        Teorija, Praksa
    }
    private TipInstruktora tipInstruktora;
    private int godineStaza;
    // lista ucenika vrv

    public Instruktor(int plata, TipInstruktora tipInstruktora, int godineStaza){
        super()   //isto i za ovo kasnije cu
        this.plata = plata;
        this.tipInstruktora = tipInstruktora;
        this.godineStaza = godineStaza;
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

}
