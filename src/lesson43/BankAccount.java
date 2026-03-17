package lesson43;

public class BankAccount {

    private final String accountNumber;  // Номер счета
    private double balance;        // Баланс счета
    private String accountHolder;  // Владелец счета

    BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    void deposit(double amount) {
        this.balance += amount;  // Пополнение баланса
    }

    void withdraw(double amount) {
        this.balance -= amount;  // Снятие средств
    }

    void changeAccountHolder(String newHolder) {
        this.accountHolder = newHolder;  // Изменение владельца счета
    }

    String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Account Holder: " + accountHolder;
    }
}



