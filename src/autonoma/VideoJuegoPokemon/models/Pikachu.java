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
public class Pikachu extends Pokemon implements PokemonElectrico {
    
    /**
     * Constructor de la clase Pikachu.
     * @param nombrePokedex El número de la Pokédex asignado a el pokémon Pikachu.
     * @param nombre El nombre del pokémon (Pikachu).
     * @param peso El peso del pokémon Pikachu.
     * @param temporada La temporada en la que aparece el pokémon Pikachu.
     * 
     */
    public Pikachu(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }
    
    /**
     * El método se utiliza para representar el ataque Punio Trueno.
     * @return Retorna el mensaje de quién es el pokémon (Pikachu) y que ataque esta utilizando (Punio Trueno).
     */
    @Override
    public String atacarPunioTrueno() {
       return "Soy " + getNombre() + " y estoy atacando con Punio Trueno.";
    }

    /**
     * El método se utiliza para representar el ataque Rayo.
     * @return Retorna el mensaje de quién es el pokémon (Pikachu) y que ataque esta utilizando (Rayo).
     */
    @Override
    public String atacarRayo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo.";
    }

    /**
     * El método se utiliza para representar el ataque Rayo Cargo.
     * @return Retorna el mensaje de quién es el pokémon (Pikachu) y que ataque esta utilizando (Rayo Cargo).
     */
    @Override
    public String atacarRayoCargo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo Cargo.";
    }

    /**
     * El método se utiliza para representar el ataque ImpacTrueno.
     * @return Retorna el mensaje de quién es el pokémon (Pikachu) y que ataque esta utilizando (ImpacTrueno).
     */
    @Override
    public String atacarImpactrueno() {
        return "Soy " + getNombre() + " y estoy atacando con Impactrueno.";
    }
}
