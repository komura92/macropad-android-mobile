package com.itninja.macropad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.itninja.macropad.app.fragments.DesktopFragment;
import com.itninja.macropad.app.fragments.GamingFragment;
import com.itninja.macropad.app.fragments.ProgrammingFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChipNavigationBar navBar = findViewById(R.id.navBar);

        navBar.setOnItemSelectedListener(id -> {
            switch (id) {
                case R.id.programming:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.tabContent, new ProgrammingFragment(), "ProgrammingFragment")
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.gaming:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.tabContent, new GamingFragment(), "GamingFragment")
                            .addToBackStack(null)
                            .commit();
                    break;
                default:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.tabContent, new DesktopFragment(), "DesktopFragment")
                            .addToBackStack(null)
                            .commit();
            }
        });
        navBar.setItemSelected(R.id.programming, true);
    }
}