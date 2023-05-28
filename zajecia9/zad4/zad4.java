package lab09.zad4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zad4 {
    public static void main(String[] args) {

        klasa[] tablica = new klasa[5];
        tablica[0] = new klasa("challanger", 750);
        tablica[1] = new klasa("charger", 360);
        tablica[2] = new klasa("rx8", 220);
        tablica[3] = new klasa("rs6", 550);
        tablica[4] = new klasa("viper", 600);

        System.out.println("oryginalna tablica obiektow: ");
        for (klasa element : tablica) {
            System.out.println(element.toString());
        }

        List<klasa> lista = new LinkedList<>(Arrays.asList(tablica)); //wypelnienie listy tablica

        List<klasa> podlista = lista.subList(1,3);

        System.out.println("fragment podlisty do  usuniecia: ");
        for (klasa element : podlista) {
            System.out.println(element.toString());
        }


        System.out.println("lista po usunieciu pewnego fragmentu: ");
        lista.subList(1,3).clear(); //wyluskanie fragmentu i usuniecie
        for (klasa element: lista) {
            System.out.println(element.toString());
        }
    }
}


/*
Utwórz  dowolną  klasę,  a  potem  zainicjalizowaną  tablicę
obiektów  tej  klasy.  Zawartością  tablicy wypełnij listę List.
 Wyłuskaj z niej fragment listy metodą subList(),
 a następnie usuń tę podlistę zoryginalnej listy.
 */
