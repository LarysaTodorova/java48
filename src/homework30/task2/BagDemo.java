package homework30.task2;

import java.util.Set;
import java.util.TreeSet;

public class BagDemo {
    public static void main(String[] args) {

        Set<Bag> bags = new TreeSet<>();

        bags.add(new Bag("material", "M", "yellow"));
        bags.add(new Bag("plastic", "L", "blue"));
        bags.add(new Bag("plastic", "L", "grey"));
        bags.add(new Bag("material", "XL", "black"));

//        for (Bag bag : bags) {
//            System.out.println("Size : " + bag.getSize() + ", fabric : " + bag.getFabric() + ", color : " + bag.getColor());
//        }

        bags.forEach(System.out::println);
    }
}
