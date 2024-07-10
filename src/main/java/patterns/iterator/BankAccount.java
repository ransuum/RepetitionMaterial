package patterns.iterator;

import java.util.UUID;

public class BankAccount {
    private UUID numberOfBank;
    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.numberOfBank = UUID.randomUUID();
        this.balance = balance;
        this.name = name;
    }

    public UUID getNumberOfBank() {
        return numberOfBank;
    }

    public void setNumberOfBank(UUID numberOfBank) {
        this.numberOfBank = numberOfBank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberOfBank=" + numberOfBank +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
