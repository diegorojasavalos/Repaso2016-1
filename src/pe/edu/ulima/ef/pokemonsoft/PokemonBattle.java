
package pe.edu.ulima.ef.pokemonsoft;

public class PokemonBattle {
    public CalculadorPeleas calculador;

    public PokemonBattle(CalculadorPeleas calculador) {
        this.calculador = calculador;
    }
    
    /*
     * Metodo que realiza la batalla entre los pokemones.
     * Como se ve, se utilizar la interface CalculadorPeleas.
    */
    public void luchar(Pokemon pok1, Pokemon pok2){
        int gan = calculador.luchar(pok1, pok2);
        
        if (gan == 1){
            // Gano pokemon 1
            pok1.getEspecie().aumentarNivel();
            pok1.getEspecie().evolucionar();
        }else if (gan == 2){
            // Gano pokemon 2
            pok2.getEspecie().aumentarNivel();
            pok2.getEspecie().evolucionar();
        }
    }
}
