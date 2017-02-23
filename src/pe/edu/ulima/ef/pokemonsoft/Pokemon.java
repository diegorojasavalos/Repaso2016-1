
package pe.edu.ulima.ef.pokemonsoft;

import pe.edu.ulima.ef.pokemonsoft.pokemon.Especie;

public class Pokemon {
    private Especie especie;
    private int nivel;

    public Pokemon() {
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
