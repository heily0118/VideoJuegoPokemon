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
    
    public Pikachu(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }
    

    @Override
    public String atacarPunioTrueno() {
       return "Soy " + getNombre() + " y estoy atacando con Punio Trueno.";
    }

    @Override
    public String atacarRayo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo.";
    }

    @Override
    public String atacarRayoCargo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo Cargo.";
    }

    @Override
    public String atacarImpactrueno() {
        return "Soy " + getNombre() + " y estoy atacando con Impactrueno.";
    }
}
