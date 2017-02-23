
package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Ivysaur extends Especie{

    public Ivysaur(Pokemon pokemon) {
        super(pokemon);
    }


    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel()+2);
    }

    @Override
    public void evolucionar() {
        if (mPokemon.getNivel() >= 32){
            mPokemon.setEspecie(new Venusaur(mPokemon));
        }
        
    }
    
}
