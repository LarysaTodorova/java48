package consultation8.homeWork;

import java.util.Arrays;

public class OneClassCity {
    public static void main(String[] args) {
        /*
        Попробуйте смоделировать структурные классы для адресов хранения

город
улица
дом
квартира
Сделайте два варианта

Все параметры будут храниться внутри одного класса
для каждого параметра создайте свой класс и используйте массивы для хранения данных
И сравните - создайте пять разных адресов для двух вариантов

И посмотрите, как найти все адреса на какой-то одной улице
         */

        int flat1 = 1;
        int flat2 = 2;
        int flat3 = 3;
        int flat4 = 4;
        int flat5 = 5;

        int[] flat = {flat1,flat2,flat3,flat4,flat5};

        int house1 = 1;
        int house2 = 2;
        int house3 = 3;

        int[] house = {house1,house2,house3};



        String street1 = "RoseStreet";
        String street2 = "CentralStreet";

        String city = "London";

        System.out.println("City: " + city + ",  street: " + street1 + " , house " + house1 + " , flat " + flat3 + ";");
        System.out.println("City: " + city + ",  street: " + street2 + " , house " + house2 + " , flat " + flat2 + ";");
        System.out.println("City: " + city + ",  street: " + street2 + " , house " + house3 + " , flat " + flat4 + ";");
        System.out.println("City: " + city + ",  street: " + street1 + " , house " + house2 + " , flat " + flat5 + ";");
        System.out.println("City: " + city + ",  street: " + street1 + " , house " + house3 + " , flat " + flat2 + ";");

        System.out.println("=====================================");

        System.out.println("City: " + city + " , street: " + street1 + " , houses " + Arrays.toString(house) +  " , flats " + Arrays.toString(flat));







    }
}
