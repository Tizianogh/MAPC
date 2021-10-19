package TD2;

public interface Systeme {
    public String getName();

    public Owner getOwner();

    public int getSize();

    public String getContent();

    public void appendContent(String content);

    public void setOwner(Owner owner);
}
