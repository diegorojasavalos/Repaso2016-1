
package pe.edu.ulima.ef.pokemonsoft;

public interface CalculadorPeleas {
    /*
     * Metodo que calcula el ganador de peleas entre dos pokemones.
     * Si el resultado es 1 significa que gano el pokemon1 y si el
     * resultado es 2 significa que gano el pokemon2.
    */
    public int luchar(Pokemon pokemon1, Pokemon pokemon2);
}
