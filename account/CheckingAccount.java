package account;

public class CheckingAccount implements BankAccount, InterestMechanism {
    String accountNum;
    double balance;

    public CheckingAccount(String accountNum, double initBalance) {
        this.accountNum = accountNum;
        this.balance = initBalance;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(amount + " is withdrawn." + " Balance: " + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " is deposited." + " Balance: " + balance);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println(accountNum + " has " + balance);
    }

    @Override
    public void addInterest() {
        double interest = balance * (InterestMechanism.INTEREST_RATE_202501 / 100.0);
        balance += interest;
        System.out.println("Interest added: " + interest + ", New Balance: " + balance);
    }

    public void myMethod(){
        System.out.println("Hello");
    }
}
