package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;


import Nuevo.Curso;
import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;


import static Nuevo.Curso.cursos;
import static Nuevo.Sede.tabla;

public class agregarCursoASedeControlador {
    public TextField codCurso;
    public TextField nitSede;
    public ListView listView;

    public void validar(ActionEvent actionEvent) {
        clean();
        String nombreSede = nitSede.getText().trim();
        String codigocurso = codCurso.getText().trim();
        int codiCurso = Integer.parseInt(codigocurso);
        String pase = nombreSede.toLowerCase();
        Curso cursede = null;
        for (Curso curso1 : cursos.values()) {
            if (curso1.codigo == (codiCurso)) {
                cursede = cursos.get(codiCurso);
            }
        }

        for (Sede sede1 : Sede.tabla.values()) {
            if (sede1.nombre.toLowerCase().equals(pase)) {
                sede1.curso = cursede;
            }
        }

    }

    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("sede");
    }


    /*@FXML
    public void cleanWarnings(){
        warningMessage.setText("");
    }*/
    @FXML
    public void clean() {
        codCurso.setText("");
        nitSede.setText("");
    }
}

