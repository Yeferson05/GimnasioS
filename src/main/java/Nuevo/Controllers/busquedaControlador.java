package Nuevo.Controllers;

import Nuevo.App;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;

import java.io.IOException;

public class busquedaControlador {


    public javafx.scene.control.ListView ListView;

    public void volver(ActionEvent actionEvent) throws IOException {
        App.setRoot("menuPrincipal");
    }
}
