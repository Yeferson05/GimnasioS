package Nuevo.Controllers;

import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class diagnosticoControlador implements Initializable {
    @FXML
    public ListView ListView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Sede sede1 : Sede.tabla.values()) {
            ListView.getItems().add(sede1);
        }
    }
    public void envia (ActionEvent event)throws IOException {
        //Sede.lis.addVertex(Sede.tabla.get(""));
        //Sede.lis.addEdge(Sede.tabla.get(""), Sede.tabla.get(""));
    }
}
