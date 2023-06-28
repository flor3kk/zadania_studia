package projekt;

import xddd.produkt;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        automat Automat = new automat("automat nr 1");

        Automat.addNapoj(new napoj("tymbark", 3));
        Automat.addNapoj(new napoj("kolka", 8));
        Automat.addNapoj(new napoj("woda", 1));
        Automat.addNapoj(new napoj("sprajt", 2.3));
        Automat.addNapoj(new napoj("lipton", 4));
        Automat.addNapoj(new napoj("kawa", 5));
        try {
            while (true) {
                System.out.println("WYBIERZ:\n1 - pokaz napoje\n2 - wplac monety\n3 - kupno\n4 - lista transakcji\n0 - wyjdz\n2115 - panel administracyjny/dodawanie asortymentu");

                int choice = inputInt();
                char index;
                String action = "";

                switch (choice) {
                    case 1:
                        System.out.println("lista napojow:");
                        Automat.showNapoje();
                        action = "wyswietlono liste napojow ";
                        break;

                    case 2:
                        System.out.println("wrzuc monety:");
                        try {
                            Automat.addMoney(inputDbl());
                            System.out.println("twoje srodki: " + Automat.getMoney() + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("nieprawidlowe dane :c ");
                        }
                        action = "wplacono srodki ";
                        break;

                    case 3:
                        System.out.println("podaj litere napoju ktory chcesz kupic: ");
                        index = inputStr().toUpperCase().charAt(0);
                        action = "kupiono napoj: " + Automat.napoje.get(index);
                        Automat.buyNapoj(index);
                        break;

                    case 2115:
                        System.out.println("Nazwa produktu:");
                        String nazwa = inputStr();
                        System.out.println("Cena produktu:");
                        double price = inputDbl();
                        napoj nowyNapoj = new napoj(nazwa, price);
                        Automat.addNapoj(nowyNapoj);
                        System.out.println("Pomyslnie dodano produkt");
                        action = "dodano nowy napoj: " + nowyNapoj;
                        break;

                    case 4:
                        String path = "I:\\nauka_c\\first_project\\log.txt";
                        String line = "";
                        try {
                            BufferedReader inputFile = new BufferedReader(new FileReader(path));
                            System.out.println("zawartosc pliku:");

                            while (true) {
                                line = inputFile.readLine();
                                if (line == null) break;
                                System.out.println(line);
                            }
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 0:
                        System.out.println("trzymaj sie");
                        System.exit(0);

                    default:
                        System.out.println("nieprawidlowa opcja");

                }

                try {
                    if (!action.equals("")) {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
                            writer.write(action);
                            writer.newLine();
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("nieprawidlowe dane wejsciowe ");
        }
    }
    public static int inputInt(){
        Scanner skaner_int = new Scanner(System.in);
        return skaner_int.nextInt();
    }
    public static double inputDbl(){
        Scanner skaner_dbl = new Scanner(System.in);
        return skaner_dbl.nextDouble();
    }

    public static String inputStr(){
        Scanner skaner_str = new Scanner(System.in);
        String tekst = skaner_str.nextLine();
        return tekst;
    }
}

