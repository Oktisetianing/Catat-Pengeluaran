package com.example.catatpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvnama, tvnohp, tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvnama = findViewById(R.id.tvnama);
        tvnohp = findViewById(R.id.tvnohp);
        tvStatus = findViewById(R.id.tvStatus);

        ContacModel element = (ContacModel) getIntent().getSerializableExtra("ContacModel");
        tvnama.setText(element.getNama());
        tvnama.setTextColor(Color.parseColor(element.getColor()));
        tvnohp.setText(element.getHp());
        tvStatus.setText(element.getStatus());
    }
}