package Story;
import java.util.Objects;

public abstract class Human {
    private final String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Human person = (Human)obj;
            return Objects.equals(this.name, person.name);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }

}
