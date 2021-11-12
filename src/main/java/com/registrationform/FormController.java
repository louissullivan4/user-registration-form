package com.registrationform;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * The type Form controller.
 */
public class FormController {
    /**
     * The Submit but.
     */
    public Button submitBut;
    /**
     * The Email field.
     */
    public TextField emailField;
    /**
     * The Pass field.
     */
    public TextField passField;
    /**
     * The Error alert.
     */
    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
    /**
     * The Confirm alert.
     */
    Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);

    /**
     * On submit click.
     */
    public void onSubmitClick(){
        // if email field is not empty
        if (!emailField.getText().isEmpty()) {
            // get the value inputed
            String emailString = emailField.getText();
            // create validation class
            EmailValidation ev = new EmailValidation();
            // check if its valid
            boolean emailValid = ev.validEmail(emailString);
            // if its not valid show Alert window
            if (!emailValid){
                errorAlert.setHeaderText("Form Error!");
                errorAlert.setContentText("The email you entered is invalid!");
                errorAlert.showAndWait();
                return;
            }
        }
        // if the email field is empty show Alert window
        else if (emailField.getText().isEmpty()){
            errorAlert.setHeaderText("Form Error!");
            errorAlert.setContentText("Please enter your email!");
            errorAlert.showAndWait();
            return;
        }
        if (!passField.getText().isEmpty()) {
            String passString = emailField.getText();
            PasswordValidation pv = new PasswordValidation();
            boolean passValid = pv.validPassword(passString);
            if (!passValid){
                errorAlert.setHeaderText("Form Error!");
                errorAlert.setContentText("The password you entered is of an insufficient strength!");
                errorAlert.showAndWait();
                return;
            }
        }
        else if (passField.getText().isEmpty()){
            errorAlert.setHeaderText("Form Error!");
            errorAlert.setContentText("Please enter a password!");
            errorAlert.showAndWait();
            return;
        }
        // everything is valid so form is complete
        confirmAlert.setHeaderText("Form Complete!");
        confirmAlert.setContentText("Your registration is complete!");
        confirmAlert.showAndWait();
    }
}
