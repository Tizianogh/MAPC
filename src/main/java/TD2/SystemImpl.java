package TD2;

public abstract class SystemImpl implements Systeme {
    private Owner owner;
    private String name;

    public SystemImpl(Owner owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }
}
