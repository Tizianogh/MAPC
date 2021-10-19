package TD2;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends SystemImpl {
    List<Systeme> elems = new ArrayList<>();

    public Repertoire(Owner owner, String name) {
        super(owner, name);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Systeme sys : elems) {
            size += sys.getSize();
        }
        return size;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String content) {
        StringBuilder builder = new StringBuilder();
        for (Systeme sys : elems) {
            builder.append(sys.getName() + sys.getContent() + "\n");
        }
    }

    @Override
    public void setOwner(Owner owner) {
        for (Systeme sys : elems) {
            sys.setOwner(owner);
        }
    }
}
