package lab07.cw3;

class main
{
	public static void main(String[] arg)
	{
		System.out.println("===========PROSTOKAT=================");
		Prostokat prostokat = new Prostokat(3, 6, "czerwony"){};
		System.out.println(prostokat.opis());
		System.out.println("pole powierzchni: "+prostokat.getPowierzchnia());
		System.out.println(prostokat.wPolu(new Punkt(2,5)));
		prostokat.skaluj(5);

		System.out.println("===========TROJKAT=================");
		Trojkat trojkat = new Trojkat(7, 4, "bia�y"){};
		System.out.println(trojkat.opis());
		System.out.println("pole powierzchni: "+trojkat.getPowierzchnia());
		System.out.println(trojkat.wPolu(new Punkt(2,5)));
		trojkat.skaluj(5);

		System.out.println("===========KWADRAT=================");
		Kwadrat kwadrat = new Kwadrat(10, "biely"){};
		System.out.println(kwadrat.opis());
		System.out.println("pole powierzchni: "+kwadrat.getPowierzchnia());
		System.out.println(kwadrat.wPolu(new Punkt(2,5)));
		kwadrat.skaluj(5);

		System.out.println("===========OKRAG=================");
		Okrag ok = new Okrag(2, new Punkt(2,5)) {};
		System.out.println(ok.opis());
		ok.przesun(2,10);
		System.out.println(ok.opis());
		ok.skaluj(4);

		System.out.println("=================TABLICA1======================");

		Figura[] tablicaFigur = new Figura[10];

		for(int i = 0; i<10; i++){
			if(i < 5){
				Trojkat tr = new Trojkat(i+4,i+2, "red"){};
				tablicaFigur[i] = tr;
			}
			if(i>=5){
				Prostokat pr = new Prostokat(i+2, i+5, "bialy"){};
				tablicaFigur[i] = pr;
			}
			System.out.println(tablicaFigur[i].opis());
		}

		System.out.println("=================TABLICA2===============");

		IFigury[] tablica = new IFigury[10];
		for(int i = 0; i<10; i++){
			if(i<=3) {
				Prostokat pr = new Prostokat(i + 1, i + 5, "") {};
				tablica[i] = pr;
			} else if (i>3 && i<7) {
				Kwadrat kw = new Kwadrat(i+5, ""){};
				tablica[i] = kw;
			}
			else{
				Trojkat tr = new Trojkat(i+2, i+4, ""){};
				tablica[i] = tr;
			}
			System.out.print("pole powierzchni: ");
			System.out.println(tablica[i].getPowierzchnia());
			System.out.println(tablica[i].wPolu(new Punkt(1,2)));
		}

	}
}