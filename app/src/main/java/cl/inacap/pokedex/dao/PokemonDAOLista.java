package cl.inacap.pokedex.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.pokedex.R;
import cl.inacap.pokedex.dto.Pokemon;

public class PokemonDAOLista implements PokemonDAO {
    List<Pokemon> pokemones = new ArrayList<Pokemon>();
    private static PokemonDAOLista instancia;

    private PokemonDAOLista(){
        Pokemon p = new Pokemon();
        p.setNombre("Pikachu");
        p.setImagenPokemon(R.drawable.pikachu);
        p.setTipo("Eléctrico");
        p.setImagenTipo(R.drawable.pokemon_electrico);
        p.setNumero(1);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce convallis lacus eu metus elementum interdum. Vestibulum accumsan velit a scelerisque venenatis. Donec vitae sodales quam. Nam vitae purus erat. Cras lectus dolor, rutrum vel egestas ac, ullamcorper et ligula. Etiam posuere et quam ut elementum. Morbi felis ante, vestibulum sit amet justo vel, sodales faucibus justo.");
        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Charmander");
        p.setImagenPokemon(R.drawable.charmander);
        p.setTipo("fuego");
        p.setImagenTipo(R.drawable.pokemon_fuego);
        p.setNumero(2);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce convallis lacus eu metus elementum interdum. Vestibulum accumsan velit a scelerisque venenatis. Donec vitae sodales quam. Nam vitae purus erat. Cras lectus dolor, rutrum vel egestas ac, ullamcorper et ligula. Etiam posuere et quam ut elementum. Morbi felis ante, vestibulum sit amet justo vel, sodales faucibus justo.");
        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Squirtle");
        p.setImagenPokemon(R.drawable.squirtle);
        p.setTipo("Agua");
        p.setImagenTipo(R.drawable.pokemon_agua);
        p.setNumero(3);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce convallis lacus eu metus elementum interdum. Vestibulum accumsan velit a scelerisque venenatis. Donec vitae sodales quam. Nam vitae purus erat. Cras lectus dolor, rutrum vel egestas ac, ullamcorper et ligula. Etiam posuere et quam ut elementum. Morbi felis ante, vestibulum sit amet justo vel, sodales faucibus justo.");
        pokemones.add(p);

        p = new Pokemon();
        p.setNombre("Bulbasur");
        p.setImagenPokemon(R.drawable.bulbasur);
        p.setTipo("Planta");
        p.setImagenTipo(R.drawable.pokemon_planta);
        p.setNumero(4);
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce convallis lacus eu metus elementum interdum. Vestibulum accumsan velit a scelerisque venenatis. Donec vitae sodales quam. Nam vitae purus erat. Cras lectus dolor, rutrum vel egestas ac, ullamcorper et ligula. Etiam posuere et quam ut elementum. Morbi felis ante, vestibulum sit amet justo vel, sodales faucibus justo.");
        pokemones.add(p);
    }

    public static PokemonDAOLista getInstance() {
        if (instancia == null) {
            instancia = new PokemonDAOLista();
        }
        return instancia;
    }

    @Override
    public Pokemon create(Pokemon p) {
        pokemones.add(p);
        return p;
    }

    @Override
    public List<Pokemon> getAll() {
        return pokemones;
    }
}
