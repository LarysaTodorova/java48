package lesson21.teaTask2;

public class GreenTea extends Tea{

    public GreenTea(int teaId, TeaProducer teaProducer, String teaName) {
        super(teaId, teaProducer, teaName, "Green");
    }
    public void drink() {
        System.out.println("Пить охлажденным");
    }
}
