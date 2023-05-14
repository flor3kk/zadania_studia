package lab07.cw2;

public class Main {
    public static void main(String[] args){

        Zwierze wieloryb  = new Zwierze(){};
        wieloryb.plyn();
        wieloryb.lec();
        wieloryb.wyladuj();
        wieloryb.wynurz();
        wieloryb.zanurz();
        System.out.println("================");
        Ryba rybka = new Ryba() {};
        rybka.wydalaj();
        rybka.jedz();
        rybka.plyn();
        rybka.wynurz();
        rybka.zanurz();
    }
}
