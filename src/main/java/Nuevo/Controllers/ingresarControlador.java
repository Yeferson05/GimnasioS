package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Usuario;
import Nuevo.saludoIngreso;
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
                        saludoIngreso.saludo.clear();
                        saludoIngreso ingreso1 = new saludoIngreso(Usuario.usuarios.get(i).nombre, Usuario.usuarios.get(i).apellido);
                        saludoIngreso.saludo.add(ingreso1);
                        String Contraseña = contraseña.getText().trim();
                        if (Usuario.usuarios.get(i).password.equals(Contraseña)) {
                            App.setRoot("menuPrincipal");
                        } else {
                            mensajeContraseña.setText("Contraseña incorrecta.");
                            return;
                        }
                    }
                }
                mensajeUsuario.setText("Este documento no se encuentra en la base de datos.");


        }else if (res == false && user.contains("@") == true) {
            for (int i = 0; i < Usuario.usuarios.size(); i++) {
                saludoIngreso.saludo.clear();
                saludoIngreso ingreso1 = new saludoIngreso(Usuario.usuarios.get(i).nombre, Usuario.usuarios.get(i).apellido);
                saludoIngreso.saludo.add(ingreso1);
                if (Usuario.usuarios.get(i).correo.equals(user)) {
                    String Contraseña = contraseña.getText().trim();
                    if (Usuario.usuarios.get(i).password.equals(Contraseña)) {
                        App.setRoot("menuPrincipal");
                    } else {
                        mensajeContraseña.setText("Contraseña incorrecta.");
                        return;
                    }
                }
            }
            mensajeUsuario.setText("Este correo no se encuentra en la base de datos.");

        } else {
            mensajeGeneral.setText("Ingresaste valores invalidos");
        }
        clean();


    }
    @FXML
    public void clean(){
        usuario.setText("");
        contraseña.setText("");
    }
    public void cleanWarnings(){
        mensajeGeneral.setText("");
        mensajeContraseña.setText("");
        mensajeUsuario.setText("");

    }
}
