package TD3.abstractvisitor;

import TD3.gestion.Client;
import TD3.gestion.Commande;
import TD3.gestion.GroupeClient;
import TD3.gestion.Ligne;

public interface PrePostVisitor {
    void preVisit(GroupeClient groupeClient);

    void preVisit(Client client);

    void preVisit(Commande commande);

    void preVisit(Ligne ligne);

    void postVisit(GroupeClient groupeClient);

    void postVisit(Client client);

    void postVisit(Commande commande);

    void postVisit(Ligne ligne);
}
