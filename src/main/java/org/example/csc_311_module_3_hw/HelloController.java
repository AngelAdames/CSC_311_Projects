package org.example.csc_311_module_3_hw;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

// default class (not used)
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}