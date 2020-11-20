package Nuevo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class menuPrincipalControlador {
    @FXML
    public void ingresar (ActionEvent event) throws IOException {
        App.setRoot("AgregarUsuario");
    }
    @FXML
    public void registrarse (ActionEvent event) throws IOException {
        App.setRoot("AgregarUsuario");
    }
}
