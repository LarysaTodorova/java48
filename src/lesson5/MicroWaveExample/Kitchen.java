package lesson5.MicroWaveExample;

public class Kitchen {
    public static void main(String[] args) {
        System.out.println(" На кухню привезли микроволновку");
        System.out.println(" Давайте ее испытаем");


        MicroWave myMicroWave = new MicroWave();
        myMicroWave.start();
        myMicroWave.stop();


    }
}
