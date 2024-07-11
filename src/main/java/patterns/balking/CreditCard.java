package patterns.balking;

public class CreditCard {
    private boolean isCardUsed = false;
    private boolean isPaymentInProgress = false;
    private double AMOUNT = 24678d;

    public synchronized void makePayment(double amount) {
        if (isPaymentInProgress || isCardUsed) {
            System.out.println("Payment cannot be processed. Either payment is already in progress or the card has been used.");
            return;
        }

        isPaymentInProgress = true;
        System.out.println("Processing payment of $" + amount);

        if ((AMOUNT - amount) < 0) throw new RuntimeException("Amount must be greater than zero.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isCardUsed = true;
        isPaymentInProgress = false;
        AMOUNT = AMOUNT - amount;
        System.out.println("Payment of $" + amount + " completed.");
    }
}
