package practice;

import lesson5.superCalc.UserInput;

public class Notes {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int grade = userInput.inputInteger("grade");
        int timeLeft = 45;
        int totalTime = 0;
        String message = "";

        switch (grade){
            case 12:
            case 11:
            case 10:
                totalTime = timeLeft + 60;
                message = "Grate";
                break;
            case 9:
            case 8:
            case 7:
                totalTime = timeLeft + 45;
                message = "Very good";
                break;
            case 6:
            case 5:
            case 4:
                totalTime = timeLeft +15;
                message = "Good";
                break;
            case 3:
                totalTime = timeLeft - 30;
                message = "Bad";
                break;
            case 2:
            case 1:
            case 0:
                totalTime = 0;
                message = "Very bad";

        }

        if (totalTime > 60) totalTime = 60;
        System.out.println(message + " You can watch TV " + totalTime + " Minutes");
    }

}
