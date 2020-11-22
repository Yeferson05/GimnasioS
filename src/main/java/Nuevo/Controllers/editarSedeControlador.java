package Nuevo.Controllers;

import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//implements Initializable
public class editarSedeControlador implements Initializable{
    public ListView ListView;
    @FXML
    public TextField direccionSede;
    @FXML
    public Label mensaje;
    public void enviar (ActionEvent event)throws IOException {
       // cleanWarnings();
        if (direccionSede.getText().trim().equals("")) {
            mensaje.setText("ERROR: Existen campos vacios.");
            return;
        }
        /*String direc = direccionSede.getText().trim();
        for (Sede sede1 : Sede.sedes) {
            if (sede1.direccion.equals(direc)){
                ListView.getItems().add(sede1);
            }
        }*/
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String direc = direccionSede.getText().trim();
        for (Sede sede1 : Sede.sedes) {
            if (sede1.direccion.equals(direc)){
                ListView.getItems().add(sede1);
            }
        }
    }
}
