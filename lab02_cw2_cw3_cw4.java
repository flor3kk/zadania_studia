import java.util.Scanner;

public class lab02_cw2_cw3_cw4 {
        public static void main(String[] args){
            Run();
        }

        public static void Run(){
            while(true){
                Menu();
            }
        }

        public static void Menu(){
            System.out.println("WYBIERZ: \n1.suma " +
                "2.roznica 3.iloczyn 4.Iloraz 5.potega 6.pierwiastek" +
                " 7.funkcje tryg \nTABLICE:\n8.wyś.tablicy 9.wypisz tablice od tyłu 10.Nieprzayste indexy 11.Parzyste indexy" +
                    " 12.Suma tablicy 13.Iloczyn tablicy 14.średnia wartość tablicy 15.Min wart 16.Maks wart 17.Wyjdz");

            int num = InputInt();
            switch (num){
                case 1 -> Suma();
                case 2 -> Roznica();
                case 3 -> Iloczyn();
                case 4 -> Iloraz();
                case 5 -> Potega();
                case 6 -> Pierwiastek();
                case 7 -> funTryg();
                case 8 -> viewtab(returnArray());
                case 9 -> reverseviewtab(returnArray());
                case 10 -> oddindex(returnArray());
                case 11 -> evenindex(returnArray());
                case 12 -> sumarr(returnArray());
                case 13 -> multiplearr(returnArray());
                case 14 -> avgarr(returnArray());
                case 15 -> minarr(returnArray());
                case 16 -> maxarr(returnArray());
                case 17 -> Close();

            }

            String cont = "";
            while (!(cont.equals("t")) || !(cont.equals("n"))) {
                System.out.println("kontynuowac?: t/n");
                cont = inputStr();
                if (cont.equals("t")) {Menu(); }
                else if (cont.equals("n")) {Close(); }
            }
        }

        public static int InputInt(){
            Scanner skaner = new Scanner(System.in);
            return skaner.nextInt();
        }
        public static String inputStr(){
            Scanner skaner_str = new Scanner(System.in);
            String tekst = skaner_str.nextLine();
            return tekst;
        }

        public static void Suma(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("s4uma: " + a + " + " + b + " = " + (a+b));
        }

        public static void Roznica(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("suma: " + a + " - " + b + " = " + (a-b));
        }

        public static void Iloczyn(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = InputInt();
            System.out.println("suma: " + a + " * " + b + " = " + (a*b));
        }

        public static void Iloraz(){
            System.out.println("podaj 1 liczbe: ");
            int a = InputInt();
            System.out.println("podaj 2 liczbe: ");
            int b = 0;
            while (b == 0){
                System.out.println("nie przez zero");
                b = InputInt();
            }
            System.out.println("iloraz: " + a + " / " + b + " = " + (a/b));
        }

        public static void Potega(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("do jakiej potegi: ");
            int b = InputInt();
            System.out.println("suma: " + a + " ^ " + b + " = " + Math.pow(a,b));
        }

        public static void Pierwiastek(){
            System.out.println("podaj liczbe: ");
            int a = InputInt();
            System.out.println("pierwisatek z : " + a + " = " + Math.sqrt(a));
        }

        public static void funTryg(){
            int a = -1;
            while (a < 0 || a > 360){
                System.out.println("podaj ile stopni: ");
                a = InputInt();
            }
            System.out.println("Sin: " + Math.sin(a) + ", Cos: " + Math.cos(a) + ", Tg: " + Math.tan(a));
        }

        public static int[] returnArray(){
            final int arrayLen = 10;
            int[] arr = new int[arrayLen];
            System.out.println("podaj elementy tablicy: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = InputInt();
        }
            return arr;
    }

        public static void viewtab(int[] tab){
            System.out.println("\nelementy tablicy");
            for (int item:tab) {
                System.out.print(item + " ");
        }
            System.out.println();
    }

        public static void reverseviewtab(int[] tab){
            System.out.println("\nelementy odwrocone");
            for (int i = tab.length - 1; i >= 0; i--) {
                System.out.print(tab[i] + " ");
        }
            System.out.println();
        }

        public static void oddindex(int[] tab){
            System.out.println("\nelementy o nieparzystych indeksach");
            for(int i = 0; i < tab.length; i++){
                if(i % 2 != 0){
                    System.out.print(tab[i] + " ");
                }
            }
            System.out.println();
        }

        public static void evenindex(int[] tab){
            System.out.println("\nelementy o parzystych indeksach");
            for(int i = 0; i < tab.length; i++){
                if(i % 2 == 0){
                    System.out.print(tab[i] + " ");
                }
            }
            System.out.println();
        }

        public static void sumarr(int[] tab){
            int sum = 0;
            for (int i = 0; i < tab.length; i++) {
                sum += tab[i];
            }
            System.out.println("suma tablicy: " + sum);
        }

        public static void multiplearr(int[] tab){
            int multiple = 1;
            for (int i = 0; i < tab.length; i++) {
                multiple *= tab[i];
            }
            System.out.println("iloczyn tablicy: " + multiple);
        }

        public static void avgarr(int[] tab){
            int sum = 0;
            int count = 0;
            for (int item:tab) {
                sum += item;
                count++;
            }
            System.out.println("Srednia w tablicy: " + (sum/count));
        }

        public static void minarr(int[] tab){
            int min = tab[0];
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] < min) {
                    min = tab[i];
                }
            }
            System.out.println("max wartosc w tablicy to: " + min);
        }

        public static void maxarr(int[] tab){
            int max = tab[0];
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                }
            }
            System.out.println("max wartosc w tablicy to: " + max);
        }


        public static void Close(){
            System.out.println("trzymaj sie");
            System.exit(0);
        }
}