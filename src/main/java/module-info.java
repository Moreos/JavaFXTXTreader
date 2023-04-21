module com.moreos.javafxtestapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.moreos.javafxtestapp to javafx.fxml;
    exports com.moreos.javafxtestapp;
}