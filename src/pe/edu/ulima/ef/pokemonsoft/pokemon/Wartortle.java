
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Wartortle extends Especie{

    public Wartortle(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {
        if (mPokemon.getNivel() >= 36){
            mPokemon.setEspecie(new Blastoise(mPokemon));
        }
    }

    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel()+2);
    }

    
}
