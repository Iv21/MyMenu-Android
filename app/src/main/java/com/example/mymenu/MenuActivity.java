package com.example.mymenu;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mymenu.ui.menu.MenuFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        BottomNavigationView navView = findViewById(R.id.nav_view);


        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch ((menuItem.getItemId())) {
                    case R.id.navigation_drinks:
                        showMenu("drinks");
                        return true;

                    case R.id.navigation_food:
                        showMenu("food");
                        return true;
                }
                return false;
            }
        });

        navView.setSelectedItemId(R.id.navigation_drinks);
    }

    private void showMenu(String menuType) {

        Bundle arg = new Bundle();
        arg.putString("menu", menuType);

        Fragment menuFragment = new MenuFragment();
        menuFragment.setArguments(arg);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, menuFragment)
                .commit();
    }

}