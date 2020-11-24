package Nuevo.Controllers;


import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class busquedaControlador implements Initializable {
    @FXML
    public ChoiceBox entidad;
    @FXML
    public ChoiceBox atributo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> op = new ArrayList<>();
        op.add("Sede");
        op.add("Zona");
        op.add("Curso");
        entidad.setItems(FXCollections.observableList(op));
        ArrayList<String> atr = new ArrayList<>();
        atr.add("Nombre");
        atr.add("Direccion");
        atr.add("Ciudad");
        atributo.setItems(FXCollections.observableList(atr));
    }
}
