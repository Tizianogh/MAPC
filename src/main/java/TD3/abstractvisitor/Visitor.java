package TD3.abstractvisitor;

import TD3.gestion.Client;
import TD3.gestion.Commande;
import TD3.gestion.GroupeClient;
import TD3.gestion.Ligne;

public interface Visitor {
    void visit(GroupeClient groupeClient);

    void visit(Client client);

    void visit(Commande commande);

    void visit(Ligne ligne);
}
