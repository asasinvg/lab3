package Story;

public class Main {
    public static void main(String[] args) {
        Malysh baby = new Malysh("Малыш");
        Carlson carl = new Carlson("Карлсон");
        MoneyBox moneyBox1 = new MoneyBox("копилка");
        baby.stand();
        baby.beMother(carl);
        carl.help();
        carl.lookAt(baby);
        baby.getFrom();
        baby.empty(moneyBox1);
        carl.exult();
    }
}
