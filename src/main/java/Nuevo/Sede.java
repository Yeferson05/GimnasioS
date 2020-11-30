package Nuevo;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;


import java.util.Hashtable;

public class Sede {

    public static Hashtable<String,Sede> tabla = new Hashtable<>();



    public String nombre;
    public String direccion;
    public String ciudad;
    public Curso curso;

    @Override
    public String toString() {
        return "Sede{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", curso=" + curso +
                '}';
    }

    public Sede(String nombre, String ciudad, String direccion, Curso curso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.curso=curso;
        //App.grafo.addVertex(this);
        //App.grafo.addEdge()
    }

}

