package Nuevo;


import java.util.Hashtable;

public class Zona {
    public static Hashtable<Integer,Zona> zon = new Hashtable<>();
    public int id;
    public String zona;

    public Zona(int id, String zona) {

        this.id=id;
        this.zona=zona;
        App.grafo.addVertex(this);

    }

    @Override
    public String toString() {
        return "Zona{" +
                "id=" + id +
                ", zona='" + zona + '\'' +
                '}';
    }
    public void  crearConexion (Object destino){
        App.grafo.addEdge(this, destino);
    }
}
