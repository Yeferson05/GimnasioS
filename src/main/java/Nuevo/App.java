package Nuevo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    public static Graph<Object, DefaultEdge> grafo = new SimpleGraph<>(DefaultEdge.class);
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("ingresar"), 600, 400);
        stage.setScene(scene);
        stage.show();
        /*Object nuevaSede = new Sede ("maria", "medellin", "");
        Sede Coversion = (Sede) (nuevaSede);
        String nombre = Coversion.nombre;*/
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        Usuario nuevoUsuario = new Usuario(123, "Andres","Garcia","andres123@gmail.com","andres123");
        Usuario.usuarios.add(nuevoUsuario);
        /*Zona nuevaZona = new Zona(1,"Pesas");
        Zona.zonas.add(nuevaZona);
        Zona nuevaZona2 = new Zona (2,"Cardio");
        Zona.zonas.add(nuevaZona2);*/
        launch();
    }

}