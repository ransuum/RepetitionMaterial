package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BankRepo implements Container{
    private List<BankAccount> dbOfBankAcc = new ArrayList<>();
    @Override
    public Iterator getIterator() {
        return new AccountIterator();
    }

    public BankAccount addBankAccount(BankAccount bankAccount) {
        dbOfBankAcc.add(bankAccount);
        return bankAccount;
    }
    private class AccountIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < dbOfBankAcc.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) return dbOfBankAcc.get(index++);
            return null;
        }
    }
}
