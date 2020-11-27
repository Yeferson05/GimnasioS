package Nuevo.Controllers;


import Nuevo.App;
import Nuevo.Curso;
import Nuevo.Sede;
import Nuevo.Zona;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class busquedaControlador implements Initializable {
    @FXML
    public ListView ListView;
    @FXML
    public ChoiceBox entidad;
    @FXML
    public ChoiceBox atributo;
    @FXML
    public TextField ingresar;
    @FXML
    public Label mensajeG;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> op = new ArrayList<>();
        op.add("Sede");
        op.add("Zona");
        op.add("Curso");
        entidad.setItems(FXCollections.observableList(new ArrayList<>(op)));
    }
    @FXML
    public void validar (ActionEvent event)throws IOException {
        String enti="";
        if (String.valueOf(entidad.getValue()).equals("null") ) {
            mensajeG.setText("ERROR: Seleccione una entidad");
            return;
        }
        enti = String.valueOf(entidad.getValue());
        if (enti.equals("Sede")){
            ArrayList<String> atr = new ArrayList<>();
            atr.add("Nombre");
            atr.add("Direccion");
            atr.add("Ciudad");
            atributo.setItems(FXCollections.observableList(atr));
        }else if (enti.equals("Zona")){
            ArrayList<String> zo = new ArrayList<>();
            zo.add("Id");
            zo.add("Zona");
            atributo.setItems(FXCollections.observableList(zo));

        }else if (enti.equals("Curso")){
            ArrayList<String> cur = new ArrayList<>();
            cur.add("Nombre curso");
            cur.add("Codigo");
            cur.add("Intensidad");
            atributo.setItems(FXCollections.observableList(cur));

        }
    }
    @FXML
    public void buscar(ActionEvent actionEvent) throws IOException {
        clean();
        String atri="";
        if (String.valueOf(atributo.getValue()).equals("null") || ingresar.getText().trim().equals("")) {
            mensajeG.setText("ERROR: Existen campos vacios.");
            return;
        }
        atri = String.valueOf(atributo.getValue());
        String ing = ingresar.getText().trim();
        String pase = ing.toLowerCase();
        if (atri.equals("Nombre")){
            int cont =0;
            for (Sede sede1 : Sede.tabla.values()) {
                if (sede1.nombre.toLowerCase().equals(pase)) {
                    ListView.getItems().add(sede1);
                    cont++;
                }
            }if (cont==0){
                mensajeG.setText("No se encuentra la sede");
            }
        }else if (atri.equals("Direccion")){
            int cont =0;
            for (Sede sede1 : Sede.tabla.values()) {
                if (sede1.direccion.toLowerCase().equals(pase)) {
                    ListView.getItems().add(sede1);
                    cont++;
                }
            }if (cont==0){
                mensajeG.setText("No se encuentra la sede");
            }
        }else if (atri.equals("Ciudad")){
            int cont =0;
            for (Sede sede1 : Sede.tabla.values()) {
                if (sede1.ciudad.toLowerCase().equals(pase)) {
                    ListView.getItems().add(sede1);
                    cont++;
                }
            }if (cont==0){
                mensajeG.setText("No se encuentra la sede");
            }
        }else if (atri.equals("Id")){
            int nu = Integer.parseInt(ing);
            int cont =0;
            for (Zona zona1 : Zona.zon.values()) {
                if (zona1.id == nu) {
                    ListView.getItems().add(zona1);
                    cont++;
                }
            }if (cont==0){
                mensajeG.setText("No se encuentra la zona");
            }
        }else if (atri.equals("Zona")){
            int cont =0;
            for (Zona zona1 : Zona.zon.values()) {
                if (zona1.zona.toLowerCase().equals(pase)) {
                    ListView.getItems().add(zona1);
                    cont++;
                }
            }if (cont==0){
                mensajeG.setText("No se encuentra la zona");
            }
        }else if (atri.equals("Nombre curso")) {
            int cont = 0;
            for (Curso curso1 : Curso.cursos.values()) {
                if (curso1.nombre.toLowerCase().equals(pase)) {
                    ListView.getItems().add(curso1);
                    cont++;
                }
            }
            if (cont == 0) {
                mensajeG.setText("No se encuentró ningun curso con este nombre");
            }
        }else if (atri.equals("Intensidad")) {
            int cont = 0;
            for (Curso curso1 : Curso.cursos.values()) {
                if (curso1.intesidadHora.toLowerCase().equals(pase)) {
                    ListView.getItems().add(curso1);
                    cont++;
                }
            }
            if (cont == 0) {
                mensajeG.setText("No se encuentró ningun curso con esta intensidad");
            }
        }else if (atri.equals("Codigo")) {
            int cont = 0;
            int intpase=Integer.parseInt(pase);
            for (Curso curso1 : Curso.cursos.values()) {
                if (curso1.codigo==(intpase)) {
                    ListView.getItems().add(curso1);
                    cont++;
                }
            }
            if (cont == 0) {
                mensajeG.setText("No se encuentró ningun curso con este codigo");
            }
        }
    }
    @FXML
    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("menuPrincipal");
    }
    @FXML
    public void clean(){
        cleanWarnings();
    }
    public void cleanWarnings(){
        mensajeG.setText("");
    }
}
