module com.example.kawiarnia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kawiarnia to javafx.fxml;
    exports com.example.kawiarnia;
}