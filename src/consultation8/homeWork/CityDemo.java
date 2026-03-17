package consultation8.homeWork;

public class CityDemo {
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

        Flat flat1 = new Flat(1);
        Flat flat2 = new Flat(2);
        Flat flat3 = new Flat(3);
        Flat flat4 = new Flat(4);
        Flat flat5 = new Flat(5);

        Flat[] flats = { flat1, flat2, flat3, flat4, flat5};
        Flat[] flats1 = {flat2};
        Flat[] flats2 = {flat4};



        House house1 = new House(1, flats);
        House house2= new House(2, flats1);
        House house3 = new House(3, flats2);

        House[] houses = { house1, house2, house3};
        House[] houses2 = {house2};
        House[] houses3 = {house3};


        Street street1 = new Street("One", houses);
        Street street2 = new Street("Two", houses2);
        Street street3 = new Street("Two", houses3);


        City city1 = new City("Paris", street2);
        City city2 = new City("myCity", street3);
        City city3 = new City("Paris", street1);

        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);



    }
}
