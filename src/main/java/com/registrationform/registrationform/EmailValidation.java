package com.registrationform.registrationform;

public class EmailValidation {

    public boolean validEmail(String emailString) {
        return emailString.contains("@") && emailString.contains(".com");
    }
}
