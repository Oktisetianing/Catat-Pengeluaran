package com.example.catatpengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView tvnamavalue , tvjumlahvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvnamavalue = findViewById(R.id.tvnamavalue);
        tvjumlahvalue = findViewById(R.id.tvjumlahvalue);

        Bundle bundle = getIntent().getExtras();
        tvnamavalue.setText(bundle.getString("keyNama"));
        tvjumlahvalue.setText(bundle.getString("keyJumlah"));
    }
}