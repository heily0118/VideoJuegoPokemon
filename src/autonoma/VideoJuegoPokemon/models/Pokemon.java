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
    /// Atributos
    /**
     * Es el número de identificación del Pokémon en la Pokédex.
     */
    private int nombrePokedex;
    
    /**
     * Es el nombre del Pokémon.
     */
    String nombre;
    
    /**
     * Es el peso del Pokémon.
     */
    private double peso;
    
    /**
     * Es la temporada en la que aparece el Pokémon.
     */
    private int temporada;

    /**
     * Constructor de la clase Pokémon.
     * @param nombrePokedex El número de la Pokédex asignado a el pokémon.
     * @param nombre El nombre del pokémon.
     * @param peso El peso del pokémon.
     * @param temporada La temporada en la que aparece el pokémon.
     * 
     */
    public Pokemon(int nombrePokedex, String nombre, double peso, int temporada) {
        this.nombrePokedex = nombrePokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    /**
     * Obtiene el número de la Pokédex del Pokémon.
     * @return Retorna el número de la Pokédex del Pokémon.
     */
    public int getNombrePokedex() {
        return nombrePokedex;
    }

    /**
     * Establece el número de la Pokédex del Pokémon.
     * @param nombrePokedex Es el número de la Pokédex del Pokémon.
     */
    public void setNombrePokedex(int nombrePokedex) {
        this.nombrePokedex = nombrePokedex;
    }

    /**
     * Obtiene el nombre del Pokémon.
     * @return Retorna el nombre del Pokémon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del Pokémon.
     * @param nombre Es el nombre del Pokémon.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el peso del Pokémon.
     * @return Retorna el peso del Pokémon.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el peso del Pokémon.
     * @param peso Es el peso del Pokémon.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene la temporada en la que aparece el Pokémon.
     * @return Retorna el número de la temporada en la que aparece el Pokémon.
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Establece la temporada en la que aparece el Pokémon.
     * @param temporada Es el número de la temporada en la que aparece el Pokémon.
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    /**
     * El método se utiliza para representar el ataque Placaje.
     * @return Retorna un mensaje indicando que el Pokémon está atacando con Placaje.
     */
    public String atacarPlacaje(){
        return "Soy " + nombre + " y estoy atacando con Placaje.";
        
    }
    
    /**
     * El método se utiliza para representar el ataque Arañazo.
     * @return Retorna un mensaje indicando que el Pokémon está atacando con Arañazo.
     */
    public String atacarArañazo(){
        return "Soy " + nombre + " y estoy atacando con Arañazo.";
    }
    
    /**
     * El método se utiliza para representar el ataque Mordisco.
     * @return Retorna un mensaje indicando que el Pokémon está atacando con Mordisco.
     */
    public String atacarMordisco(){
        return "Soy " + nombre + " y estoy atacando con Mordisco.";
    }
}
