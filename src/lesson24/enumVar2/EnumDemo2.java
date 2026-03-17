package lesson24.enumVar2;

import java.util.Arrays;

public class EnumDemo2 {
    public static void main(String[] args) {

        DayOfWeek monday = DayOfWeek.SATURDAY;

        System.out.println(monday.getTitle());

        System.out.println(Arrays.toString(DayOfWeek.values()));

        int sundayIndex = DayOfWeek.SUNDAY.ordinal();
        System.out.println(sundayIndex);

        DayOfWeek sunday = DayOfWeek.valueOf("SUNDAY");
        System.out.println(sunday);
    }
}
