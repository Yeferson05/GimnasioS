package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
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
        for (Sede sede1 : Sede.tabla.values()) {
            ListView.getItems().add(sede1);
        }
    }

    @FXML
    private void volver (ActionEvent event) throws IOException {
        App.setRoot("sede");
    }
}