package lesson7;

public class ChangeString2 {
    public static void main(String[] args) {

        String symbols = "012345-01-6789-101";

        // поиск индекса первого вхождения нашего искомого текста в строку

        int index = symbols.indexOf("6789");
        System.out.println("index : " + index);

        int index2 = symbols.indexOf("-");
        System.out.println("вхождение символа '-' " + index2);


        //замена символов в строке на другие

        String replaceAllLine = symbols.replaceAll("-", "*");
        System.out.println(replaceAllLine);
        System.out.println(symbols);

        String replaceFirstSymbol = symbols.replaceFirst("-", ":");
        System.out.println(replaceFirstSymbol);


        int index3 = symbols.lastIndexOf("-");
        System.out.println("индекс последнего вхождения " + index3);


    }

}
