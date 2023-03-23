import java.util.Scanner;

public class lab04_cw6 {

    public static void main(String[] args){
        int[] tab = new int[5];
        System.out.println("podaj elementy do tablicy: ");
        tabin(tab);
    }

    public static int InputInt(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static void tabin(int[] tab){

        for (int i = 0; i < tab.length; i++) {
            tab[i] = InputInt();
        }

        for (int item:tab) {
            int i = 1;
            int s = 1;
            while (i <= item){
                s = s * i;
                i++;
            }
            System.out.println("silnia z " + item + " to: " + s);
        }

    }
}
