package lab06.lab06_cw1;

import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {
        System.out.println("========PUNKT==============");
        Punkt p1 = new Punkt(3,4);
        p1.opis();
        p1.przesun(6,-3);
        p1.opis();

        System.out.println("========PROSTOKAT==============");
        Prostokat prostokat = new Prostokat(10,5);
        prostokat.wyswietl();
        prostokat.przesun(5,5);
        prostokat.wyswietl();
        System.out.println("pole powierzchni: " + prostokat.getPowierzchnia());

        System.out.println("========TROJKAT==============");
        Trojkat trojkat = new Trojkat(10,5);
        trojkat.wyswietl();

        System.out.println("========KWADRAT==============");
        Kwadrat kwadrat = new Kwadrat(10,10);
        kwadrat.wyswietl();
        System.out.println("pole powierzchni: " +kwadrat.getPowierzchnia());

        System.out.println("========OKRAG==============");
        //Okrag okrag = new Okrag(3,p1);
        Okrag okrag = new Okrag(2, new Punkt(1,1));
        okrag.wyswietl();
        System.out.println("srednica: "+okrag.getSrednica());
        System.out.println("pole powierzchni: "+ okrag.getPowierzchnia());
        okrag.wSrodku();
    }
}
