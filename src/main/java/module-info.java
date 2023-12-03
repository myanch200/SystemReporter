module com.myanch200.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    opens com.myanch200.demo to javafx.fxml;
    exports com.myanch200.demo;
}