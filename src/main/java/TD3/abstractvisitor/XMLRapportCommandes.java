package TD3.abstractvisitor;

import TD3.gestion.Client;
import TD3.gestion.Commande;
import TD3.gestion.GroupeClient;
import TD3.gestion.Ligne;

public class XMLRapportCommandes implements PrePostVisitor {

    @Override public void preVisit(GroupeClient groupeClient) {

    }

    @Override public void preVisit(Client client) {

    }

    @Override public void preVisit(Commande commande) {

    }

    @Override public void preVisit(Ligne ligne) {

    }

    @Override public void postVisit(GroupeClient groupeClient) {

    }

    @Override public void postVisit(Client client) {

    }

    @Override public void postVisit(Commande commande) {

    }

    @Override public void postVisit(Ligne ligne) {

    }
}
