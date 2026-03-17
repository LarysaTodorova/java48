package lesson7;

public class ChangeString3 {
    public static void main(String[] args) {

        String symbols = "012345-01-6789-101";

        //надо получить "012345*01-6789:101"

        int indexLast = symbols.lastIndexOf("-");
        System.out.println("индекс последнего вхождения " + indexLast);

        String part1 = symbols.substring(0, indexLast);
        System.out.println(part1);
        String part2 = ":";
        System.out.println(part2);
        String part3 = symbols.substring(indexLast + 1);
        System.out.println(part3);

        String finalVersion = part1+part2+part3;
        System.out.println(finalVersion);


    }
}
