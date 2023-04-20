package lab06.lab06_cw3;

import java.util.Scanner;

public class Klient {
    String imie, nazwisko;
    int wiek;



    public Klient(){
        Scanner skan = new Scanner(System.in);
        System.out.print("podaj imie: ");
        this.imie = skan.next();
        System.out.print("podaj nazwisko: ");
        this.nazwisko = skan.next();
        System.out.print("wiek: ");
        this.wiek = skan.nextInt();
    }

    void wyswietl_dane(){
        System.out.println("imie: " + imie + ", nazwisko: "+ nazwisko + ", wiek: "+ wiek + " lat");
    }
}
