package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class editarSedeControlador{
    @FXML
    public ListView ListView;
    @FXML
    public TextField direccionSede;
    @FXML
    public TextField nuevoNombre;
    @FXML
    public TextField nuevaCiudad;
    @FXML
    public TextField nuevaDireccion;
    @FXML
    public Label mensaje;
    @FXML
    public Label nuevoMensaje;


    public void enviar (ActionEvent event)throws IOException {
        cleanWarnings();
        if (direccionSede.getText().trim().equals("")) {
            mensaje.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = direccionSede.getText().trim();
        for (Sede sede1 : Sede.sedes) {
            if (sede1.direccion.equals(direc)){
                ListView.getItems().add(sede1);
            }else{
                mensaje.setText("No se encontro ninguna sede");
            }
        }
        //clean();
    }
    public void confirmar (ActionEvent event)throws IOException {
        cleanWarnings();
        if (nuevoNombre.getText().trim().equals("") || nuevaCiudad.getText().trim().equals("") || nuevaDireccion.getText().trim().equals("")) {
            nuevoMensaje.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = direccionSede.getText().trim();
        String nuevoN = nuevoNombre.getText().trim();
        String nuevoC = nuevaCiudad.getText().trim();
        String nuevoD = nuevaDireccion.getText().trim();

        for (Sede sede1 : Sede.sedes) {
            if (sede1.direccion.equals(direc)) {
                sede1.nombre = nuevoN;
                sede1.direccion = nuevoD;
                sede1.ciudad = nuevoC;
            }
        }
        App.setRoot("sede");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sede editada correctamente");
        alert.setHeaderText(null);
        alert.setContentText("La sede editada fue: " + "Nombre: " + nuevoN + "\\"+
                "Ciudad: "+ nuevoC + "\\"+
                "Direccion: " + nuevoD);
        alert.showAndWait();
        clean();
    }
    @FXML
    private void cancelar (ActionEvent event) throws IOException {
        App.setRoot("sede");
    }
    @FXML
    private void volver (ActionEvent event) throws IOException {
        App.setRoot("sede");
    }

    @FXML
    public void clean(){
        direccionSede.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensaje.setText("");
    }
}
