package patterns.adapter;

public class Number {
    private int numb;

    public Number(int numb) {
        this.numb = numb;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "Number{" +
                "numb=" + numb +
                '}';
    }
}
