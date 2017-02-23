
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Charmander extends Especie{

    public Charmander(Pokemon pokemon) {
        super(pokemon);
    }


    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel()+1);
    }

    @Override
    public void evolucionar() {
    if (mPokemon.getNivel() >= 16){
            mPokemon.setEspecie(new Charmeleon(mPokemon));
        }    
    }
    
}
