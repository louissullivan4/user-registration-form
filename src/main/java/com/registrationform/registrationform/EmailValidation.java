package com.registrationform.registrationform;

public class EmailValidation {

    public boolean constainsAT(String emailString) {
        return emailString.contains("@");
    }

    public boolean constainsCom(String emailString) {
        return emailString.contains(".com");
    }

    public boolean validEmail(String emailString) {
        return emailString.contains("@") && emailString.contains(".com");
    }
}
