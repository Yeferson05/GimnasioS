package Nuevo;


import java.util.Hashtable;

public class Curso {

    public static Hashtable<Integer,Curso> cursos = new Hashtable<>();

    public String nombre;
    public int codigo;
    public String intesidadHora;

    public Curso(String nombre, int codigo, String intesidadHora) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.intesidadHora = intesidadHora;
        App.grafo.addVertex(this);

    }
    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", intesidadHora='" + intesidadHora + '\'' +
                '}';
    }
    public void  crearConexion (Object destino){
        App.grafo.addEdge(this, destino);
    }

}
