package lab09.zad1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad1 {

    public static void main(String[] args) {

        zad1();

    }


    public static void zad1(){
        String name;
        final String noMore = "-";

        Set<String> set = new HashSet<>();
        Scanner skan = new Scanner(System.in);

        do {
            System.out.println("podaj imie: ");
            name = skan.next();
            if (!name.equals(noMore)){
                set.add(name);
            }
        }while (!name.equals("-"));
        System.out.println("wprowadzono: " + set.size() + " unikalnych imion");

    }
}
