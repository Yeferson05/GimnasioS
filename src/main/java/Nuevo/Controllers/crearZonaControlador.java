package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Zona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class crearZonaControlador {
    public static int idZona = 1;
    @FXML
    public TextField nombreZona;
    @FXML
    public Label warningMessage;
    @FXML
    public void enviar(ActionEvent event) throws IOException{
        cleanWarnings();
        if (nombreZona.getText().equals("")){
            warningMessage.setText("ERROR:Existen campos vacíos.");
            return;
        }
        String nombre = nombreZona.getText();
        Zona nuevaZona = new Nuevo.Zona(idZona,nombre);
        Zona.zonas.put(idZona,nuevaZona);
        idZona++;
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Creación de zonas");
        alert.setHeaderText(null);
        alert.setContentText("La zona creada es: " + nuevaZona);
        alert.showAndWait();
        clean();
    }
    @FXML
    public void volver (ActionEvent event)throws IOException {
        App.setRoot("menuZonas");
    }
    @FXML
    public void cleanWarnings(){
        warningMessage.setText("");
    }
    @FXML
    public void clean(){
        nombreZona.setText("");
    }
}
