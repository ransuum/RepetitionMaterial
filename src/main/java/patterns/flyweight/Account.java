package patterns.flyweight;

import java.util.UUID;

public class Account implements AccountType{
    private final String accountTypeName;
    private final double interestRate;
    private final double minimumBalance;

    public Account(String accountTypeName, double interestRate, double minimumBalance) {
        this.accountTypeName = accountTypeName;
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Account{" +
                " accountTypeName='" + accountTypeName + '\'' +
                ", interestRate='" + interestRate + '\'' +
                ", minimumBalance=" + minimumBalance +
                '}');
    }

}
