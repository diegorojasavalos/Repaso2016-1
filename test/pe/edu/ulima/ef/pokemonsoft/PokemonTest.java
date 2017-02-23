/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.ef.pokemonsoft;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Blastoise;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Bulbasaur;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Charizard;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Charmander;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Charmeleon;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Ivysaur;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Squirtle;
import pe.edu.ulima.ef.pokemonsoft.pokemon.Wartortle;

/**
 *
 * @author Administrator
 */
public class PokemonTest {
    
    public PokemonTest() {
    }
    
    @Test
    public void testBulbasaurIvysaur(){
        Pokemon pokemon = new Pokemon();
        pokemon.setEspecie(new Bulbasaur(pokemon));
        pokemon.setNivel(16);
        
        pokemon.getEspecie().evolucionar();
        
        assertTrue("Pokemon no evoluciona", pokemon.getEspecie() instanceof Ivysaur);
        
    }
    
    
    @Test
    public void testCharmeleonCharizar(){
        
        Pokemon pokemon = new Pokemon();
        pokemon.setEspecie(new Charmeleon(pokemon));
        pokemon.setNivel(36);
        
        pokemon.getEspecie().evolucionar();
        
        assertTrue("Pokemon no evoluciona", pokemon.getEspecie() instanceof Charizard);
        
    }
    
    
    @Test
    public void testsquartleWartortle(){
        
        Pokemon pokemon = new Pokemon();
        pokemon.setEspecie(new Squirtle(pokemon));
        pokemon.setNivel(16);
        
        pokemon.getEspecie().evolucionar();
        
        assertTrue("Pokemon no evoluciona", pokemon.getEspecie() instanceof Wartortle);
        
    }
    
    public void testPeleaBulbasaurSquirtle(){
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        
        p1.setEspecie(new Bulbasaur(p1));
        p1.setNivel(15);
        p2.setEspecie(new Squirtle(p2));
        p2.setNivel(1);
        
        CalculadorPeleas calculador = mock(CalculadorPeleas.class);
        when(calculador.luchar(p1, p2)).thenReturn(1);
        
        PokemonBattle pb = new PokemonBattle(calculador);
        
        pb.luchar(p1, p2);
        
        assertTrue("Error" , p1.getEspecie() instanceof Ivysaur);
        
        
        
    }
    
    
    public void testPeleaCharmeleonWartortle(){
        
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        
        p1.setEspecie(new Charmander(p1));
        p1.setNivel(15);
        p2.setEspecie(new Wartortle(p2));
        p2.setNivel(35);
        
        CalculadorPeleas calculador = mock(CalculadorPeleas.class);
        when(calculador.luchar(p1, p2)).thenReturn(2);
        
        PokemonBattle pb = new PokemonBattle(calculador);
        
        pb.luchar(p1, p2);
        
        assertTrue("Error" , p2.getEspecie() instanceof Blastoise);
    }
    
}
