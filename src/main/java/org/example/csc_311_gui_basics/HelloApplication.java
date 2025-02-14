package org.example.csc_311_gui_basics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    Font font1 = new Font("Times", 30);
    Text text1 = new Text(30, 30, "SPECIAL TEXT!");

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 650);
        scene.getStylesheets().add(HelloApplication.class.getResource("mystyle.css").toExternalForm());
        stage.setTitle("CSC 311 GUI Basics");
        text1.setFont(font1);
        text1.setUnderline(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}