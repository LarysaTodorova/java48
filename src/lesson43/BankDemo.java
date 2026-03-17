package lesson43;

public class BankDemo {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");

        account.deposit(500.0);
        System.out.println(account.getAccountInfo());  // Выведет информацию о счете

        account.withdraw(200.0);
        System.out.println(account.getAccountInfo());  // Обновленная информация

        account.changeAccountHolder("Jane Doe");
        System.out.println(account.getAccountInfo());  // Обновленный владелец счета

    }
}
