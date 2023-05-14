package lab07.cw2;

import lab07.cw1.Plywa;

public abstract class Ryba implements Plywanie {

    public void jedz(){
        System.out.println("jedzenie");
    };
    public void wydalaj(){
        System.out.println("wydala");
    };


    public void plyn(){
        System.out.println("ryba plywa");
    };
    public void wynurz(){
        System.out.println("wynurzenie");
    };
    public void zanurz(){
        System.out.println("zanurzenie");
    };
}
