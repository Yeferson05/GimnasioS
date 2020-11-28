package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class editarCursoControlador {
    public TextField codigoCurso;
    public Label mensaje;
    public javafx.scene.control.ListView ListView;
    public TextField nuevoNombre;
    public TextField nuevaIntensidad;
    public Label nuevoMensaje;
    public TextField nuevoCodigo;
    public Label MensajeCodigo;

    public void enviar(ActionEvent actionEvent) {
        cleanWarnings();
        if (codigoCurso.getText().trim().equals("")) {
            mensaje.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = codigoCurso.getText().trim();
        int codi=Integer.parseInt(direc);
        int e =0;
        for (Curso curso1 : Curso.cursos.values()) {
            if (curso1.codigo==(codi)){
                ListView.getItems().add(curso1);
                return;
            }else{
                e++;
            }
        }
        if (e==0){
            mensaje.setText("No se encontro ningun curso");
        }
    }


    public void confirmar(ActionEvent actionEvent) throws IOException {
        cleanWarnings();
        if (nuevoNombre.getText().trim().equals("") || nuevaIntensidad.getText().trim().equals("")) {
            nuevoMensaje.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = codigoCurso.getText().trim();
        int codi=Integer.parseInt(direc);
        String nuevoN = nuevoNombre.getText().trim();
        String nuevoI = nuevaIntensidad.getText().trim();
        String nuevoC = nuevoCodigo.getText().trim();
        int nuevoCodigo=Integer.parseInt(nuevoC);

        for (Curso curso1 : Curso.cursos.values()) {
            if (curso1.codigo==(codi)) {
                curso1.nombre = nuevoN;
                curso1.intesidadHora = nuevoI;
                curso1.codigo=nuevoCodigo;
            }
        }
        App.setRoot("curso");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Curso editado correctamente");
        alert.setHeaderText(null);
        alert.setContentText("La sede editada fue: " + "Nombre: " + nuevoN + " , "+
                "Codigo: "+ nuevoC + " , "+
                "Intensidad: " + nuevoI);
        alert.showAndWait();
        clean();
    }

    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("curso");
    }


    @FXML
    public void clean(){
        nuevoMensaje.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensaje.setText("");
    }


}
