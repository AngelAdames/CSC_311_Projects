package org.example.csc_311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize(Label label) {
    }

    @FXML
    private VBox rootVBox;

    @FXML
    protected void onRotateButtonClick() {
        // Loop through all children of the VBox
        for (Node child : rootVBox.getChildren()) {
            // Check if the child is a button
            if (child instanceof Button button) {
                // Apply rotation to the button
                button.setRotate(button.getRotate() + 45); // Increase the rotation by 45 degrees
            }
        }
    }

    public void initialize() {

        Text text1 = new Text(36, 36, "THIS IS SPECIAL TEXT!");
        text1.setFont(new Font("Times", 30));
        text1.setUnderline(true);
        text1.setFill(Color.CORAL);

        rootVBox.getChildren().add(text1);
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}