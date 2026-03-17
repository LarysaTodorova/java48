package lesson19;

 class Phone extends Equipment {

     private String model;

    @Override
    void turnOnn() {
        System.out.println("Телефон включен");

    }

    @Override
    void turnOff() {
        System.out.println("Телефон выключен");

    }

     public Phone(String producer, String model) {
         super(producer);
         this.model = model;
     }

     @Override
    public void changeVolume(int volume) {
         System.out.println("Громкость телефона" + getProducer() + " " + model + " ," +  volume);

    }
}
