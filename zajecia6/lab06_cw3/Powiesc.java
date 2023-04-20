package lab06.lab06_cw3;

public class Powiesc extends Ksiazka{
    String gatunek;

    public Powiesc(String tytul, String autor, int rok_wydania,boolean uszkodzona, String gatunek){
        super(tytul, autor, rok_wydania,uszkodzona);
        this.gatunek = gatunek;
    }

    void wyswietl(){
        System.out.println("autor: "+autor + ", tytul: "+tytul + ", rok wydania: "+rok_wydania + ", czy uszkodzona: "+uszkodzona+", gatunek: "+gatunek);
    }
}
