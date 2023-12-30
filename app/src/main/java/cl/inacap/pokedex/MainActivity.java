package cl.inacap.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import cl.inacap.pokedex.adapters.PokemonArrayAdaptador;
import cl.inacap.pokedex.dao.PokemonDAO;
import cl.inacap.pokedex.dao.PokemonDAOLista;
import cl.inacap.pokedex.dto.Pokemon;

public class MainActivity extends AppCompatActivity {
    private ListView pokemonesLv;
    private List<Pokemon> pokemones;
    private PokemonArrayAdaptador adaptador;
    private PokemonDAO daoPokemones = PokemonDAOLista.getInstance();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        pokemones = daoPokemones.getAll();
        adaptador = new PokemonArrayAdaptador(this, R.layout.pokemones_list, pokemones);
        pokemonesLv = findViewById(R.id.pokemonesLv);
        pokemonesLv.setAdapter(adaptador);
        pokemonesLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, VerPokemonActivity.class);
                Pokemon pokemonActual = pokemones.get(i);
                intent.putExtra("pokemon", pokemonActual);
                startActivity(intent);
            }
        });
    }
}