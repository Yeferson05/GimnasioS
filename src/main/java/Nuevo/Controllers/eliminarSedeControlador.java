package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Enumeration;

public class eliminarSedeControlador {
    @FXML
    public ListView ListView;
    @FXML
    public TextField eliminar;
    @FXML
    public Label mensajeEliminar;
    public void enviarE (ActionEvent event)throws IOException {
        if (eliminar.getText().trim().equals("")) {
            mensajeEliminar.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = eliminar.getText().trim();
        int cont = 0 , e =0;
        if (Sede.tabla.size()==0){
            mensajeEliminar.setText("No hay datos que mostrar");
            return;
        }
        for (Sede sede1 : Sede.tabla.values()) {
            if (sede1.direccion.equals(direc)){
                ListView.getItems().add(sede1);
                cont++;
                return;
            }else{
                e++;
            }
        }
        if ((cont==0) && (e !=0)){
            mensajeEliminar.setText("No se encontro ninguna sede");
        }
    }
    public void confirmarE (ActionEvent event)throws IOException {
        String direc = eliminar.getText().trim();
        int cont = 0 , e =0;
        if (eliminar.getText().trim().equals("")) {
            mensajeEliminar.setText("ERROR: Existen campos vacios.");
            return;
        }
        for (Sede sede1 : Sede.tabla.values()) {
            if (sede1.direccion.equals(direc)) {
                String nom = sede1.nombre;
                Sede.tabla.remove(nom,sede1);
                return;

            }

        }
        App.setRoot("sede");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sede eliminada correctamente");
        alert.setHeaderText(null);
        alert.setContentText("Sede eliminada");
        alert.showAndWait();
    }
    @FXML
    private void cancelar (ActionEvent event) throws IOException {
        App.setRoot("sede");
    }
    @FXML
    public void clean(){
        mensajeEliminar.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensajeEliminar.setText("");
    }
}
