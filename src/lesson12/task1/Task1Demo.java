package lesson12.task1;

import lesson5.superCalc.UserInput;

public class Task1Demo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Task1Method task1Method = new Task1Method();


        double temp1 = userInput.inputInteger("Введите градусы первой колбы:");
        double temp2 = userInput.inputInteger("Введите градусы второй колбы:");
        Device device = new Device(temp1, temp2);
        boolean checkDevice = task1Method.isDeviceWorkingCorrectly(device);


        if (checkDevice) {
            System.out.println("Устройство работает корректно:");
        } else {
                System.out.println("Устройство не работает");

            }


        }
    }
