package practiceLesson6;

public class PrinterDemo {
    public static void main(String[] args) {
         Printer myPrinter = new Printer("Lser 54", "HP",  500);

        System.out.println(myPrinter.getModel());
        System.out.println(myPrinter.getProducer());
        System.out.println(myPrinter.getPrice());

        myPrinter.setPrice(350);

        System.out.println(" Цена после переоценки: " +myPrinter.getPrice());

    }
}
