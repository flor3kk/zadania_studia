package projekt;

import java.util.HashMap;
import java.util.Map;

public class automat{
    private String name;
    private double money;
    Map<Character, napoj> napoje;


    public automat(String name) {
        this.name = name;
        money = 0;
        napoje = new HashMap<>();
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }


    public void addMoney(double money){
        if (money < 0 || money > 1000) System.out.println("nieprawidlowa ilosc");
        else setMoney(money);
    }

    public void showNapoje(){
        for (Map.Entry<Character, napoj> item : napoje.entrySet()) {
            System.out.println(item.getKey() + " napoj: " + item.getValue());
        }
    }

    public void addNapoj(napoj woda) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (napoje.containsKey(letter)) {
                continue;
            } else {
                napoje.put(letter, woda);
                return;
            }
        }
    }


    public void buyNapoj(char index){
        if (!(index >= 'A' && index <= 'Z') || !napoje.containsKey(index) || (getMoney() - napoje.get(index).getPrice() < 0)) {
            System.out.println("nieprawidlowosci");
        }
        else {
            setMoney(getMoney() - napoje.get(index).getPrice());
            System.out.println("kupiono " + napoje.get(index));
            System.out.println("zostalo: " + getMoney());
            napoje.remove(index);
        }
    }

}
