import java.sql.SQLOutput;
import java.util.Scanner;

public class lab05_cw1_uruchomienie {

    public static void main(String[] args) {
        Run();
    }

        public static void Run() {
            while (true) {
                Menu();
            }
        }

        public static void Menu() {
            //int[] tab = returnArray();

            System.out.println("WYBIERZ: 1.Kolo 2.Kwadrat 3.Prostokat 4.Szescian 5.Prostopadłościan 6.Kula 7.Stożek 8.Wyjdz ");
            int num = InputInt();
            switch (num) {
                case 1 -> kolo();
                case 2 -> kwadrat();
                case 3 -> prostokat();
                case 4 -> szescian();
                case 5 -> prostopadloscian();
                case 6 -> kula();
                case 7 -> stozek();
                case 8 -> Close();

            }

            String cont = "";
            while (!(cont.equals("t")) || !(cont.equals("n"))) {
                System.out.println("kontynuowac?: t/n");
                cont = inputStr();
                if (cont.equals("t")) {
                    Menu();
                } else if (cont.equals("n")) {
                    Close();
                }
            }
        }


        public static int InputInt () {
            Scanner skaner = new Scanner(System.in);
            return skaner.nextInt();
        }

        public static String inputStr () {
            Scanner skaner_str = new Scanner(System.in);
            String tekst = skaner_str.nextLine();
            return tekst;
        }


        public static void kolo () {
            System.out.print("Podaj promień: ");
            int a = InputInt();
            lab05_cw1_circle cirlce = new lab05_cw1_circle(a);
            cirlce.circle_surface(a);
            cirlce.circle_circum(a);
            System.out.println(cirlce.toString());
        }

        public static void kwadrat() {
            System.out.print("Podaj bok: ");
            int a = InputInt();
            lab05_cw1_square square = new lab05_cw1_square(a);
            square.square_surface(a);
            square.square_circum(a);
            System.out.println(square.toString());
        }

        public static void prostokat() {
            System.out.print("Podaj bok a: ");
            int a = InputInt();
            System.out.print("Podaj bok b: ");
            int b = InputInt();
            lab05_cw1_rectangle rectangle = new lab05_cw1_rectangle(a,b);
            rectangle.rectangle_surface(a,b);
            rectangle.rectangle_circum(a,b);
            System.out.println(rectangle.toString());
        }

        public static void szescian(){
            System.out.print("Podaj bok a:");
            int a = InputInt();
            lab05_cw1_cube cube = new lab05_cw1_cube(a);
            cube.cube_cap(a);
            cube.cube_circum(a);
            System.out.println(cube.toString());
        }

        public static void prostopadloscian(){
            System.out.print("Podaj bok a:");
            int a = InputInt();
            System.out.print("Podaj bok b: ");
            int b = InputInt();
            System.out.print("Podaj bok c: ");
            int c = InputInt();
            lab05_cw1_cuboid cuboid = new lab05_cw1_cuboid(a,b,c);
            cuboid.cuboid_cap(a,b,c);
            cuboid.cuboid_surface(a,b,c);
            System.out.println(cuboid.toString());
        }

        public static void kula(){
            System.out.print("Podaj promien: ");
            int radius = InputInt();
            lab05_cw1_sphere sphere = new lab05_cw1_sphere(radius);
            sphere.sphere_cap(radius);
            sphere.sphere_surface(radius);
            System.out.println(sphere.toString());
        }

        public static void stozek(){
            System.out.print("Podaj promien:");
            int radius = InputInt();
            System.out.print("Podaj wysokosc: ");
            int height = InputInt();
            lab05_cw1_cone cone = new lab05_cw1_cone(radius, height);
            cone.cone_cap(radius, height);
            cone.cone_surface(radius, height);
            System.out.println(cone.toString());
        }

        public static void Close(){
            System.out.println("trzymaj sie");
            System.exit(0);
        }
}
