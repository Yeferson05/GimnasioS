package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class menuPrincipalControlador {
    @FXML
    private void administracion (ActionEvent event) throws IOException {
        App.setRoot("administracion");
    }
    @FXML
    private void busqueda (ActionEvent event) throws IOException {
        App.setRoot("busqueda");
    }
    @FXML
    public void salir(ActionEvent actionEvent) throws IOException {
        App.setRoot("ingresar");
    }
}
