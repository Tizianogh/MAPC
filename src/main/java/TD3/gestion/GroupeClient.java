package TD3.gestion;

import TD3.abstractvisitor.PrePostVisitor;
import TD3.abstractvisitor.Visitor;
import TD3.exceptions.MonException;
import TD3.visiteur.PrePostVisitable;
import TD3.visiteur.Visitable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class GroupeClient implements Visitable, PrePostVisitable {

    private String name;
    private Map<String, Client> clients = null;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashMap<String, Client>();
    }

    public String getName() {
        return name;
    }

    public Collection<Client> getClients() {
        return clients.values();
    }

    public void addClient(Client c) {
        this.clients.put(c.getName(), c);
    }

    public void addCommande(String cname, Commande cde) throws MonException {
        Client c = clients.get(cname);
        if (c != null) {
            c.addCommande(cde);
        } else
            throw new MonException("client inconnu");
    }

    public void addLigne(String cname, String cdename, Ligne l) throws MonException {
        Client c = clients.get(cname);
        if (c != null) {
            c.addLigne(cdename, l);
        } else
            throw new MonException("client inconnu");
    }

    @Override public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        for (Client c : clients.values()) {
            c.accept(prePostVisitor);
        }
        prePostVisitor.postVisit(this);
    }

    @Override public void accept(Visitor visitor) {
        for (Client c : clients.values()) {
            c.accept(visitor);
        }
        visitor.visit(this);
    }
}