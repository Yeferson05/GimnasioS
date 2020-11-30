package Nuevo;


import java.util.Hashtable;

public class Zona {
    public static Hashtable<Integer,Zona> zonas = new Hashtable<>();
    public int id;
    public String zona;

    @Override
    public String toString() {
        return "(" +
                "id=" + id +
                ", zona='" + zona + '\'' +
                ')';
    }

    public Zona(int id, String zona) {

        this.id=id;
        this.zona=zona;
        //App.grafo.addVertex(this);

    }


}
