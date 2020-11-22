package Nuevo;

import java.util.ArrayList;

public class Sede {

    public static ArrayList<Sede> sedes = new ArrayList<>();

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
