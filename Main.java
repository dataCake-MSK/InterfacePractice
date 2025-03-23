import account.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("MyAllowance", 3000);
        myAccount.deposit(6000);
        myAccount.addInterest();
        myAccount.displayAccountInfo();
    }
}
