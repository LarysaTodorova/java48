package practice12;

import lesson5.superCalc.UserInput;

public class DeviceDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        DeviceService service = new DeviceService();

        double temperature1 = userInput.inputDouble("Введите температуру в первой колбе:");
        double temperature2 = userInput.inputDouble("Введите температуру во второй колбе:");
        Device device = new Device(temperature1, temperature2);

        boolean checkDevice = service.ifDeviceWorkingCorrectly(device);

        if (checkDevice){
            System.out.println("Прибор работает корректно!");
        }else {
            System.out.println("Прибор не работает!");

        }

    }
}
