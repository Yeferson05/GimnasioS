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

public class editarZonaControlador {
    @FXML
    public Label warningMessage1;
    @FXML
    public Label warningMessage2;
    @FXML
    public ListView ListView;
    @FXML
    public TextField idField;
    @FXML
    public TextField zonaNueva;

    public void enviar(ActionEvent event) throws IOException{
        cleanWarnings();
        int ID;
        if (idField.getText().trim().equals("")) {
            warningMessage1.setText("ERROR: Existen campos vacios.");
            return;
        }
        try {
            ID = Integer.parseInt(idField.getText().trim());
        }catch (Exception e){
            warningMessage1.setText("ERROR: El ID debe ser un numero.");
            return;
        }
        if (Zona.zon.isEmpty()){
            warningMessage1.setText("ERROR: La lista de zonas se encuentra vacía.");
            return;
        }
        boolean check = false;
        for (Zona zona : Zona.zon.values()){
            if (zona.id == ID){
                check=true;
                ListView.getItems().add(zona);
            }
        }
        if (!check){
            warningMessage1.setText("ERROR: No existen zonas con esta ID.");
        }
    }
    public void confirmar (ActionEvent event)throws IOException {
        int ID;
        if (zonaNueva.getText().trim().equals("") ) {
            warningMessage2.setText("ERROR: Existen campos vacios.");
            return;
        }
        if (idField.getText().trim().equals("")){
            warningMessage1.setText("ERROR: Existen campos vacios.");
            return;
        }
        try {
            ID = Integer.parseInt(idField.getText().trim());
        }catch (Exception e){
            return;
        }
        String nZona = zonaNueva.getText().trim();

        for (Zona zona : Zona.zon.values()) {
            if (zona.id == ID) {
                zona.zona = nZona;
            }
        }
        App.setRoot("menuZonas");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Zona editada correctamente");
        alert.setHeaderText(null);
        alert.setContentText("La zona creada fue: " + "ID: " + ID + "\\"+
                "Zona: "+ nZona);
        alert.showAndWait();
        clean();
    }
    @FXML
    private void cancelar (ActionEvent event) throws IOException {
        App.setRoot("menuZonas");
    }
    @FXML
    public void volver (ActionEvent event)throws IOException {
        App.setRoot("menuZonas");
    }
    public void clean(){
        zonaNueva.setText("");
        cleanWarnings();
    }
    public void cleanWarnings(){
        warningMessage1.setText("");
    }

}
