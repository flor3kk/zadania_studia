package lab06.lab06_cw3;

public class Podrecznik extends Powiesc{
    boolean obowiazkowa;
    public Podrecznik(String tytul, String autor, int rok_wydania,boolean uszkodzona, String gatunek,boolean obowiazkowa) {
        super(tytul, autor, rok_wydania, uszkodzona, gatunek);
        this.obowiazkowa  = obowiazkowa;
    }

    void wyswietl(){
        System.out.println("autor: "+autor + ", tytul: "+tytul + ", rok wydania: "+rok_wydania + ", czy uszkodzona: "+uszkodzona+
                ", gatunek: "+gatunek+", czy obowiazkowa: " + obowiazkowa);
    }
}
