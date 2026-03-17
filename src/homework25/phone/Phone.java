package homework25.phone;

public class Phone {
    /*
    Напишите приложение для учета моделей телефонов (модель, производитель) на складе в салоне связи
    Необходимо добавлять новые элементы и искать по параметру (id, name и прочее)
     */
    private int id;
    private String model;
    private String producer;

    public Phone(int id, String model, String producer) {
        this.id = id;
        this.model = model;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
