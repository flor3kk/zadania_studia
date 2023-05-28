package lab09.zad5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class zad5 {
    public static void main(String[] args) {

        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            lista1.add(i);
        }
        System.out.println(lista1);

        ListIterator<Integer> iterator = lista1.listIterator(lista1.size()); //tworzenie iteratora z listy1 i ustawienie kursora na koncu listy

        while(iterator.hasPrevious()){
            int e = iterator.previous();
            lista2.add(e);
        }

        System.out.println(lista2);

    }

}
