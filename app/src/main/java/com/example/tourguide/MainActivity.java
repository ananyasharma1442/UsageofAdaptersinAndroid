package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.viewpager);
        MainAdapter mainadapter = new MainAdapter(getSupportFragmentManager(),getLifecycle());

        viewPager2.setAdapter(mainadapter);

    }
}