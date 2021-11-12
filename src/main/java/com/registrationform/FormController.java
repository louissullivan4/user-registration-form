package com.registrationform;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FormController {
    public Button submitBut;
    public TextField emailField;
    public TextField passField;
    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
    Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);

    public void onSubmitClick(){
        if (!emailField.getText().isEmpty()) {
            String emailString = emailField.getText();
            EmailValidation ev = new EmailValidation();
            boolean emailValid = ev.validEmail(emailString);
            if (!emailValid){
                errorAlert.setHeaderText("Form Error!");
                errorAlert.setContentText("The email you entered is invalid!");
                errorAlert.showAndWait();
                return;
            }
        }
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
        confirmAlert.setHeaderText("Form Complete!");
        confirmAlert.setContentText("Your registration is complete!");
        confirmAlert.showAndWait();
    }
}
