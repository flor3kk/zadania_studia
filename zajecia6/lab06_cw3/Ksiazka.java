package lab06.lab06_cw3;

import java.util.Scanner;

public class Ksiazka {
    String tytul, autor;
    int rok_wydania;
    boolean uszkodzona;

    public Ksiazka(String tytul, String autor, int rok_wydania, boolean uszkodzona){
        this.tytul = tytul;
        this.autor = autor;
        this.rok_wydania = rok_wydania;
        this.uszkodzona = uszkodzona;
    }

    public Ksiazka(){
        Scanner skan = new Scanner(System.in);
        System.out.print("podaj tytul: ");
        this.tytul = skan.next();
        System.out.print("podaj autora: ");
        this.autor = skan.next();
        System.out.print("rok wydania: ");
        this.rok_wydania = skan.nextInt();
        System.out.print("czy uszkodzona: (true/false) ");
        this.uszkodzona = skan.nextBoolean();
    }


    void wyswietl(){
        System.out.println("autor: "+autor + ", tytul: "+tytul + ", rok wydania: "+rok_wydania + ", czy uszkodzona: " + uszkodzona);
    }
}
