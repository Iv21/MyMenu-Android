package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> coffeeList;
    //   List<String> prices;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        coffeeList = new ArrayList<>();
        //    prices = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(coffeeList);
        //       recyclerAdapter = new RecyclerAdapter(prices);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        coffeeList.add("Espresso");
        coffeeList.add("Large Macchiato");
        coffeeList.add("Small Macchiato");
        coffeeList.add("Nescafe");
        coffeeList.add("Decaf");
        coffeeList.add("Irish");
        coffeeList.add("Coca Cola");
        coffeeList.add("Pepsi");
        coffeeList.add("Skopsko");
        coffeeList.add(" Zlaten Dab");

        //prices.add("60");
        //  prices.add("80");
        //  prices.add("70");
        //  prices.add("90");
        //  prices.add("70");
        //  prices.add("130");
        //  prices.add("70");
        //  prices.add("70");
        //   prices.add("100");
        //   prices.add("100");
    }

    //SEARCH
    //  @Override
    //  public boolean onCreateOptionsMenu(Menu menu){
    //      getMenuInflater().inflate(R.menu.main_menu, menu);
    //      getMenuInflater().inflate(R.menu.main_menu,menu);
    //      MenuItem item = menu.findItem(R.id.action_search);
    //      SearchView searchView = (SearchView) item.getActionView();
    //      searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
    //        @Override
    //          public boolean onQueryTextSubmit(String query) {
    //             return false;
    //         }

    //         @Override
    //        public boolean onQueryTextChange(String newText) {


    //              RecyclerAdapter getRecyclerAdapter() {
    //       recyclerAdapter.getFilter().filter(newText);
    //   }

    //                 return false;
    //           }
    //       });
    //      return super.onCreateOptionsMenu(menu);
    //   }
}
