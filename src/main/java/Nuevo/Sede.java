package Nuevo;

import java.util.ArrayList;
import java.util.Hashtable;

public class Sede {

    //public static ArrayList<Sede> sedes = new ArrayList<>();
    public static Hashtable<Integer,Sede> tabla = new Hashtable<>();

    public String nombre;
    public String direccion;
    public String ciudad;

    public Sede( String nombre, String ciudad, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Sede{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
