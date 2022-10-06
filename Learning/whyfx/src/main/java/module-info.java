module com.example.whyfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.whyfx to javafx.fxml;
    exports com.example.whyfx;
}