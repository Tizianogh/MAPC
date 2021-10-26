package TD3.gestion;

import TD3.abstractvisitor.PrePostVisitor;
import TD3.abstractvisitor.Visitor;
import TD3.exceptions.MonException;
import TD3.visiteur.PrePostVisitable;
import TD3.visiteur.Visitable;

import java.util.HashMap;
import java.util.Map;

public final class Client implements Visitable, PrePostVisitable {

    private String name;
    protected Map<String, Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande c) {
        this.commandes.put(c.getName(), c);
    }

    public void addLigne(String cdename, Ligne l) throws MonException {
        Commande c = this.commandes.get(cdename);
        if (c != null) {
            c.addLigne(l);
        } else
            throw new MonException("commande inconnue");
    }

    @Override public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for (Commande c : commandes.values()) {
            c.accept(prePostVisitor);
        }
        prePostVisitor.postVisit(this);

    }

    @Override public void accept(Visitor visitor) {
        for (Commande c : commandes.values()) {
            c.accept(visitor);
        }
        visitor.visit(this);
    }
}