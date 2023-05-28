package lab09.zad3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class zad3 {

    public static void main(String[] args) {

        List<info> lista = new LinkedList<>();

        info p1 = new info(1,"kamil", 14);
        info p2 = new info(2,"adrian", 26);
        info p3 = new info(3,"karol", 19);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        //ListIterator<info> iterator = lista.listIterator();

        //for (info element : lista){
        //    if (element.equals(iterator.next())) System.out.println("blad, takie same wartosci");
        //}

        for (info element : lista) {
            if (element.wiek < 18) System.out.println("osoba niepelnoletnia");
            else System.out.println(element);
        }
    }


}

/*
Napisz  klasę  przechowującą  informacje  o  uczestnikach
 wydarzenia  (ID,  imię  oraz  jego  wiek).
 Zaimplementować metodę toString(), aby wyświetlać
 informację o uczestniku oraz metody equals() oraz hashCode()
 (metody do porównywania obiektów).
 Do przechowywania uczestników należy użyć listy.
 Ponadto zaproponować metodę pozwalającą na filtrowanie
 osób niepełnoletnich.
 Zaproponować rozwiązanie zużyciem LinkedList oraz ArrayList.
 */