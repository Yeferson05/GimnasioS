package Nuevo;

import java.util.ArrayList;

public class Curso {

    public static ArrayList<Curso> cursos = new ArrayList<>();

    public String nombre;

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", intesidadHora='" + intesidadHora + '\'' +
                '}';
    }

    public int codigo;
    public String intesidadHora;

    public Curso(String nombre, int codigo, String intesidadHora) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.intesidadHora = intesidadHora;

    }

}
