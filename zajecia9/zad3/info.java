package lab09.zad3;

public class info {
    int ID;
    String imie;
    int wiek;

    info(int ID, String imie, int wiek) {
        this.ID += ID;
        this.imie = imie;
        this.wiek = wiek;
    }


    @Override
    public String toString() {
        return "ID " + ID +
                " imie '" + imie + '\'' +
                " wiek " + wiek;
    }
}
