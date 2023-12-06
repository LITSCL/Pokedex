package cl.inacap.pokedex.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.pokedex.R;
import cl.inacap.pokedex.dto.Pokemon;

public class PokemonArrayAdaptador extends ArrayAdapter<Pokemon> {
    private Activity activity;
    private List<Pokemon> pokemones;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.pokemones_list, null, true);
        TextView nombrePokemonTv = fila.findViewById(R.id.nombrePokemonTv);
        TextView nombreTipoPokemonTv = fila.findViewById(R.id.nombreTipoPokemonTv);
        ImageView imagenTipoPokemonIv = fila.findViewById(R.id.imagenTipoPokemonIv);
        Pokemon pokemonActual = pokemones.get(position);
        nombrePokemonTv.setText(pokemonActual.getNombre());
        nombreTipoPokemonTv.setText(pokemonActual.getTipo());
        imagenTipoPokemonIv.setImageResource(pokemonActual.getImagenTipo());

        return fila;
    }

    public PokemonArrayAdaptador(@NonNull Activity context, int resource, @NonNull List<Pokemon> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.pokemones = objects;
    }
}
