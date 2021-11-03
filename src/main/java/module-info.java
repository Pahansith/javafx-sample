module com.psinvention.jfx.javafxdemo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.psinvention.jfx.javafxdemo1 to javafx.fxml;
    exports com.psinvention.jfx.javafxdemo1;
}