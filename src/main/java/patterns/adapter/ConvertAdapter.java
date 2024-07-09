package patterns.adapter;

public class ConvertAdapter extends Decimeter implements Converter {
    @Override
    public Number convertToCm() {
        return converter(getNumb(), '*', 10);
    }

    @Override
    public Number convertToGKm() {
        return converter(getNumb(), '/', 10000);
    }

    @Override
    public Number convertToMm() {
        return converter(getNumb(), '*', 100);
    }

    public Number converter(Number n, Character o, int i) {
        if (o.equals('*')) return new Number(n.getNumb() * i);
        else return new Number(n.getNumb() / i);
    }
}
