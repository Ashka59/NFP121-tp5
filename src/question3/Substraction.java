package question3;

public class Substraction implements Expression {

    public Integer result;
    private LeafExpression number1;
    private LeafExpression number2;

    public LeafExpression getNumber1() { return number1; }
    public LeafExpression getNumber2() { return number2; }
    public Integer getResult() { return result; }

    public Substraction(Expression number1, Expression number2) {
        Integer numberResult1 = null;
        Integer numberResult2 = null;
        if (number1 instanceof Substraction && ((Substraction) number1).result != null){
            numberResult1 = ((Substraction) number1).getResult();
        }
        else if (number1 instanceof Substraction && ((Substraction) number1).result == null){
            numberResult1 = ((Substraction) number1).getNumber1().getNumber()-((Substraction) number1).getNumber2().getNumber();
        }
        else if (number1 instanceof LeafExpression){
            numberResult1 = ((LeafExpression) number1).getNumber();
        }
        if (number2 instanceof Substraction && ((Substraction) number2).result != null){
            numberResult2 = ((Substraction) number2).getResult();
        }
        else if (number2 instanceof Substraction && ((Substraction) number2).result == null){
            numberResult2 = ((Substraction) number2).getNumber1().getNumber()-((Substraction) number2).getNumber2().getNumber();
        }
        else if (number2 instanceof LeafExpression){
            numberResult2 = ((LeafExpression) number2).getNumber();
        }
        result=numberResult1-numberResult2;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
       return v.visit(this);
    }

}
