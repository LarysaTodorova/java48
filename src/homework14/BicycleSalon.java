package homework14;

import java.util.Arrays;

public class BicycleSalon {
    public static void main(String[] args) {
/*
1) Сохдать массив из 15 элементов и заполнить их
2) посчитать количество велосипедов городского типа с ценой ниже 500
3*) создать отдельный массив куда сохранить эти велосипеды
 */

        Bicycle[] bicycles = new Bicycle[15];

        bicycles[0] = new Bicycle(1,"KTM", "CityType",650);
        bicycles[1] = new Bicycle(2,"GT", "MountainType",800);
        bicycles[2] = new Bicycle(3,"Cube", "CityType",4550);
        bicycles[3] = new Bicycle(4,"Cube", "RoadType",1000);
        bicycles[4] = new Bicycle(5,"KTM", "RoadType",300);
        bicycles[5] = new Bicycle(6,"KTM", "CityType",2500);
        bicycles[6] = new Bicycle(7,"GT", "MountainType",450);
        bicycles[7] = new Bicycle(8,"GT", "MountainType",900);
        bicycles[8] = new Bicycle(9,"KTM", "CityType",300);
        bicycles[9] = new Bicycle(10,"KTM", "MountainType",700);
        bicycles[10] = new Bicycle(11,"Cube", "CityType",450);
        bicycles[11] = new Bicycle(12,"Cube", "RoadType",750);
        bicycles[12] = new Bicycle(13,"GT", "CityType",250);
        bicycles[13] = new Bicycle(14,"GT", "RoadType",1550);
        bicycles[14] = new Bicycle(15,"KTM", "MountainType",250);

        int bicycleCounter = 0;

        for (int i = 0; i < bicycles.length; i++) {
            double lowPrice = bicycles[i].getPrice();
            String bicycleType = bicycles[i].getType();
            if (lowPrice < 500 && bicycleType.equals("CityType")){
                bicycleCounter++;
            }

        }
        System.out.println("Количество городских велосипедов с ценой ниже 500 = " + bicycleCounter + " ;");
        

        Bicycle[] newBicycleArray = new Bicycle[bicycleCounter];
        int newBicycleCounter =0;

        for (int i = 0; i < bicycles.length; i++) {
            if (bicycles[i].getPrice() < 500 && bicycles[i].getType().equals("CityType")) {
                newBicycleArray[newBicycleCounter] = bicycles[i];
                newBicycleCounter++;

            }
        }
        System.out.println(Arrays.toString(newBicycleArray));

}
    }

