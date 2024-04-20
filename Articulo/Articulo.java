package Articulo;

public class Articulo {
    private String Modelo;
    private String nombre;



    public Articulo() {}

    public Articulo(String Modelo, String nombre) {
        this.Modelo = Modelo;
        this.nombre = nombre;
    }

    public Articulo(Articulo Articulo) {
        Modelo = Articulo.Modelo;
        nombre = Articulo.nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }}


