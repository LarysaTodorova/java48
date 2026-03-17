package myselfWork39.back.service;

import myselfWork39.back.dto.Request;

public class Validation {

    public String validate(Request request) {

        String validationResult = "";

        if (request.getName() == null) {
            validationResult = validationResult + "Name can not be null \n";
        }

        if (request.getName().length() < 3) {
            validationResult = validationResult + "Name can not be less than 3 symbols \n";
        }

        if (request.getName().length() > 10) {
            validationResult = validationResult + "Name can not be more than 10 symbols \n";
        }

        if (request.getDescription() == null) {
            validationResult = validationResult + "Description can not be null \n";
        }

        if (request.getDescription().length() < 7) {
            validationResult = validationResult + "Description can not be less than 5 symbols \n";
        }

        if (request.getDescription().length() > 25) {
            validationResult = validationResult + "Description can not be more than 25 symbols \n";
        }

        return validationResult;
    }
}
