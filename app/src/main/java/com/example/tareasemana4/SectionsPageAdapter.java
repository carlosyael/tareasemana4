package com.example.tareasemana4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SectionsPageAdapter extends FragmentStateAdapter {
    public SectionsPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                Inicio tab1obj=new Inicio();
                return tab1obj;
            case 1:
                Contacto tab2obj=new Contacto();
                return tab2obj;

            case 2:
                Registro tab3obj=new Registro();
                return tab3obj;
            case 3:
                Canciones_Fav tab4obj=new Canciones_Fav();
                return tab4obj;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
