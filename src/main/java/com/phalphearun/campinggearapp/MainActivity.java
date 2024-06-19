package com.phalphearun.campinggearapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Product> productList;

    private RecyclerView productRecyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productRecyclerView = findViewById(R.id.productRecyclerView);
        productRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        productAdapter = new ProductAdapter(getProductList());
        productRecyclerView.setAdapter(productAdapter);


        FloatingActionButton fabChat = findViewById(R.id.fabChat);
        fabChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                ContactDialogFragment contactDialogFragment = new ContactDialogFragment();
                contactDialogFragment.show(fragmentManager, "contact_dialog");
            }
        });
    }

        private List<Product> getProductList() {
            // Sample data, replace with actual data source
            List<Product> products = new ArrayList<>();
            products.add(new Product("Tent", "$99.99", R.drawable.tent));
            products.add(new Product("Sleeping Bag", "$49.99", R.drawable.sleeping_bag));
            products.add(new Product("Backpack", "$79.99", R.drawable.backpack));
            products.add(new Product("Water Bottle", "$79.99", R.drawable.water_bottle));
            products.add(new Product("Hiking Boots", "$79.99", R.drawable.hiking_boots));
            products.add(new Product("Camping Chair", "$79.99", R.drawable.camping_chair));
            products.add(new Product("Flashlight or Headlamp", "$79.99", R.drawable.flashlight));
            products.add(new Product("Camping Stove and Fuel", "$79.99", R.drawable.stove));
            products.add(new Product("Cookware and Utensils", "$79.99", R.drawable.cook));
            products.add(new Product("Portable Chair", "$79.99", R.drawable.portable));
            // Add more products as needed
            return products;
        }
    }
