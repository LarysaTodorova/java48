package loop;

import lesson5.superCalc.UserInput;

public class Example2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        boolean condition = true;

        while (condition){
            System.out.println("choose your number");
            System.out.println("1. Monday");
            System.out.println("2. Wednesday");
            System.out.println("3. Friday");
            System.out.println("4. Exit..");

            int number = userInput.inputInteger("your choose: ");

            switch (number){
                case 1:
                    System.out.println("your choose is Monday ");
                    break;
                case 2:
                    System.out.println("your choose is Wednesday ");
                    break;
                case 3:
                    System.out.println("your choose is friday ");
                    break;
                case 4:
                    System.out.println("Exit ..." );
                    condition = false;
                    break;
                default:
                    System.out.println("Wrong choose ");
            }
        }
        System.out.println("Loop while finished! ");
    }
}