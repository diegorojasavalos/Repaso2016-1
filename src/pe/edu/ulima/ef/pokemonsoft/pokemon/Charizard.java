
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Charizard extends Especie{

    public Charizard(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {
        
    }

    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel() + 3);
    }

    
}
