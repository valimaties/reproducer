module com.test.reproducer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.reproducer to javafx.fxml;
    exports com.test.reproducer;
}