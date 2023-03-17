package com.ahmfarisi.aplikasiagenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fabTambah;
    private RecyclerView rvAgenda;
    private MyDatabaseHelper myDB;
    private AdapterAgenda adAgenda;
    private ArrayList<String> arrTanggal, arrJam, arrKegiatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabTambah = findViewById(R.id.fab_tambah);
        rvAgenda = findViewById(R.id.rv_agenda);

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TambahActivity.class));
            }
        });

        myDB = new MyDatabaseHelper(MainActivity.this);
        arrTanggal = new ArrayList<>();
        arrJam = new ArrayList<>();
        arrKegiatan = new ArrayList<>();
    }

    private void SQLitetoArrayList(){

    }

    private void tampilAgenda(){

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}