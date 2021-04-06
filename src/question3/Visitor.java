package question3;

public abstract class Visitor<T> {

    public abstract T visit(Substraction substraction);

    public abstract T visit(LeafExpression leafExpression);
}
