package com.example.bikegears;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.bikegears.Adapters.PagerFragmentAdapter;
import com.example.bikegears.fragment.LoginFragment;
import com.example.bikegears.fragment.RegisterFragment;


public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = findViewById(R.id.viewPager);

        PagerFragmentAdapter adapter = new PagerFragmentAdapter(getSupportFragmentManager());

        adapter.addFragment(new LoginFragment(), "Login");
        adapter.addFragment(new RegisterFragment(), "Registration");

        viewPager.setAdapter(adapter);

    }
}