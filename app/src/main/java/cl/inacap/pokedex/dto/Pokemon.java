package cl.inacap.pokedex.dto;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String nombre;
    private int imagenPokemon; //Tiene que ser int porque la referencia a un id es un int (R.drawable.nombreImagen=int).
    private String tipo;
    private int imagenTipo; //Tiene que ser int porque la referencia a un id es un int (R.drawable.nombreImagen=int).
    private int numero;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagenPokemon() {
        return imagenPokemon;
    }

    public void setImagenPokemon(int imagenPokemon) {
        this.imagenPokemon = imagenPokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImagenTipo() {
        return imagenTipo;
    }

    public void setImagenTipo(int imagenTipo) {
        this.imagenTipo = imagenTipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
