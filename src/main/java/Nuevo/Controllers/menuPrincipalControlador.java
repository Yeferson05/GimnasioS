package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.saludoIngreso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menuPrincipalControlador implements Initializable{
    @FXML
    public Label saludoin;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        saludoin.setText("Bienvenido "+saludoIngreso.saludo);
    }

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
