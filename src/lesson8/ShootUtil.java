package lesson8;

import lesson5.superCalc.UserInput;

public class ShootUtil {

    public Shoot prepareShoot() {
        UserInput userInput = new UserInput();
        String vert = userInput.inputText("Введите первую координату для выстрела:");
        int horiz = userInput.inputInteger("Введите вторую координату для выстрела:");

        Shoot shoot = new Shoot(vert, horiz);
        return shoot;

    }

    public void printShoot(Shoot shoot){
        System.out.println("Вы произвели выстрел по координам: " + shoot.getVert() + "-" + shoot.getHoriz());

    }


}