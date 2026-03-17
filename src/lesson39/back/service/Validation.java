package lesson39.back.service;

public class Validation {

    public String validate(String name, String description) {

        String validationResult = "";

        if (name == null) {
            validationResult = validationResult + "Название строчки не может быть null \n";
        }

        if (description == null) {
            validationResult = validationResult + "Описание не может быть null \n";
        }

        if (name.length() < 3) {
            validationResult = validationResult + "Название строчки не может быть менее 3-х символов \n";
        }

        if (name.length() > 15) {
            validationResult = validationResult + "Название строчки не может быть больще 15-ти символов \n";
        }

        return validationResult;

    }
}
