package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class menuPrincipalControlador {
    @FXML
    private void adminis (ActionEvent event) throws IOException {
        App.setRoot("administracion");
    }
    @FXML
    private void registrarse (ActionEvent event) throws IOException {
        App.setRoot("AgregarUsuario");
    }
}
