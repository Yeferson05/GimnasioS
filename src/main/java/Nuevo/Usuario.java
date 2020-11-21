package Nuevo;

import java.util.ArrayList;

public class Usuario {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public int cedula;
    public String nombre;
    public String apellido;
    public String correo;
    public String password;

    public Usuario( int cedula, String nombre, String apellido, String correo, String password) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }
}
