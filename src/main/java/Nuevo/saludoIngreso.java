package Nuevo;

import java.util.ArrayList;

public class saludoIngreso {
    public static ArrayList<saludoIngreso> saludo = new ArrayList<>();
    public String nombre;
    public String apellido;

    public saludoIngreso( String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  nombre + " "+ apellido;
    }
}
