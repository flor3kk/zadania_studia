package lab07.cw3;

public abstract class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	public void skaluj(float skala){
		System.out.println("przeskalowana wartosc: |"+ skala +"|, "+ skala*szer + " x "+ skala*wys);
	}

	public float getPowierzchnia(){
		return szer * wys;
	}

	public boolean wPolu(Punkt p){
		if(p.x < szer && p.y < wys) return true;
		else return false;
	}
}