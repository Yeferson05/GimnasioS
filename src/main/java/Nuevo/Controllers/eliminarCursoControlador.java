package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class eliminarCursoControlador {
    public Label mensajeEliminar;
    public TextField eliminar;
    public javafx.scene.control.ListView ListView;

    public void enviarE(ActionEvent actionEvent) {
        cleanWarnings();
        if (eliminar.getText().trim().equals("")) {
            mensajeEliminar.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = eliminar.getText().trim();
        int codigo=Integer.parseInt(direc);
        int cont = 0;
        for (Curso curso1 : Curso.cursos.values()) {
            if (curso1.codigo==codigo){
                ListView.getItems().add(curso1);
                return;
            }else{
                cont++;
                mensajeEliminar.setText("No se encontro ningun curso");
            }
        }
        if (cont==0){
            mensajeEliminar.setText("No se encontro ningun curso");
        }
    }

    public void confirmarE(ActionEvent actionEvent) throws IOException {
        String direc = eliminar.getText().trim();
        int codigo=Integer.parseInt(direc);
        for (Curso curso1 : Curso.cursos.values()) {
            if (curso1.codigo==(codigo)) {
                int c = curso1.codigo;
                Curso.cursos.remove(c,curso1);
                return;
            }
        }
        App.setRoot("curso");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Curso eliminado correctamente");
        alert.setHeaderText(null);
        alert.setContentText("Curso eliminado");
        alert.showAndWait();
        clean();
    }

    public void cancelar(ActionEvent actionEvent) throws IOException {
        App.setRoot("curso");
    }
    @FXML
    public void clean(){
        mensajeEliminar.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensajeEliminar.setText("");
    }
}
