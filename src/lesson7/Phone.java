package lesson7;

public class Phone {

   private String producer;
    private String model;
   private String color;
   private double price;


    public Phone(String producer, String model, String color, double price) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

   // public void setProducer(String producer) {
     //   this.producer = producer;
   // }

    public String getModel() {
        return model;
    }

    //public void setModel(String model) {
     //   this.model = model;
    //}

    public String getColor() {
        return color;
    }

   // public void setColor(String color) {
     //   this.color = color;
    //}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
