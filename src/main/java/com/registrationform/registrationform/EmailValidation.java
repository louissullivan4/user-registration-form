package com.registrationform.registrationform;


public class EmailValidation {

    public boolean validEmail(String emailString) {
        String atSymbol = "@";
        char atChar = atSymbol.charAt(0);
        int atCounter = 0;
        for (int charcount = 0; charcount < emailString.length(); charcount++){
            if (emailString.charAt(charcount) == atChar){
                atCounter = atCounter + 1;
            }
        }
        return atCounter == 1;
    }
}
