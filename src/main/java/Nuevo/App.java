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
import static Nuevo.Zona.zonas;
import static Nuevo.Curso.cursos;
import static Nuevo.Sede.tabla;

/**
 * JavaFX App
 */
public class App extends Application {
    public static Graph<Sede, DefaultEdge> grafo = new SimpleGraph<>(DefaultEdge.class);
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

        Usuario usuarioUno = new Usuario(10298291, "Andres","Garcia","andres123@gmail.com","andres123");
        Usuario.usuarios.add(usuarioUno);

        Usuario usuarioDos = new Usuario(10876162,"Daniela","Diaz", "danielad10@gmail.com","dani10876162");
        Usuario.usuarios.add(usuarioDos);

        Usuario usuarioTres = new Usuario(10047432,"Camilo","Murillo","murillo27@gmail.com","1234camilo");
        Usuario.usuarios.add(usuarioTres);

        Curso cursosUno = new Curso("Crossfit",100370,"2");
        cursos.put(cursosUno.codigo, cursosUno);
        Curso cursoDos = new Curso("Yoga",100371,"3");
        cursos.put(cursoDos.codigo, cursoDos);
        Curso cursosTres = new Curso ("Boxeo",100372,"4");
        cursos.put(cursosTres.codigo, cursosTres);

        Sede sedeUno = new Sede("YogaFitness","Medellin","Cra 12, C 05 ",cursoDos);
        tabla.put(sedeUno.direccion, sedeUno);
        Sede sedeDos = new Sede("BoxingGym","Cali","Cll 40, C 06",cursosTres);
        tabla.put(sedeDos.direccion, sedeDos);
        Sede sedeTres = new Sede ("CrossBogota","Bogota","Cra 15, A 07",cursosUno);
        tabla.put(sedeTres.direccion, sedeTres);
        Zona zona1 = new Zona (100101,"Pesas");
        zonas.put(zona1.id,zona1);
        Zona zona2 = new Zona (100102,"Cardio");
        zonas.put(zona2.id,zona2);
        Zona zona3= new Zona (100103,"Estiramiento");
        zonas.put(zona3.id,zona3);
    }

}