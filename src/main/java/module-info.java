module org.example.csc_311_module_3_hw {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc_311_module_3_hw to javafx.fxml;
    exports org.example.csc_311_module_3_hw;
}