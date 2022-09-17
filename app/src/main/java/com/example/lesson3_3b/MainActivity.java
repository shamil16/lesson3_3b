package com.example.lesson3_3b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> colors=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Gray");
        colors.add("White");
        colors.add("Dark_Gray");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Gold");
        colors.add("Olive");
        colors.add("Teal");
        colors.add("Lime");
        colors.add("Aqua");
        colors.add("Silver");
        colors.add("Azure");
        colors.add("Crimson");
        colors.add("Coral");
        colors.add("Navy");
        colors.add("Violet");
        colors.add("Bronze");
        ColorAdapter adapter = new ColorAdapter();
        adapter.setColorList(colors);
        recyclerView.setAdapter(adapter);
    }
}
