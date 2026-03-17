package lesson19;

abstract class Equipment {

    /*
      переменная - производитель

    создать два метода
    - включить
    - выключить
    - изменить громкость

    создать два класса - телефон и телевизор
    добавить в класс переменную - модель

     */

    private String producer;

    public Equipment(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
    abstract void turnOnn();

    abstract void turnOff();

    public abstract void changeVolume(int volume);

}
