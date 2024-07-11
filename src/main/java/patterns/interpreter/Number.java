package patterns.interpreter;

public class Number implements Expression{
    private final double numb;

    public Number(double numb) {
        this.numb = numb;
    }

    @Override
    public double interpreter() {
        return numb;
    }
}
