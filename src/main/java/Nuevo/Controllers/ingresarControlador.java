package Nuevo.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ingresarControlador {
    @FXML
    public TextField usuario;
    @FXML
    public TextField contraseña;
    @FXML
    public Label mensajeUsuario;
    @FXML
    public Label mensajeContraseña;
    @FXML
    public void iniciar(ActionEvent event)throws IOException {
        String  usu = "";
        if (usuario.getText().trim().equals("")){
            mensajeUsuario.setText("El campo no puede quedar vacio");
            return;
        }
        if (contraseña.getText().trim().equals("")){
            mensajeContraseña.setText("El campo no puede quedar vacio");
            return;
        }

    }
}
