package lab06.lab06_cw1;
public class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

	Prostokat(float wys, float szer, String kolor) {
		super(kolor);
		this.szer = szer;
		this.wys = wys;
	}

	public void przesun(float x, float y){
		this.wys += x;
		this.szer += y;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }

	public void wyswietl(){
		System.out.println("prostokat o wymiarach:"+wys + " " +szer);
	}
}