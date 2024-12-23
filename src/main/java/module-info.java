module com.enset.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.enset.test.entities to javafx.base;

    exports com.enset.test;
    opens com.enset.test to javafx.base, javafx.fxml;
    exports com.enset.test.Controller;
    opens com.enset.test.Controller to javafx.base, javafx.fxml;
}