package Nuevo;

import java.util.ArrayList;
import java.util.Hashtable;

public class Zona {
    public static ArrayList<Zona> zonas = new ArrayList<>();
    //public static Hashtable<Integer,String> zonas = new Hashtable<>();
    public int id;
    public String zona;

    public Zona(int id, String zona) {

        this.id=id;
        this.zona=zona;

    }

    @Override
    public String toString() {
        return "Zona{" +
                "id=" + id +
                ", zona='" + zona + '\'' +
                '}';
    }
}
