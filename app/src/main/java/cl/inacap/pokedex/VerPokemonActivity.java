package cl.inacap.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.inacap.pokedex.dto.Pokemon;

public class VerPokemonActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView nombrePokemonYNumeroTv;
    private ImageView imagenTipoPokemonIv2;
    private ImageView imagenPokemonIv;
    private TextView descripcionPokemonTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_pokemon);
        this.toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(this.toolbar);
        this.nombrePokemonYNumeroTv = findViewById(R.id.nombrePokemonYNumeroTv);
        this.imagenTipoPokemonIv2 = findViewById(R.id.imagenTipoPokemonIv2);
        this.imagenPokemonIv = findViewById(R.id.imagenPokemonIv);
        this.descripcionPokemonTv = findViewById(R.id.descripcionPokemonTv);

        if (getIntent() != null) {
            Pokemon pokemon = (Pokemon)getIntent().getSerializableExtra("pokemon");
            this.nombrePokemonYNumeroTv.setText(Integer.toString(pokemon.getNumero()) + ". " + pokemon.getNombre());
            this.imagenTipoPokemonIv2.setImageResource(pokemon.getImagenTipo());
            this.imagenPokemonIv.setImageResource(pokemon.getImagenPokemon());
            this.descripcionPokemonTv.setText(pokemon.getDescripcion());
        }
    }
}