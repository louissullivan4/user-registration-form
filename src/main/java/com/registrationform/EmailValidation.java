package com.registrationform;


/**
 * The type Email validation.
 */
public class EmailValidation {

    /**
     * Valid email boolean.
     *
     * Reference for Email Regex used:
     * Mailtrap, 31/01/2020, Simple Email Validation in Java, https://mailtrap.io/blog/java-email-validation/
     *
     * @param emailString the email string
     * @return the boolean
     */
    public boolean validEmail(String emailString) {
        String emailregex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return emailString.matches(emailregex);
    }
}
