/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.VideoJuegoPokemon.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class Squirtle extends Pokemon implements PokemonAgua{

    public Squirtle(int nombrePokedex, String nombre, double peso, int temporada) {
        super(nombrePokedex, nombre, peso, temporada);
    }

    @Override
    public String atacarHidrobomba() {
        return "Soy" + getNombre() +" y estoy atacando con Hidrobomba";
    }

    @Override
    public String atacarPistolaAgua() {
        return "Soy" + getNombre() +" y estoy atacando con Pistola de Agua";
    }

    @Override
    public String atacarBurbuja() {
        return "Soy" + getNombre() +" y estoy atacando con Burbuja";
    }

    @Override
    public String atacarHidropulso() {
        return "Soy" + getNombre() +" y estoy atacando con Hidropulso";
    }
    
    
    
}
