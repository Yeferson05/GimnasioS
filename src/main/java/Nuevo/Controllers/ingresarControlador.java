package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Usuario;
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
    public Label mensajeGeneral;
    @FXML
    public void iniciarSesion(ActionEvent event)throws IOException {
        cleanWarnings();
        if (usuario.getText().trim().equals("") || contraseña.getText().trim().equals("")){
            mensajeGeneral.setText("ERROR: Existen campos vacios.");
            return;
        }
        String user = usuario.getText().trim();
        boolean res;
        try {
            Integer.parseInt(user);
            res = true;
        } catch (NumberFormatException excepcion) {
            res = false;
        }
        if (res == true) {
                int docingreso = Integer.parseInt(user);
                for (int i = 0; i < Usuario.usuarios.size(); i++) {
                    if (Usuario.usuarios.get(i).cedula == docingreso) {
                        /*saludo.clear();
                        saludoIngreso ingreso1 = new saludoIngreso(usuarios.get(i).nombre, usuarios.get(i).apellido);
                        saludo.add(ingreso1);*/
                        String Contraseña = contraseña.getText().trim();
                        if (Usuario.usuarios.get(i).password.equals(Contraseña)) {
                            //Mandar al menú principal
                            App.setRoot("menuPrincipal");
                            return;
                        } else {
                            mensajeGeneral.setText("Contraseña incorrecta.");
                            return;
                        }
                    }
                }
                mensajeUsuario.setText("Este documento no se encuentra en la base de datos.");

        }else if (res == false && user.contains("@") == true) {
            for (int i = 0; i < Usuario.usuarios.size(); i++) {
                /*saludo.clear();
                saludoIngreso ingreso1 = new saludoIngreso(usuarios.get(i).nombre, usuarios.get(i).apellido);
                saludo.add(ingreso1);*/
                if (Usuario.usuarios.get(i).correo.equals(user)) {
                    String Contraseña = contraseña.getText().trim();
                    if (Usuario.usuarios.get(i).password.equals(Contraseña)) {
                        //Mandar al menú principal
                        App.setRoot("menuPrincipal");
                    } else {
                        mensajeGeneral.setText("Contraseña incorrecta.");
                        return;
                    }
                }
            }
            mensajeUsuario.setText("Este documento no se encuentra en la base de datos.");

        } else {
            mensajeGeneral.setText("Ingresaste valores invalidos");
        }
        clean();



    }
    @FXML
    public void clean(){
        usuario.setText("");
        contraseña.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensajeUsuario.setText("");
        mensajeContraseña.setText("");
        mensajeGeneral.setText("");

    }
}