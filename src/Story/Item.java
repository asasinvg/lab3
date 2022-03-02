package Story;
import java.util.Objects;

public abstract class Item {
    private final String name;

    Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Item thing = (Item)obj;
            return Objects.equals(this.name, thing.name);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}

