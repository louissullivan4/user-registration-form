package com.registrationform.registrationform;

public class EmailValidation {

    public boolean constainsAT(String emailString) {
        return emailString.contains("@");
    }

    public boolean constainsCom(String emailString) {
        return emailString.contains(".com");
    }
}
