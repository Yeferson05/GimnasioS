package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class sedeControlador {
    @FXML
    private void verSedes (ActionEvent event) throws IOException {
        App.setRoot("VerSede");
    }
    @FXML
    private void crearSede (ActionEvent event) throws IOException {
        App.setRoot("crearSede");
    }
}
