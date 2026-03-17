package lesson15;

public class LinearSearch {
    public static void main(String[] args) {

        SearchInArray search = new SearchInArray();

        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int searchElement = 5;

        //найти индекс в массиве элемент которого равен 5;

        int indexSearchResult = search.linearSearch(arrayForSearch, searchElement);

        if (indexSearchResult >= 0){
            System.out.println("Search element " + searchElement + " has index № " + indexSearchResult);
        }else {
            System.out.println("Search element " + searchElement + " not found");
        }

    }

}
