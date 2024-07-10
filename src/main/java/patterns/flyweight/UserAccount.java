package patterns.flyweight;

import java.util.UUID;

public class UserAccount {
    private final UUID id = UUID.randomUUID();
    private final String username;
    private final AccountType accountType;
    private double balance;
    private boolean balance_bigger_than_minimal;

    public UserAccount(String username, AccountType accountType, double initialBalance) {
        this.username = username;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void displayAccountDetails() {
        System.out.println("id: " + id);
        System.out.println("User: " + username);
        System.out.println("Balance: $" + balance);
        System.out.println("balance_bigger_than_minimal: " + balance_bigger_than_minimal);
        accountType.displayInfo();
        System.out.println("------------------------");
    }

    public boolean isBalance_bigger_than_minimal() {
        return balance_bigger_than_minimal;
    }

    public void setBalance_bigger_than_minimal(boolean balance_bigger_than_minimal) {
        this.balance_bigger_than_minimal = balance_bigger_than_minimal;
    }

    public double getBalance() {
        return balance;
    }
}
