
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Bulbasaur extends Especie{

    public Bulbasaur(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {
    if (mPokemon.getNivel() >= 16){
            mPokemon.setEspecie(new Ivysaur(mPokemon));
        }    
    }

    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel() + 1);
    }

    
}
