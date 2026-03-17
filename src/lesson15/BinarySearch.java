package lesson15;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array= {1,3,5,7,9,12,15,19,21,26,29,35,39,43,48,50,100};

        int elementForSearch = 19;

        SearchInArray search = new SearchInArray();

        int indexSearchElement = search.binarySearch(array, elementForSearch);
        if (indexSearchElement >= 0) {
            System.out.println("Search element " + elementForSearch + " has index № " + indexSearchElement);
        }else {
            System.out.println("Search element " + elementForSearch + " not found");
        }


    }
}
