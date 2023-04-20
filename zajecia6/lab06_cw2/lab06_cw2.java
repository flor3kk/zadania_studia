package lab06.lab06_cw2;

public class lab06_cw2 {
    public static void main(String[] args){
        System.out.println("samochod nr 1:");
        Samochod samochod = new Samochod();
        System.out.println("samochod nr 2:");
        Samochod samochod1 = new Samochod();
        System.out.println("samochod osobowy: ");
        SamochodOsobowy sam_osob = new SamochodOsobowy();


        System.out.println(samochod.toString());
        System.out.println(samochod1.toString());
        System.out.println(sam_osob.toString());
    }
}
