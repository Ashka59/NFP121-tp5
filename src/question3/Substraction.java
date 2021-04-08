package question3;

public class Substraction implements Expression {
    protected Expression op1;
    protected Expression op2;

    public Substraction(Expression op1, Expression op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public <T> T accept(Visitor<T> v) { return v.visit(this); }
}
