package practiceLesson6;

public class Printer {
    String model;
    String producer;
    double price;

    public Printer(String model, String producer, double price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

     //public void setModel(String model) {
     //   this.model = model;
//}

    public String getProducer() {
        return producer;
    }

   // public void setProducer(String producer) {
     //   this.producer = producer;
   // }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
