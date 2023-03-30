import java.time.LocalDate;

public class lab05_cw2_building {
    String name;
    int year;
    int floors;

    public lab05_cw2_building(String name, int year, int floors){
        this.name = name;
        this.year = year;
        this.floors = floors;
    }

    public void how_long(int year){
        int local = LocalDate.now().getYear();
        System.out.print("Budynek ma: " + (local - year) + " lat(a)");
        System.out.println();
    }

    @Override
    public String toString() {
        return "budynek ---- " +
                "Nazwa='" + name + '\'' +
                ", Rok budowy=" + year +
                ", Piętra=" + floors;
    }
}
