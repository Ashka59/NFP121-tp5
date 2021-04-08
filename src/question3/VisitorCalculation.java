package question3;

    public class VisitorCalculation extends Visitor<Integer> {
    @Override
    public Integer visit(LeafExpression leafExpression) {
        return leafExpression.getNumber();
    }
    @Override
    public Integer visit(Substraction substraction) {
        return substraction.op1.accept(this) - substraction.op2.accept(this);
    }
}
