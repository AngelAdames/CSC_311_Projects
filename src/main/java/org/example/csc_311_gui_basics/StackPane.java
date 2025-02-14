package org.example.csc_311_gui_basics;

import javafx.scene.Node;

public class StackPane extends javafx.scene.layout.StackPane {
    public StackPane() {
    }

    public StackPane(javafx.scene.image.ImageView imgView) {
    }

    public void setStyle() {
        setStyle(null);
    }

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
