package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class verCursoControlador implements Initializable {
    public ListView ListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Curso curso1 : Curso.cursos.values()) {
            ListView.getItems().add(curso1);
        }
    }
    @FXML
    public void volverr(ActionEvent actionEvent) throws IOException {
        App.setRoot("curso");
    }
}