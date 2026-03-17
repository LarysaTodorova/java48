package lesson12.task1;

public class Task1Method {
    public boolean isDeviceWorkingCorrectly(Device device){
        boolean checkResult = (device.getTemp1() > 100 && device.getTemp2() < 100);
        return checkResult;

    }

}
