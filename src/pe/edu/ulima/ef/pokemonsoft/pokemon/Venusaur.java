
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Venusaur extends Especie{

    public Venusaur(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {}

    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel()+3);
    }
    
}
