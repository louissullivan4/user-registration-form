package com.registrationform;


public class EmailValidation {

    public boolean validEmail(String emailString) {
        String emailregex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return emailString.matches(emailregex);
    }
}
