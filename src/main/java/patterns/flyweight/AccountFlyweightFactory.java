package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AccountFlyweightFactory {
    private static final Map<String, AccountType> accounts = new HashMap<>();

    public static AccountType accountType(String accountTypeName, double interestRate, Double minimumBalance){
        AccountType accountType = accounts.get(accountTypeName);

        if(accountType == null){
            accountType = new Account(accountTypeName, interestRate, minimumBalance);
            accounts.put(accountTypeName, accountType);
            System.out.println("Created account type " + accountTypeName);
        }
        return accountType;
    }
}
