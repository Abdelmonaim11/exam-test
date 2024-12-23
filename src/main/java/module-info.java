module com.enset.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.enset.test to javafx.fxml;
    exports com.enset.test;
}