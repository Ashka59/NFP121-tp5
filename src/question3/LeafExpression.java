package question3;

public class LeafExpression implements Expression {

    private int number;
    public int getNumber() { return number; }

    public LeafExpression(int i) { this.number = i; }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
