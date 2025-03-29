/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.VideoJuegoPokemon.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public abstract class Pokemon {
    private int nombrePokedex;
    private String nombre;
    private double peso;
    private int temporada;

    public Pokemon(int nombrePokedex, String nombre, double peso, int temporada) {
        this.nombrePokedex = nombrePokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    public void atacarPlacaje(){
        System.out.println("Soy " + nombre + " y estoy atacando con Placaje.");
        
    }
    public void atacarArañazo(){
        System.out.println("Soy " + nombre + " y estoy atacando con Arañazo.");
        
    }
    public void atacarMordisco(){
        System.out.println("Soy " + nombre + " y estoy atacando con Mordisco.");
    }
}
