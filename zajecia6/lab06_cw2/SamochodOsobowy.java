package lab06.lab06_cw2;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {

    double waga, pojemnosc;
    int osoby;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, double rok_produkcji, double przebieg, double waga, double pojemnosc, int osoby ){
        super(marka, model, nadwozie, kolor, rok_produkcji, przebieg);
        this.waga = waga;
        this.pojemnosc = pojemnosc;
        this.osoby = osoby;
    }

    public SamochodOsobowy() {
        Scanner skan = new Scanner(System.in);
        System.out.print("Podaj wage: (w tonach) ");
        this.waga = skan.nextDouble();
        while (waga < 2 || waga > 4.5) {
            System.out.print("waga powinna byc od 2 do 4.5 tony ");
            this.waga = skan.nextDouble();
        }
        System.out.print("Podaj pojemnosc: ");
        this.pojemnosc = skan.nextDouble();
        System.out.print("Ile osobowy: ");
        this.osoby = skan.nextInt();
    }


    @Override
    public String toString() {
        return "SamochodOsobowy{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", przebieg=" + przebieg +
                "waga=" + waga +
                ", pojemnosc=" + pojemnosc +
                ", osoby=" + osoby +
                '}';
    }
}
