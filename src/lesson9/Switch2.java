package lesson9;

import lesson5.superCalc.UserInput;

public class Switch2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите число от 1 до 10");

        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:{
                System.out.println("Your number is not correct");
            }


        }


    }

}
