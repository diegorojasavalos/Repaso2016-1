
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Squirtle extends Especie{

    public Squirtle(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void evolucionar() {
        if (mPokemon.getNivel() >= 16){
            mPokemon.setEspecie(new Wartortle(mPokemon));
        }
    }

    @Override
    public void aumentarNivel() {
         mPokemon.setNivel(mPokemon.getNivel()+1);
    }

    
}
