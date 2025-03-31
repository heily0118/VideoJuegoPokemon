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
public class Charmander extends Pokemon implements PokemonFuego{
    
    /**
     * Constructor de la clase Charmander.
     * @param nombrePokedex El número de la Pokédex asignado a el pokémon Bulbasaur.
     * @param nombre El nombre del pokémon (Charmander).
     * @param peso El peso del pokémon Charmander.
     * @param temporada La temporada en la que aparece el pokémon Charmander.
     */
    public Charmander(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }
    
    /**
     * El método se utiliza para representar el ataque Punio Fuego.
     * @return Retorna el mensaje de quién es el pokémon (Charmander) y que ataque esta utilizando (Punio Fuego).
     */
    @Override
    public String atacarPunioFuego() {
        return "Soy" + getNombre() + " y estoy atacando con Punio de Fuego.";
    }
    
    /**
     * El método se utiliza para representar el ataque Ascuas.
     * @return Retorna el mensaje de quién es el pokémon (Charmander) y que ataque esta utilizando (Ascuas).
     */
    @Override
    public String atacarAscuas() {
        return "Soy " + getNombre() + " y estoy atacando con Ascuas.";
    }

    /**
     * El método se utiliza para representar el ataque Lanzallamas.
     * @return Retorna el mensaje de quién es el pokémon (Charmander) y que ataque esta utilizando (Lanzallamas).
     */
    @Override
    public String atacarLanzallamas() {
        return "Soy " + getNombre() + " y estoy atacando con Lanzallamas.";
    }
    
    
    
}
