package practiceLesson6;

public class Computer {
   private String model;
    private String description;
   private double price;

    public Computer(String model, String description, double price) {
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public void printComputerData(){
        System.out.println(" Данные о компьютере:");
        System.out.println(" Model: " + model);
        System.out.println(" Description: " + description);
        System.out.println(" Price: " + price);


    }

    public void change(double newPrice){
         price = newPrice;

    }

}
