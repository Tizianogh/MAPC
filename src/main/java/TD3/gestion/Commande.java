package TD3.gestion;

import TD3.abstractvisitor.PrePostVisitor;
import TD3.abstractvisitor.Visitor;
import TD3.visiteur.PrePostVisitable;
import TD3.visiteur.Visitable;

import java.util.HashMap;
import java.util.Map;

public final class Commande implements Visitable, PrePostVisitable {

    private String name;
    private Map<String, Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<String, Ligne>();
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne l) {
        this.lignes.put(l.getName(), l);
    }

    @Override public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for (Ligne l : lignes.values()) {
            l.accept(prePostVisitor);
            // deuxieme possibilité prePostVisitor.visit(l)
        }
        prePostVisitor.postVisit(this);
    }

    @Override public void accept(Visitor visitor) {
        for (Ligne l : lignes.values()) {
            l.accept(visitor);
        }
        visitor.visit(this);
    }
}