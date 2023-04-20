package lab06.lab06_cw1;

public class Kwadrat extends Prostokat{
    public Kwadrat(double wys,double szer){
        super(wys, szer);
    }

    public double getPowierzchnia(double x, double y){
        return x * y;
    }
    public void wyswietl(){
        System.out.println("kwadrat o wymiarach: "+ wys + "x"+szer);
    }

}
