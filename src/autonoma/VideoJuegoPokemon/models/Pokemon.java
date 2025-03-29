/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.VideoJuegoPokemon.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250326
 * @version 1.0.0
 */
public abstract class Pokemon {
    private int nombrePokedex;
    String nombre;
    private double peso;
    private int temporada;

    public Pokemon(int nombrePokedex, String nombre, double peso, int temporada) {
        this.nombrePokedex = nombrePokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public int getNombrePokedex() {
        return nombrePokedex;
    }

    public void setNombrePokedex(int nombrePokedex) {
        this.nombrePokedex = nombrePokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    public String atacarPlacaje(){
        return "Soy " + nombre + " y estoy atacando con Placaje.";
        
    }
    public String atacarArañazo(){
        return "Soy " + nombre + " y estoy atacando con Arañazo.";
        
    }
    public String atacarMordisco(){
        return "Soy " + nombre + " y estoy atacando con Mordisco.";
    }
}
