package practice12;

public class DeviceService {

    public boolean ifDeviceWorkingCorrectly(Device device){
        boolean checkResult = (device.getTemp1() >100 && device.getTemp2() < 100);
        return checkResult;



    }
}
