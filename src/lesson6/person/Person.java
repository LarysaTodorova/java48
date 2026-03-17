package lesson6.person;

public class Person {

    String firstName;
    String surName;
    String birthday;
    int age;
    String address;


    public void initData(String name1, String name2,  String bd, int personAge,String personAddress) {
        firstName = name1;
        surName = name2;
        birthday = bd;
        age = personAge;
        address = personAddress;

    }


    public void printPersonDate(){
        System.out.println("Person info: ");
        System.out.println("Firstname: " + firstName);
        System.out.println("Second name: " +surName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);


    }

}
