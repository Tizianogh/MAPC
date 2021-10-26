package TD3.visiteur;

import TD3.abstractvisitor.PrePostVisitor;

public interface PrePostVisitable {
    void accept(PrePostVisitor prePostVisitor);
}
