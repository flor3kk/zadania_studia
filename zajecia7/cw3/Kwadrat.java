package lab07.cw3;

public abstract class Kwadrat extends Prostokat implements IFigury{
	Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}

	public String opis(){
		return "kwadrat o wymairach: "+szer;
	}

	public void skaluj(float skala){
		System.out.println("przeskalowana wartosc: |"+skala+"|, "+skala*szer + " x "+skala*szer);
	}

	public float getPowierzchnia(){
		return szer*szer;
	}

	public boolean wPolu(Punkt p){
		if(p.x <szer && p.y < szer) return true;
		else return false;
	}
}