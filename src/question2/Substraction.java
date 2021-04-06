package question2;

public class Substraction implements Expression {

    private Expression number1;
    private Expression number2;


    public Substraction(Expression number1, Expression number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int interpreter() {
        return number1.interpreter() - number2.interpreter();
    }
}
