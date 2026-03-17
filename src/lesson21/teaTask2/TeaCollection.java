package lesson21.teaTask2;

public class TeaCollection {

    Tea[] teas;

    public TeaCollection(int sizeOfTeaCollection) {
        this.teas = new Tea[sizeOfTeaCollection];
    }

    public Tea[] getTeas() {
        return teas;
    }
    public int add(Tea newTea) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i] == null) {
                teas[i] = newTea;
                return i;
            }
        }
        return -1;
    }
    public Tea findById(int searchTeaId) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaId() == searchTeaId) {
                return teas[i];
            }
        }
        return null;
    }
    public Tea findByName(String searchTeaName) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaName().equals(searchTeaName)) {
                return teas[i];
            }
        }
        return null;
    }
    public boolean delete(Tea teaForDelete) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].equals(teaForDelete)){
                teas[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean delete(int teaIdForDelete) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaId() == teaIdForDelete) {
                teas[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean delete(String teaNameForDelete) {
        for (int i = 0; i < teas.length; i++) {
            if (teas[i].getTeaName().equals(teaNameForDelete)) {
                teas[i] = null;
                return true;
            }
        }
        return false;
    }
    public void printCollection() {
        System.out.println("=======Наша чайная коллекция=========");
        for (int i = 0; i < teas.length; i++) {
            if (teas[i] != null) {
                System.out.println("# " + teas[i].getTeaId());
                System.out.println("Производитель " + teas[i].getTeaProducer().getProducerName());
                System.out.println("Название " + teas[i].getTeaName());
                System.out.println("Тип чая " + teas[i].getTeaType());

            }else {
                System.out.println("Пустая ячейка массива! ");
            }
            System.out.println("----------------------------");
        }
    }
}
