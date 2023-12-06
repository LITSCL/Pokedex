package cl.inacap.pokedex.dao;

import java.util.List;

import cl.inacap.pokedex.dto.Pokemon;

public interface PokemonDAO {
    Pokemon create(Pokemon p);
    List<Pokemon> getAll();
}
