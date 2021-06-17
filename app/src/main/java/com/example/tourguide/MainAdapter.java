package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import javax.crypto.SealedObject;

public class MainAdapter extends FragmentStateAdapter {

    public MainAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position)
        {
            case 1 : return new SecondFragment();
            case 2 : return new FinalFragment();
            default:
                return new FirstFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
