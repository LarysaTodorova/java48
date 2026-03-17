package consultation6;

public class CarEngine {

    private String engine;

    public CarEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
