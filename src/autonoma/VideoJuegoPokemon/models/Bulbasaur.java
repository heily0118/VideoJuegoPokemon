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
public class Bulbasaur extends Pokemon implements PokemonPlanta{
    
    /**
     * Constructor de la clase Bulbasaur
     * @param nombrePokedex El número de la Pokédex asignado a el pokémon Bulbasaur.
     * @param nombre El nombre del pokémon (Bulbasaur).
     * @param peso El peso del pokémon Bulbasaur.
     * @param temporada La temporada en la que aparece el pokémon Bulbasaur.
     */
    public Bulbasaur(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }
    
    /**
     * El método se utiliza para representar el ataque Paralizar.
     * @return Retorna el mensaje de quién es el pokémon (Bulbasaur) y que ataque esta utilizando (Paralizar).
     */
    @Override
    public String atacarParalizar() {
        return "Soy" + getNombre() + " y estoy atacando con Paralizar";
    }
    
    /**
     * El método se utiliza para representar el ataque Drenaje.
     * @return Retorna el mensaje de quién es el pokémon (Bulbasaur) y que ataque esta utilizando (Drenaje).
     */
    @Override
    public String atacarDrenaje() {
        return "Soy " + getNombre() + " y estoy atacando con drenaje";
    }
    
    /**
     * El método se utiliza para representar el ataque Hoja Afilada.
     * @return Retorna el mensaje de quién es el pokémon (Bulbasaur) y que ataque esta utilizando (Hoja Afilada).
     */
    @Override
    public String atacarHojaAfilada() {
        return "Soy " + getNombre() + " y estoy atacando con hoja afilada";
    }
    
    /**
     * El método se utiliza para representar el ataque Latigo Cepa.
     * @return Retorna el mensaje de quién es el pokémon (Bulbasaur) y que ataque esta utilizando (Latigo Cepa).
     */
    @Override
    public String atacarLatigoCepa() {
        return "Soy " + getNombre() + " y estoy atacando con latigo cepa";
    }
    
}
