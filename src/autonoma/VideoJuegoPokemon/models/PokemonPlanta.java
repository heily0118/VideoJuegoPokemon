/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.VideoJuegoPokemon.models;

/**
 *
 * @author Maria Paz Puerta <mariap.puertaa@autonoma.edu.co>
 * @since 20250326
 * @version 1.0.0
 * 
 */
public interface PokemonPlanta {
    
    /**
     * Realiza el ataque Paralizar.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Paralizar.
     */
    public abstract String atacarParalizar();
    
    /**
     * Realiza el ataque Drenaje.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Drenaje.
     */
    public abstract String atacarDrenaje();
    
    /**
     * Realiza el ataque Hoja Afilada.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Hoja Afilada.
     */
    public abstract String atacarHojaAfilada();
    
    /**
     * Realiza el ataque Latigo Cepa.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Latigo Cepa.
     */
    public abstract String atacarLatigoCepa();
    
}
