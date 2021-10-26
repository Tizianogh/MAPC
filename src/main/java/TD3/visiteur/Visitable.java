package TD3.visiteur;

import TD3.abstractvisitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
