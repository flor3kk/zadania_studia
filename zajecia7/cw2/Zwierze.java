package lab07.cw2;

import lab07.cw1.Lata;
import lab07.cw1.Plywa;

public abstract class Zwierze implements Latanie, Plywanie {

    public void lec(){
        System.out.println("lata");
    };
    public void wyladuj(){
        System.out.println("ląduje");
    };
    public void plyn(){
        System.out.println("plywa");
    };
    public void wynurz(){
        System.out.println("wynurzenie");
    };
    public void zanurz(){
        System.out.println("zanurzenie");
    };
}
