package lesson37;

import lesson5.superCalc.UserInput;

import java.util.function.Supplier;

public class UserDemo {
    public static void main(String[] args) {

        Supplier<UserSupplier> createUser = () -> {
            UserInput ui = new UserInput();
            String name = ui.inputText("Enter an user name: ");
            return new UserSupplier(name);

        };

        for (int i = 0; i < 3; i++) {
            System.out.println(createUser.get());

        }
    }

}
