package lesson21.library;

public class LibraryCatalog {

     private MediaItem[] items = new MediaItem[10];
    private int itemCount = 0;

    public void addMediaItem(MediaItem newItem) {
        if (itemCount < items.length) {
            items[itemCount] = newItem;
            itemCount++;
            System.out.println("New media item added: " + newItem.getTitle());
        }else {
            System.out.println("Library is full can not add new items:");
        }
    }
    public void printAllItems() {
        System.out.println("Library info:");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i].printInfo();
            }

        }
    }
}
