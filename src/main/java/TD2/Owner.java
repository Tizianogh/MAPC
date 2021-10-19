package TD2;

import java.util.Objects;

public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
