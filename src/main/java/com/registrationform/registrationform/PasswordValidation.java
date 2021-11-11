package com.registrationform.registrationform;

public class PasswordValidation {
    public boolean validPassword(String password) {
        String specialCases = "(.*[*^&@!].*$)";
        boolean passValid;
        boolean passLetter = false;
        boolean passDigit= false;
        for (int i = 0; i < password.length(); i++){
            char passCharacter = password.charAt(i);
            if (Character.isLetter(passCharacter)) {
                passLetter = true;
            }
            else if (Character.isDigit(passCharacter)) {
                passDigit = true;
            }
            if (passLetter && passDigit){
                break;
            }
        }
        passValid = passLetter && passDigit && password.length() >= 7 && password.matches(specialCases);
        return passValid;
    }
}
