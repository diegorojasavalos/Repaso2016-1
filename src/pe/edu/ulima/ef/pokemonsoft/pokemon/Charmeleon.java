
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Charmeleon extends Especie{

    public Charmeleon(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {
        if (mPokemon.getNivel() >= 36){
            mPokemon.setEspecie(new Charizard(mPokemon));
        }
    
    }

    @Override
    public void aumentarNivel() {
    mPokemon.setNivel(mPokemon.getNivel() + 2);    
    }


    
}
