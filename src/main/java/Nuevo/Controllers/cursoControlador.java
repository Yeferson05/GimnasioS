package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;

import java.io.IOException;

public class cursoControlador {
    public void verCursos(ActionEvent actionEvent) throws IOException {
        App.setRoot("verCurso");
    }

    public void crearCursos(ActionEvent actionEvent) throws IOException {
        App.setRoot("crearCurso");
    }

    public void editarCursos(ActionEvent actionEvent) throws IOException {
        App.setRoot("editarCurso");
    }

    public void eliminarCursos(ActionEvent actionEvent) throws IOException {
        App.setRoot("eliminarCurso");
    }

    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("administracion");
    }

    public void agregarZona(ActionEvent actionEvent) throws IOException {
        App.setRoot("agregarZonaACurso");
    }
}
