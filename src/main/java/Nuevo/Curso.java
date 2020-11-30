package Nuevo;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Curso {

    public static Hashtable<Integer,Curso> cursos = new Hashtable<>();

    public String nombre;
    public int codigo;
    public String intesidadHora;
    public List<Zona> zonas;

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", intesidadHora='" + intesidadHora + '\'' +
                ", zonas=" + zonas +
                '}';
    }

    public Curso(String nombre, int codigo, String intesidadHora) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.intesidadHora = intesidadHora;
        this.zonas=new ArrayList<>();
    }

    public void  asociarZona (Zona zona){
        this.zonas.add(zona);
    }

}
