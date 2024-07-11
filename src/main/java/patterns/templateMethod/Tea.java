package patterns.templateMethod;

import java.util.List;

public class Tea extends Beverage{

    @Override
    void chooseBeverage() {
        System.out.println("Choosing tea");
    }

    @Override
    void addToCart() {
        System.out.println("Adding tea");
    }

    @Override
    void calculatePrice(int count) {
        System.out.println("Calculating price for Tea...");
        List<Integer> prices = getTotalPrice();
        prices.add(count * 50);
        setTotalPrice(prices);

    }
}
