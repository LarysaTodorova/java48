package homeworkProject.task1;

public class ArraySortDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();


        service.createArrayFromUserInput();
        System.out.println();

        service.fillArrayFromUserInput();
        System.out.println();

        service.sort();
        System.out.println();

        service.printArray();

    }
}
