package patterns.iterator;

public class Main {
    public static void main(String[] args) {
        BankRepo bankRepo = new BankRepo();

        bankRepo.addBankAccount(new BankAccount(335.25, "Biden"));
        bankRepo.addBankAccount(new BankAccount(1000.35, "John"));

        for (Iterator i = bankRepo.getIterator(); i.hasNext();){
            BankAccount bankAccount = (BankAccount) i.next();
            System.out.println(bankAccount);
        }
    }
}
