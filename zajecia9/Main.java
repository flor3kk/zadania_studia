package lab09;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<>(); //ArrayList<>();
        List<String> lista2 = new LinkedList<>(); //ArrayList<>();

        lista.add("Jan");
        lista.add("Janina");

        lista2.add("Marek");
        lista2.add("Ewelina");

        lista2.addAll(lista);

        System.out.println(lista2.contains("Marek"));
        System.out.println(lista2.get(3));
        System.out.println(lista2.indexOf("Jan"));

        for (String item: lista2) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("for i= ");
        for (int i = 0; i < lista2.size(); i++) {
            System.out.print(lista2.get(i));
        }


        Set<String> set = new HashSet<>(); // unikalne wartosci bez powtorzen
        set.add("alan");


        Map<String, String> mapa = new HashMap<>();
        mapa.put("Jan", "Janina");
        mapa.put("1", "Janina1");

    }

}