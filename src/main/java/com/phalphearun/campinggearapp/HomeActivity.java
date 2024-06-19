package com.phalphearun.campinggearapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView productRecyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productRecyclerView = findViewById(R.id.productRecyclerView);
        productRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        productAdapter = new ProductAdapter(getProductList());
        productRecyclerView.setAdapter(productAdapter);
    }

    private List<Product> getProductList() {
        // Sample data, replace with actual data source
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tent", "$99.99", R.drawable.tent));
        products.add(new Product("Sleeping Bag", "$49.99", R.drawable.sleeping_bag));
        products.add(new Product("Backpack", "$79.99", R.drawable.backpack));
        // Add more products as needed
        return products;
    }
}

