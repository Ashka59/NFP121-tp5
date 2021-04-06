package question2;

public class LeafExpression implements Expression {
    private int number;

    public LeafExpression(int i) { this.number = i; }

    @Override
    public int interpreter() {
        return number;
    }
}
