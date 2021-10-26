package TD3.gestion;

import TD3.abstractvisitor.PrePostVisitor;
import TD3.abstractvisitor.Visitor;
import TD3.visiteur.PrePostVisitable;
import TD3.visiteur.Visitable;

public final class Ligne implements Visitable, PrePostVisitable {

    private String name;
    private int sum;

    public Ligne(String name) {
        this.name = name;
        this.sum = 0;
    }

    public Ligne(String name, int sum) {
        this(name);
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}