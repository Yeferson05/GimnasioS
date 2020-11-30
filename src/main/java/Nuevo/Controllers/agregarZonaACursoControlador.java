package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Curso;
import Nuevo.Sede;
import Nuevo.Zona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

import static Nuevo.Curso.cursos;
import static Nuevo.Zona.zonas;

public class agregarZonaACursoControlador {
    public TextField codiCurso;
    public TextField idZone;


    public void validar(ActionEvent actionEvent) {
        clean();

        String idZona= idZone.getText().trim();
        String codigocurso= codiCurso.getText().trim();
        int codiCurso=Integer.parseInt(codigocurso);
        int ideZona=Integer.parseInt(idZona);
        Curso nuevoCurso=cursos.get(codiCurso);
        Zona nuevaZona = null;
        for (Zona zona1 : zonas.values()) {
            if (zona1.id==(ideZona)) {
                nuevaZona=zonas.get(codiCurso);
                nuevoCurso.asociarZona(nuevaZona);
            }
        }




        for (Curso curso1 : cursos.values()) {
           if (curso1.codigo==codiCurso) {
                curso1.asociarZona(nuevaZona);
            }
        }
    }


    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("curso");
    }

    @FXML
    public void clean(){
        codiCurso.setText("");
        idZone.setText("");
    }
}
