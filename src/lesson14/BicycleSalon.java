package lesson14;

import java.util.Arrays;

public class BicycleSalon {
    public static void main(String[] args) {

        Bicycle[] bicycles = new Bicycle[5];



        bicycles[0] = new Bicycle(1,"B1","CityType", 200);
        bicycles[1] = new Bicycle(2,"B1","MountainType", 250);
        bicycles[2] = new Bicycle(3,"B2","CityType", 300);
        bicycles[3] = new Bicycle(4,"B2","MountainType", 700);
        bicycles[4] = new Bicycle(5,"B3","CityType", 1000);

        int priceCounter = 0;

        for (int i = 0; i < bicycles.length; i++) {
          int  lowPrice = bicycles[i].getPrice();
          if (lowPrice < 500){
              priceCounter++;
          }

        }
        System.out.println("Количество велосипедов с ценой ниже 500 =  " + priceCounter);


}}
