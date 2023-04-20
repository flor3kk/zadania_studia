package lab06.lab06_cw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String odp;
        Scanner skan = new Scanner(System.in);

        System.out.println("===============KSIAZKI================");
        Ksiazka ksiazka = new Ksiazka("ostre cieca", "joe abercrombie", 2019, true);
        ksiazka.wyswietl();
        Ksiazka ksiazka2 = new Ksiazka();
        ksiazka2.wyswietl();

        System.out.println("===============POWIESCI================");
        Powiesc powiesc = new Powiesc("gra o tron","r.r.martin", 2015, false,"fantasy");
        powiesc.wyswietl();

        System.out.println("===============PODRECZNIKI================");
        Podrecznik podrecznik = new Podrecznik("hobbit","tolkien",1970, true, "fantasy", false);
        podrecznik.wyswietl();

        System.out.println("===============KLIENCI================");
        Klient klient1 = new Klient();
        klient1.wyswietl_dane();

        System.out.println("===============KSIEGARNIA================");
        Ksiegarnia ksiegarnia = new Ksiegarnia(23333, 231);
        ksiegarnia.wyswietl_dane();
        System.out.print("dodaj ksiazki: ");
        ksiegarnia.ustaw(skan.nextInt());
        System.out.print("stan ksiazek: ");
        ksiegarnia.wyswietl_dane();

/*        do{
            System.out.print("Czy chcesz dodac/usunac ksiazki?: ");
            odp = skan.next();
            if (odp == "tak"){
                ksiegarnia.ustaw(skan.nextInt());
            }
        }while (odp == "nie");
        ksiegarnia.wyswietl_dane();*/
    }
}
