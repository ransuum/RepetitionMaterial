package patterns.flyweight;

public class Main {
    public static void main(String[] args) {
        AccountType savingsType = AccountFlyweightFactory.accountType("Savings", 2.5, 100.0);
        AccountType checkingType = AccountFlyweightFactory.accountType("Checking", 0.5, 50.0);

        UserAccount user1 = new UserAccount("Alice", savingsType, 1000.0);
        user1.setBalance_bigger_than_minimal(user1.getBalance() > 100.0);
        UserAccount user2 = new UserAccount("Bob", checkingType, 500.0);
        user2.setBalance_bigger_than_minimal(user1.getBalance() > 50.0);
        UserAccount user3 = new UserAccount("Charlie", savingsType, 1500.0);
        user3.setBalance_bigger_than_minimal(user1.getBalance() > 100.0);

        user1.displayAccountDetails();
        user2.displayAccountDetails();
        user3.displayAccountDetails();
    }
}
