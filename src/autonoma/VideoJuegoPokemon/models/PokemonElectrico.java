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
public interface PokemonElectrico {

    /**
     * Realiza el ataque Impactrueno.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Impactrueno.
     */
    public abstract String atacarImpactrueno();
    
    /**
     * Realiza el ataque Punio Trueno.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Punio Trueno.
     */
    public abstract String atacarPunioTrueno();
    
    /**
     * Realiza el ataque Rayo.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Rayo.
     */
    public abstract String atacarRayo();
    
    /**
     * Realiza el ataque Rayo Cargo.
     * @return Retorna un mensaje indicando que el Pokémon está utilizando el ataque Rayo Cargo.
     */
    public abstract String atacarRayoCargo();
    
}
