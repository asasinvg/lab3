package Story;
import java.util.Random;

public class Carlson extends Human implements LookAt, Help, Exult{
    Carlson(String name) {
        super(name);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000;
    }
    public void lookAt(Human obj){
        System.out.println(this.getName() + " посмотрел на " + obj.getName() + "а");
    }
    public void help(){
        System.out.println(this.getName() + " помогал");
    }

    public void exult(){
        System.out.println(this.getName() + " ликовал");
    }


    @Override
    public void lookAt() {

    }
}
