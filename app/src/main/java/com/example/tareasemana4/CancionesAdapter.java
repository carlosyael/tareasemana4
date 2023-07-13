package com.example.tareasemana4;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CancionesAdapter extends RecyclerView.Adapter<CancionesAdapter.CancionViewHolder> {

    private List<Cancion> listaCanciones;

    public CancionesAdapter(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @NonNull
    @Override
    public CancionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cancion, parent, false);
        return new CancionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CancionViewHolder holder, int position) {
        Cancion cancion = listaCanciones.get(position);
        holder.bind(cancion);
    }

    @Override
    public int getItemCount() {
        return listaCanciones.size();
    }

    public class CancionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView textViewTitulo;

        public CancionViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            itemView.setOnClickListener(this);
        }

        public void bind(Cancion cancion) {
            textViewTitulo.setText(cancion.getTitulo());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Obtener la URL de la canción
                    String url = cancion.getUrl();

                    // Redirigir a la URL
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    itemView.getContext().startActivity(intent);
                }
            });
        }

        @Override
        public void onClick(View v) {
            // Aquí puedes obtener el enlace del video de YouTube correspondiente a la canción
            // y realizar la acción deseada, como abrir el enlace en un navegador o reproductor de video.
        }
    }
}
