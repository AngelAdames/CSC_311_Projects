package org.example.csc_311_w4_lab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SplashScreenController {

    @FXML
    public void setNewScreen(AnchorPane) throws IOException {
        AnchorPane newScene = new AnchorPane();
    }

    public SplashScreenController(Label welcomeText) {
        this.welcomeText = welcomeText;
    }

    @FXML
    void moveToNewScreen(MouseEvent event) throws IOException {

        Scene scene = ((ImageView) event.getSource()).getScene();

        FXMLLoader landingScnRoot = new FXMLLoader(HelloApplication.class.getResource("landing_screen.fxml"));

        scene.getRoot();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public String toString() {
        return "SplashScreenController{" +
                "welcomeText=" + welcomeText +
                '}';
    }
}