package question3;

    public class VisitorCalculation extends Visitor<Integer> {


    @Override
    public Integer visit(Substraction substraction) {
        return substraction.result;
    }

    @Override
    public Integer visit(LeafExpression leafExpression) {
        return leafExpression.getNumber();
    }
}
