package account;

public interface BankAccount {
    void withdraw(double amount);  // No abstract because it is default.
    void deposit(double amount);   // Usually no implementation.
    void displayAccountInfo();     // From Java8+, default/static/private methods with
}                                  // implementations can be included


