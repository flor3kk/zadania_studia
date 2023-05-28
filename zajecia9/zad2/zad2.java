package lab09.zad2;

import java.util.*;

public class zad2 {

    public static void main(String[] args) {

        zad2();

    }


    public static void zad2(){
        String name;
        String name2;
        String key;
        final String noMore = "-";

        Map<String, String> mapa = new HashMap<>();
        Scanner skan = new Scanner(System.in);

        do {
            System.out.println("podaj imie: ");
            name = skan.next();
            System.out.println("podaj imie partnera:");
            name2 = skan.next();
            if (!name.equals(noMore)){
                mapa.put(name, name2);
            }
        }while (!name.equals("-"));

        System.out.println("podaj wczesniej podane imie: ");
        key = skan.next();
        System.out.println("partner: " + mapa.get(key));

    }
}
