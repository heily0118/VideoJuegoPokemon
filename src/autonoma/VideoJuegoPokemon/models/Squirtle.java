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
public class Squirtle extends Pokemon implements PokemonAgua{

    /**
     * Constructor de la clase Squirtle.
     * @param nombrePokedex El número de la Pokédex asignado a el pokémon Bulbasaur.
     * @param nombre El nombre del pokémon (Squirtle).
     * @param peso El peso del pokémon Squirtle.
     * @param temporada La temporada en la que aparece el pokémon Squirtle.
     *
     */
    public Squirtle(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }

    /**
     * El método se utiliza para representar el ataque Hidrobomba.
     * @return Retorna el mensaje de quién es el pokémon (Squirtle) y que ataque esta utilizando (Hidrobomba).
     */
    @Override
    public String atacarHidrobomba() {
        return "Soy" + getNombre() + " y estoy atacando con Hidrobomba";
    }

    /**
     * El método se utiliza para representar el ataque Pistola Agua.
     * @return Retorna el mensaje de quién es el pokémon (Squirtle) y que ataque esta utilizando (Pistola Agua).
     */
    @Override
    public String atacarPistolaAgua() {
        return "Soy" + getNombre() + " y estoy atacando con Pistola de Agua";
    }

    /**
     * El método se utiliza para representar el ataque Burbuja.
     * @return Retorna el mensaje de quién es el pokémon (Squirtle) y que ataque esta utilizando (Burbuja).
     */
    @Override
    public String atacarBurbuja() {
        return "Soy" + getNombre() + " y estoy atacando con Burbuja";
    }

    /**
     * El método se utiliza para representar el ataque Hidropulso.
     * @return Retorna el mensaje de quién es el pokémon (Squirtle) y que ataque esta utilizando (Hidropulso).
     */
    @Override
    public String atacarHidropulso() {
        return "Soy" + getNombre() + " y estoy atacando con Hidropulso";
    }
    
    
    
}
