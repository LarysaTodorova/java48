package homework3;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.id = 26759;
        myPhone.manufacturer = "USA";
        myPhone.model = " Aple IPhone 15 pro max";
        myPhone.price = 1300;

        System.out.println("ID номер моего телефона = " + myPhone.id);
        System.out.println("Производство телефона = " + myPhone.manufacturer);
        System.out.println("Модель телефона = " + myPhone.model);
        System.out.println("Цена телефона = " + myPhone.price);

        Phone mySecondPhone = new Phone();
        mySecondPhone.id = 55374;
        mySecondPhone.manufacturer = "China";
        mySecondPhone.model = "Xiaomi Redmi Note";
        mySecondPhone.price = 250;

        System.out.println("ID номер моего телефона = " + mySecondPhone.id);
        System.out.println("Производство телефона = " + mySecondPhone.manufacturer);
        System.out.println("Модель телефона = " + mySecondPhone.model);
        System.out.println("Цена телефона = " + mySecondPhone.price);

        Phone myThirdPhone = new Phone();
        myThirdPhone.id = 736422;
        myThirdPhone.manufacturer = "South Korea";
        myThirdPhone.model = " Samsung Galaxy S 24";
        myThirdPhone.price = 1700;

        System.out.println("ID номер моего телефона = " + myThirdPhone.id);
        System.out.println("Производство телефона = " + myThirdPhone.manufacturer);
        System.out.println("Модель телефона = " + myThirdPhone.model);
        System.out.println("Цена телефона = " + myThirdPhone.price);








    }
}
