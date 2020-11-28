package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menuPrincipalControlador {



    @FXML
    public ImageView ImageView;

    @FXML
    private void administracion (ActionEvent event) throws IOException {
        App.setRoot("administracion");
    }
    @FXML
    private void busqueda (ActionEvent event) throws IOException {
        App.setRoot("busqueda");
    }
    @FXML
    private void diagnostico (ActionEvent event) throws IOException {
        App.setRoot("diagnostico");
    }
    @FXML
    public void salir(ActionEvent actionEvent) throws IOException {
        App.setRoot("ingresar");
    }
}
