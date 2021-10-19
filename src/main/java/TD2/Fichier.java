package TD2;

public class Fichier extends SystemImpl {
    private String contenu;

    public Fichier(Owner owner, String name) {
        super(owner, name);
    }

    @Override
    public int getSize() {
        return contenu.length();
    }

    @Override public String getContent() {
        return contenu;
    }

    @Override
    public void appendContent(String content) {

    }

    @Override
    public void setOwner(Owner owner) {

    }
}
