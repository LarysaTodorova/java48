package practice;

import lesson5.superCalc.UserInput;

import java.util.Scanner;

public class ShootUtil {

    public Shoot prepareShoot() {

        UserInput userInput = new UserInput();
        String vert = userInput.inputText("Введите первую координату для выстрела:");
        int hor = userInput.inputInteger("Введите вторую координату для выстрела:");

        Shoot shoot = new Shoot(vert, hor);
        return shoot;

    }
    public void printShoot(Shoot shoot){
        System.out.println("Вы произвели выстрел по координатам: " + shoot.getVert() + "-" + shoot.getHor());


    }


}
