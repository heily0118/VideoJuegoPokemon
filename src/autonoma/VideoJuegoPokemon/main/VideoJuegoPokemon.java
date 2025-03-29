/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.VideoJuegoPokemon.main;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250326
 * @version 1.0.0
 */
public class VideoJuegoPokemon {

    public static void main(String[] args) {
      Pikachu pikachu = new Pikachu(25, "Pikachu", 6.0, 1);
        Charmander charmander = new Charmander(4, "Charmander", 8.5, 1);
        Squirtle squirtle = new Squirtle(7, "Squirtle", 9.0, 1);
        Bulbasaur bulbasaur = new Bulbasaur(1, "Bulbasaur", 6.9, 1);

        // Llamar a los métodos de ataque
        System.out.println("----- Ataques Pokémon -----");
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();

        charmander.atacarLanzallamas();
        charmander.atacarAscuas();

        squirtle.atacarHidrobomba();
        squirtle.atacarBurbuja();

        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarDrenaje();
    
    }
    
}
