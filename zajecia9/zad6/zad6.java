package lab09.zad6;

import java.util.*;

public class zad6 {
    public static void main(String[] args) {

        HashMap<String, kangur> mapa = new HashMap<>();
        mapa.put("marek",new kangur(2));
        mapa.put("marta",new kangur(23));
        mapa.put("agata",new kangur(1));
        mapa.put("anna",new kangur(55));
        mapa.put("kacper",new kangur(23));
        mapa.put("jan",new kangur(13));
        mapa.put("kuba",new kangur(5));
        mapa.put("waldek",new kangur(80));

        Iterator<String> iter = mapa.keySet().iterator();
        while(iter.hasNext()){
            kangur kangurs = mapa.get(iter.next());
            System.out.println(iter.next());
            kangurs.skok();
        }

    }
}
