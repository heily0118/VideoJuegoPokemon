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
    
    public Charmander(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }

    @Override
    public String atacarPunioFuego() {
        return "Soy" + getNombre() +" y estoy atacando con Punio de Fuego";
    }

    @Override
    public String atacarAscuas() {
        return "Soy" + getNombre() +" y estoy atacando con Ascuas";
    }

    @Override
    public String atacarLanzallamas() {
        return "Soy" + getNombre() +" y estoy atacando con Lanzallamas";
    }
    
    
    
}
