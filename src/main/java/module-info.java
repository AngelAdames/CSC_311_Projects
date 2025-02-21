module org.example.csc_311_w4_lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc_311_w4_lab to javafx.fxml;
    exports org.example.csc_311_w4_lab;
}