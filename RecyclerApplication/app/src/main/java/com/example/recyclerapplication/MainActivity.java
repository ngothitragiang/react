package com.example.recyclerapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber = findViewById(R.id.recycler_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));
        final List<String> datal = new ArrayList<>();

        for (int i = 0; i <10; i++){
            datal.add("lan");
            datal.add("hoa");
            datal.add("hoe");

        }
        final NumberAdapter adapter = new NumberAdapter();
        adapter.data = datal;
        rvNumber,setAdapter(adapter);
        findViewById(R.id.button_add).setOnClickListener();
        NumberAdapter adapter = new NumberAdapter();
        rvNumber.setAdapter(adapter);


    }
}
