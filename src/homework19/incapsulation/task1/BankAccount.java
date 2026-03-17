package homework19.incapsulation.task1;

public class BankAccount {
    /*
    Создайте класс BankAccount, который инкапсулирует баланс счета.
     Балансы не должны быть доступны для прямого изменения извне,
    а изменяться только с помощью методов deposit(для средств коррекции) и withdraw(для средств снятия).
     */

    private double countBalance ;

    public double getCountBalance() {
        return countBalance;
    }

    public void setCountBalance(double countBalance) {
        this.countBalance = countBalance;
    }


    public boolean deposit() {
        if (countBalance > 100);
        return true;
    }
    public void withDraw() {
        System.out.println("Enter your pin code");


        }
    }

