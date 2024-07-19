package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new ConvertAdapter();
        Number n1 = converter.convertToMm();
        System.out.println(n1);

        System.out.println(converter.convertToCm());
    }
}
