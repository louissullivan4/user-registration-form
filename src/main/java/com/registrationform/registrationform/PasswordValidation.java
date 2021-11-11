package com.registrationform.registrationform;

public class PasswordValidation {
    public boolean validPdLen(String password) {
        return password.length() >= 7;
    }
}
