package org.example.csc_311_gui_basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageDisplay extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        String resourcePath = "/fsc.png";
        Image img = new Image(getClass().getResource(resourcePath).toString());
        System.out.println("Image width: " + img.getWidth());
        System.out.println("Image height: " + img.getHeight());

        ImageView imgView = new ImageView();
        imgView.setImage(img);
        imgView.setFitWidth(400);
        imgView.setFitHeight(400);
        imgView.setPreserveRatio(true); // Maintain aspect ratio
        imgView.setSmooth(true);

        StackPane pane = new StackPane();
        pane.getChildren().add(imgView);
        pane.setStyle("-fx-background-color: blue");
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}