module Nuevo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jgrapht.core;

    opens Nuevo to javafx.fxml;
    opens Nuevo.Controllers to javafx.fxml;
    exports Nuevo;
}