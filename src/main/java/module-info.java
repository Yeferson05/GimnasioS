module Nuevo {
    requires javafx.controls;
    requires javafx.fxml;

    opens Nuevo to javafx.fxml;
    exports Nuevo;
}