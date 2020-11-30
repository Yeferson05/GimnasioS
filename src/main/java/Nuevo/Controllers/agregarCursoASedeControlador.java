package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class agregarCursoASedeControlador {

    @FXML
    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("sede");
    }
}
