package lesson30;

public class Phone implements Comparable<Phone>{
    private String name ;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Phone phoneToCompare) {
        return name.compareTo(phoneToCompare.getName());
    }
}
