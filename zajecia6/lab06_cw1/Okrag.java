package lab06.lab06_cw1;

public class Okrag extends Figura{
    double promien;
    public Punkt srodek;

    public Okrag() {
        this.promien = 0.0;
        this.srodek = new Punkt(0.0, 0.0);
    }

    public Okrag(double promien, Punkt srodek){
        this.promien = promien;
        this.srodek = srodek;
    }

    public double getPromien() { return promien;}

    public void setPromien(double promien) { this.promien = promien;}

    public double getSrednica(){ return 2 * promien; }

    public double getPowierzchnia(){ return Math.PI * Math.pow(promien,2); }

    public void wSrodku(){
        if(Math.pow(punkt.x-srodek.x,2)+Math.pow(punkt.y-srodek.y,2)<=Math.pow(promien,2)){
            System.out.println("znajduje sie wewnatrz");
        }
        else{
            System.out.println("nie znajduje sie wewnatrz");
        }
    }

    public void wyswietl(){
        System.out.println("okrag o promieniu: "+ promien + " i wspolrzednych: x("+srodek.x+ "), y("+srodek.y+")");
    }

}
