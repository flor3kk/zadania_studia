package lab06.lab06_cw3;

public class Ksiegarnia{
    int ilosc_ksiazek, ilosc_klientow;
    public Ksiegarnia(int ilosc_ksiazek, int ilosc_klientow) {
        this.ilosc_ksiazek = ilosc_ksiazek;
        this.ilosc_klientow = ilosc_klientow;
    }

    public void ustaw(int x){
        this.ilosc_ksiazek += x;
    }

    void wyswietl_dane(){
        System.out.println("ksiegarnia posiada: "+ilosc_ksiazek + " ksiazek oraz: "+ilosc_klientow+" klientow");
    }
}
