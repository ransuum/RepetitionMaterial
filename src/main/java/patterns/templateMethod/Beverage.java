package patterns.templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    private List<Integer> totalPrice = new ArrayList<>();

    public List<Integer> getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(List<Integer> totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Шаблонный метод
    public final void purchase(int count) {
        chooseBeverage();
        addToCart();
        calculatePrice(count);
        checkout();
        printReceipt();
    }

    abstract void chooseBeverage();
    abstract void addToCart();
    abstract void calculatePrice(int count);

    void checkout() {
        System.out.println("Checking out...");
    }

    void printReceipt() {
        System.out.println("Total Price: " + getTotalPrice().stream().mapToInt(Integer::intValue).sum());
    }
}
