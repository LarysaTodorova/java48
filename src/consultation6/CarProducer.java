package consultation6;

public class CarProducer {
    private String producer;
    private CarModel model;
    private CarEngine engine;

    public CarProducer(String producer, CarModel model, CarEngine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public CarModel getModel() {
        return model;
    }

    public CarEngine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "CarProducer{" +
                "producer='" + producer + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                '}';
    }
}
