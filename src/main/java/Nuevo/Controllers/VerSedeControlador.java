package Nuevo.Controllers;

import Nuevo.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VerSedeControlador implements Initializable {
    public ListView ListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Usuario voto : Usuario.usuarios) {
            ListView.getItems().add(voto);
        }
    }
}