package com.example.tareasemana4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Canciones_Fav#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Canciones_Fav extends Fragment {
    private RecyclerView recyclerView;
    private CancionesAdapter cancionesAdapter;
    private List<Cancion> listaCanciones;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Canciones_Fav() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Canciones_Fav.
     */
    // TODO: Rename and change types and number of parameters
    public static Canciones_Fav newInstance(String param1, String param2) {
        Canciones_Fav fragment = new Canciones_Fav();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_canciones__fav, container, false);
        // Inflate the layout for this fragment
        listaCanciones = new ArrayList<>();
        listaCanciones.add(new Cancion("Hotel California", "https://www.youtube.com/watch?v=98CFJmoADO0&pp=ygUJaG90ZWwgY2Fs"));
        listaCanciones.add(new Cancion("Lo Malo De Ser Bueno", "https://www.youtube.com/watch?v=S_roMeig-YQ&pp=ygUUbG8gbWFsbyBkZSBzZXIgYnVlbm8%3D"));
        listaCanciones.add(new Cancion("Bachata en Kingston","https://www.youtube.com/watch?v=_AHNTdSfa40&pp=ygUTYmFjaGF0YSBlbiBraW5nc3Rvbg%3D%3D"));

        // Obtener referencias al RecyclerView y configurarlo
        recyclerView = rootView.findViewById(R.id.recyclerViewCanciones);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cancionesAdapter = new CancionesAdapter(listaCanciones);
        recyclerView.setAdapter(cancionesAdapter);

        return rootView;
    }
}