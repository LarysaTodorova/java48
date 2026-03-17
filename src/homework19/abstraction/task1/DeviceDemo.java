package homework19.abstraction.task1;

public class DeviceDemo {
    public static void main(String[] args) {

        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();

        keyBoard.connection();
        keyBoard.disсonnection();

        mouse.connection();
        mouse.disсonnection();


    }
}
