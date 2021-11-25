package com.registrationform;

/**
 * The type Password validation.
 */
public class PasswordValidation {
    /**
     * Valid password boolean.
     *
     * @param password the password
     * @return the boolean
     */
    public boolean validPassword(String password) {
        String specialCases = "(.*[*^&@!].*$)";
        boolean passValid;
        boolean passLetter = false;
        boolean passDigit= false;
        boolean passSpecial = false;
        for (int i = 0; i < password.length(); i++){
            char passCharacter = password.charAt(i);
            if (Character.isLetter(passCharacter)) {
                passLetter = true;
            }
            else if (Character.isDigit(passCharacter)) {
                passDigit = true;
            }
            else if(specialCases.contains(Character.toString(passCharacter))) {
                passSpecial = true;
            }
            if (passLetter && passDigit && passSpecial){
                break;
            }
        }
        passValid = passLetter && passDigit && passSpecial && password.length() >= 7;
        return passValid;
    }
}
