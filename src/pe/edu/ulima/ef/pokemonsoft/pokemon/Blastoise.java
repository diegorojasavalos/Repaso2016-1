package pe.edu.ulima.ef.pokemonsoft.pokemon;

import pe.edu.ulima.ef.pokemonsoft.Pokemon;

public class Blastoise extends Especie {

    public Blastoise(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void aumentarNivel() {
        mPokemon.setNivel(mPokemon.getNivel() + 3);
    }

    @Override
    public void evolucionar() {

    }

}
