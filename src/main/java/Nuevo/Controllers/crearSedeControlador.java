package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Hashtable;

public class crearSedeControlador {
    //public static Hashtable<Integer,Sede> tabla = new Hashtable<>();
    @FXML
    public TextField nombreSede;
    @FXML
    public TextField ciudadSede;
    @FXML
    public TextField direccionSede;
    @FXML
    public Label mensajeSede;
    public void enviar (ActionEvent event)throws IOException {
        cleanWarnings();
        if (nombreSede.getText().trim().equals("") || ciudadSede.getText().trim().equals("") || direccionSede.getText().trim().equals("") ) {
            mensajeSede.setText("ERROR: Existen campos vacios.");
            return;
        }
        String nombre = nombreSede.getText().trim();
        String ciudad = ciudadSede.getText().trim();
        String direccion = direccionSede.getText().trim();
        Sede nuevaSede = new Sede(nombre,ciudad,direccion);
        Sede.tabla.put(nombre,nuevaSede);

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sede creada correctamente");
        alert.setHeaderText(null);
        alert.setContentText("La sede creada fue: " + nuevaSede);
        alert.showAndWait();
        clean();
    }
    public void volver (ActionEvent event)throws IOException {
        App.setRoot("sede");
    }
    @FXML
    public void clean(){
        nombreSede.setText("");
        ciudadSede.setText("");
        direccionSede.setText("");
    }
    public void cleanWarnings(){
        mensajeSede.setText("");
    }
}
