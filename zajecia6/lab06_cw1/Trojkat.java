package lab06.lab06_cw1;
public class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	Trojkat(float wys, float podst, String kolor){
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public void wyswietl(){
		System.out.println("trojkat o wymiarach: "+ wys+"x"+podst);
	}

	/*public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}*/

/*	public Trojkat(Punkt punkt, double wys, double podst) {
		super(punkt);
		this.wys = wys;
		this.podst = podst;
	}*/


}