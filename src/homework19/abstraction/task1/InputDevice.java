package homework19.abstraction.task1;

abstract class InputDevice {
/*
абстрактный класс InputDevice, который включает в себя абстрактные методы подключения и отключения,
а также может поддерживать поля или неабстрактные методы, общие для всех устройств ввода.
 От этого класса абстрактного наследуют классы Клавиатура и Мышь, реализующие абстрактные методы.
 */
    private String titel;

    abstract void connection();

    abstract void disсonnection();


    public void update() {
        System.out.println("our device updated ");
    }
}
