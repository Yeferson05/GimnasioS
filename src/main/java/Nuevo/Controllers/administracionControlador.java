package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class administracionControlador {
    @FXML
    private void sedeA (ActionEvent event) throws IOException {
        App.setRoot("sede");
    }
    @FXML
    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("menuPrincipal");
    }
    @FXML
    private void zonas (ActionEvent event) throws IOException{
        App.setRoot(("menuZonas"));
    }

    public void cursos(ActionEvent actionEvent) throws IOException {
        App.setRoot(("curso"));
    }
}

