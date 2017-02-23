
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public abstract class Especie{
    protected Pokemon mPokemon;
    
    public Especie(Pokemon pokemon){
        mPokemon = pokemon;
    }
    
    public abstract void evolucionar();
    
    public abstract void aumentarNivel();

}
