package Nuevo.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class crearZonaControlador {
    @FXML
    public TextField nombreZona;
    @FXML
    public Label warningMessage;
    @FXML
    public void enviar(ActionEvent event) throws IOException{
        if (nombreZona.getText().equals("")){
            warningMessage.setText("ERROR:Existen campos vacíos.");
            return;
        }
    }
}
