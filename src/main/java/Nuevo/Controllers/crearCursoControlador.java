package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class crearCursoControlador {
    public static int codigo = 1;
    public TextField nombreCurso;
    public TextField intensidadCurso;
    public Label mensajeCurso;


    public void enviar(ActionEvent actionEvent) {
        cleanWarnings();
        if (nombreCurso.getText().trim().equals("") || intensidadCurso.getText().trim().equals("")  ) {
            mensajeCurso.setText("ERROR: Existen campos vacios.");
            return;
        }
        String nombre = nombreCurso.getText().trim();
        String intensidad = intensidadCurso.getText().trim();
        Curso nuevoCurso = new Curso(nombre,codigo,intensidad);
        Curso.cursos.put(codigo,nuevoCurso);

        codigo++;

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Curso creado correctamente");
        alert.setHeaderText(null);
        alert.setContentText("El curso creado fue: " + nuevoCurso);
        alert.showAndWait();
        clean();
    }

    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("curso");
    }

    @FXML
    public void clean(){
        nombreCurso.setText("");
        intensidadCurso.setText("");
    }
    public void cleanWarnings(){
        mensajeCurso.setText("");
    }
}
