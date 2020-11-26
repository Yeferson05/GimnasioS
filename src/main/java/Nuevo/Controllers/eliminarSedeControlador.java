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
        cleanWarnings();
        if (eliminar.getText().trim().equals("")) {
            mensajeEliminar.setText("ERROR: Existen campos vacios.");
            return;
        }
        String direc = eliminar.getText().trim();
        int cont = 0;
        for (Sede sede1 : Sede.tabla.values()) {
            if (sede1.direccion.equals(direc)){
                ListView.getItems().add(sede1);
                return;
            }else{
                cont++;
            }
        }
        if (cont==0){
            mensajeEliminar.setText("No se encontro ninguna sede");
        }
    }
    public void confirmarE (ActionEvent event)throws IOException {
        String direc = eliminar.getText().trim();
        /*Enumeration<Integer> t = Sede.tabla.keys();
        if (Sede.tabla.containsKey(direc)){
        }*/
        for (Sede sede1 : Sede.tabla.values()) {
            if (sede1.direccion.equals(direc)) {
                //Enumeration<Integer> e = sede1.tabla.keys();
               // Sede.tabla.remove(Sede.tabla.keySet(), sede1);
                //Sede.tabla.remove();
                return;
            }
        }
        App.setRoot("sede");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sede eliminada correctamente");
        alert.setHeaderText(null);
        alert.setContentText("Sede eliminada");
        alert.showAndWait();
        clean();
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
