
package lab06.lab06_cw1;
public class Figura {
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}

	public Figura(float wys, float szer) {}

	String getKolor(){
		return kolor;
	}
	String opis(){
		return "Klasa Figura. Kolor obiektu: "+kolor;
	}
}
