package question3;

public class LeafExpression implements Expression {

    private int number;

    public LeafExpression(int i) { this.number = i; }

    public int getNumber() { return number; }

    @Override
    public <T> T accept(Visitor<T> v) { return v.visit(this); }
}
