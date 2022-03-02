package Story;

public class MoneyBox extends Item{
    MoneyBox(String name) {
        super(name);
        System.out.println("Создан предмет " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя предмета: " + var10000;
    }
}
