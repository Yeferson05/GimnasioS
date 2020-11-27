package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
import Nuevo.Zona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VerZonaControlador implements Initializable {
    public ListView ListView;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (Zona.zon.size() == 0) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Lista de zonas");
            alerta.setHeaderText(null);
            alerta.setContentText("La lista de zonas se encuentra vacía.");
            alerta.showAndWait();
        }else{
            for (Zona zona : Zona.zon.values()) {
                ListView.getItems().add(zona);
            }
        }
    }
    @FXML
    private void volver (ActionEvent event) throws IOException {
        App.setRoot("menuZonas");
    }
}
