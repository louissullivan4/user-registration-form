package com.registrationform.registrationform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * The type Hello controller.
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    /**
     * On hello button click.
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}