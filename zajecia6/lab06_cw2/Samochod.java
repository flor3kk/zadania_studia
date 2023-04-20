package lab06.lab06_cw2;

import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    double rok_produkcji, przebieg;



    public Samochod(String marka, String model, String nadwozie, String kolor, double rok_produkcji, double przebieg){
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rok_produkcji = rok_produkcji;
        this.przebieg = przebieg;
    }

    public Samochod(){
        Scanner skan = new Scanner(System.in);
        System.out.print("Marka: ");
        this.marka = skan.next();
        System.out.print("Model: ");
        this.model = skan.next();
        System.out.print("Nadwozie: ");
        this.nadwozie = skan.next();
        System.out.print("Kolor: ");
        this.kolor = skan.next();
        System.out.print("Rok produkcji: ");
        this.rok_produkcji = skan.nextInt();
        System.out.print("Przebieg: (w tys.) ");
        this.przebieg = skan.nextDouble();
        while(przebieg < 0) {
            System.out.println("przebieg nie moze byc ujemny");
            this.przebieg = skan.nextDouble();
        }

    }
    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", przebieg=" + przebieg +
                '}';
    }
}
