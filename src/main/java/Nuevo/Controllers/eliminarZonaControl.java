package Nuevo.Controllers;

import Nuevo.App;
import Nuevo.Sede;
import Nuevo.Zona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class eliminarZonaControl {
    @FXML
    public ListView ListView;
    @FXML
    public TextField textID;
    @FXML
    public Label warningMessage;
    public void enviar (ActionEvent event)throws IOException {
        cleanWarnings();
        int ID;
        if (textID.getText().trim().equals("")) {
            warningMessage.setText("ERROR: Existen campos vacios.");
            return;
        }
        try {
            ID = Integer.parseInt(textID.getText().trim());
        }catch (Exception e){
            warningMessage.setText("ERROR: Ingrese valores validos.");
            return;
        }
        boolean check = false;
        for (Zona zona : Zona.zon.values()){
            if (zona.id == ID){
                check=true;
                ListView.getItems().add(zona);
            }
        }
        if (check == false){
            warningMessage.setText("ERROR: No existen zonas con esta ID.");
        }
    }
    public void confirmar (ActionEvent event)throws IOException {
        int ID;
        if (textID.getText().trim().equals("")){
            warningMessage.setText("ERROR: Existen campos vacios.");
            return;
        }
        try {
            ID = Integer.parseInt(textID.getText().trim());
        }catch (Exception e){
            return;
        }
        for (Zona zona : Zona.zon.values()) {
            if (zona.id == ID) {
                int n = zona.id;
                Zona.zon.remove(n,zona);
                return;
            }
        }
        App.setRoot("menuZonas");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Eliminar Zonas");
        alert.setHeaderText(null);
        alert.setContentText("Zona eliminada correctamente.");
        alert.showAndWait();
        clean();
    }
    @FXML
    private void cancelar (ActionEvent event) throws IOException {
        App.setRoot("menuZonas");
    }
    @FXML
    public void clean(){
        textID.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        warningMessage.setText("");
    }
}
