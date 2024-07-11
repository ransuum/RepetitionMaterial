package patterns.balking;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();

        Thread payment1 = new Thread(()-> creditCard.makePayment(10550d));
        Thread payment2 = new Thread(()-> creditCard.makePayment(28000d));

        payment1.start();

        payment2.start();
    }
}
