package lk.knj.practical_4.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import lk.knj.practical_4.fragment.SignInFragment;
import lk.knj.practical_4.fragment.SignUpFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1){
            return new SignInFragment();
        }
        return new SignUpFragment();
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager , @NonNull Lifecycle lifecycle){
        super(fragmentManager,lifecycle);
    }



    @Override
    public int getItemCount(){
        return 2;
    }

}
