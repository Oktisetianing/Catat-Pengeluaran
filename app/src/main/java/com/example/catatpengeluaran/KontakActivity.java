package com.example.catatpengeluaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class KontakActivity extends AppCompatActivity {

    List<ContacModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
    }

    private void addData(){
        elements = new ArrayList<>();
        elements.add(new ContacModel("Okti","086532149652", "Available", "#9565E8"));
        elements.add(new ContacModel("Safi","086532149652", "Not Available", "#734CB8"));
        elements.add(new ContacModel("Rionzy","086532149652", "Available", "#7334E3"));
        elements.add(new ContacModel("Faishal","086532149652", "Available", "#917BBA"));
        elements.add(new ContacModel("Zein","086532149652", "Available", "#390D8A"));
        elements.add(new ContacModel("Wisnu","086532149652", "Available", "#4C3E65"));
        elements.add(new ContacModel("Riska","086532149652", "Available", "#9C6DF1"));
        elements.add(new ContacModel("Yuyun","086532149652", "Available", "#765DA3"));
        elements.add(new ContacModel("Disa","086532149652", "Available", "#B59DDF"));

        KontakAdapter adapter = new KontakAdapter(elements, this, new KontakAdapter.OnItemClickListener() {
            @Override
                public void onItemClick(ContacModel item) {
                detail();
            }

        });
        RecyclerView recyclerView = findViewById(R.id.rvKontak);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private void detail() {
        Intent intent = new Intent(KontakActivity.this, DetailActivity.class);
        boolean item;
        intent.putExtra("ContacModel", item);
        startActivities(new Intent[]{intent});
    }

}