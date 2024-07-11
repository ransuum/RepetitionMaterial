package patterns.interpreter;

public class UahToUsd implements Expression{
    private final Expression amount;
    private final Double COURSE = 0.025;

    public UahToUsd(Expression amount) {
        this.amount = amount;
    }

    @Override
    public double interpreter() {
        return amount.interpreter() * COURSE;
    }
}
