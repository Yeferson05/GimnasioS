package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class zonaControlador {
    @FXML
    private void verZonas (ActionEvent event) throws IOException {
        App.setRoot("VerZonas");
    }
    @FXML
    private void crearZonas(ActionEvent event) throws IOException{
        App.setRoot("crearZona");
    }
    @FXML
    private void editarZona(ActionEvent event) throws IOException{
        App.setRoot("editarZona");
    }
    @FXML
    private void eliminarZona(ActionEvent event) throws IOException{
        App.setRoot("eliminarZona");
    }
    @FXML
    private void volver (ActionEvent event) throws IOException {
        App.setRoot("administracion");
    }
}
