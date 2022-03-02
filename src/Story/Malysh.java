package Story;

import java.util.Random;

public class Malysh extends Human implements Stand, BeMother, Empty, GetFrom{
    Malysh(String name) {
        super(name);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000;
    }

    public void stand(){
        System.out.println(this.getName() + " стоял растерянным");
    }

    public void beMother(Human obj){
        System.out.println(this.getName() + " хотел стать матерью " + obj.getName() + "у");
    }

    public void empty(MoneyBox obj){
        System.out.println(this.getName() + " опустошить" + obj.getName());
    }

    public void getFrom(){
        Malysh.gettingCoin coin = Malysh.gettingCoin.five;
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i) {
            case 0 -> coin = Malysh.gettingCoin.five;
            case 1 -> coin = Malysh.gettingCoin.ten;
            case 2 -> coin = Malysh.gettingCoin.twentyFive;
        }
        System.out.println(" доставал " + this.getName()+ coin.label + " монеты");
    }

    @Override
    public void beMother() {

    }

    @Override
    public void empty() {

    }


    public enum gettingCoin {
        five("пятиэровые"),
        ten("десятиэровые"),
        twentyFive("двадцати пятиэровые");
        private final String label;

        gettingCoin (String label) {
            this.label = label;
        }
    }
}

