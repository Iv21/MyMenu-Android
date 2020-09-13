package com.example.mymenu.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymenu.R;
import com.example.mymenu.ui.menu.adapter.OnMenuItemClickListener;
import com.example.mymenu.ui.menu.adapter.Product;
import com.example.mymenu.ui.menu.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment implements OnMenuItemClickListener {

    List<Product> coffeeList = new ArrayList<>();

    void loadMenuDrinks() {
        coffeeList.add(new Product("Espresso", R.drawable.esp));
        coffeeList.add(new Product("Large Macchiato", R.drawable.esp));
        coffeeList.add(new Product("Small Macchiato", R.drawable.esp));
        coffeeList.add(new Product("Espresso", R.drawable.esp));
        coffeeList.add(new Product("Cappuccino", R.drawable.esp));
        coffeeList.add(new Product("Nescafe", R.drawable.esp));
        coffeeList.add(new Product("Fredo Espresso", R.drawable.esp));
        coffeeList.add(new Product("Fredo Cappuccino", R.drawable.esp));
        coffeeList.add(new Product("Latte", R.drawable.esp));
        coffeeList.add(new Product("Irish", R.drawable.irish));


    }

    void loadMenuFood() {
        coffeeList.add(new Product("Espresso", R.drawable.esp));
        coffeeList.add(new Product("Large Macchiato", R.drawable.esp));
        coffeeList.add(new Product("Small Macchiato", R.drawable.esp));
        coffeeList.add(new Product("Espresso", R.drawable.esp));
        coffeeList.add(new Product("Cappuccino", R.drawable.esp));
        coffeeList.add(new Product("Nescafe", R.drawable.esp));
        coffeeList.add(new Product("Fredo Espresso", R.drawable.esp));
        coffeeList.add(new Product("Fredo Cappuccino", R.drawable.esp));
        coffeeList.add(new Product("Latte", R.drawable.esp));
        coffeeList.add(new Product("Irish", R.drawable.irish));


    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String menuType = getArguments().getString("menu", "drinks");
        if(menuType == "drinks") {
            loadMenuDrinks();
        } else {
            loadMenuFood();
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, coffeeList);
        //       recyclerAdapter = new RecyclerAdapter(prices);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


        return root;
    }

    @Override
    public void onMenuItemClick(Product product) {
        //TODO: requireContext().startActivity(...)
    }
}