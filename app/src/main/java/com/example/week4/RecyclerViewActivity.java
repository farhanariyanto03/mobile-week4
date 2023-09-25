package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.week4.adapter.MahasiswaAdapter;
import com.example.week4.models.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        getSupportActionBar().setTitle("Recycle View");

        addData();

        recyclerView = findViewById(R.id.recyler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Lutfi Hakim", "E41221867", "081334394400"));
        mahasiswaArrayList.add(new Mahasiswa("Rayasya Cahyana", "E41221737", "081337787765"));
        mahasiswaArrayList.add(new Mahasiswa("Farhan Ariyanto", "E41221598", "081098778472"));
        mahasiswaArrayList.add(new Mahasiswa("Nico Flassy", "E41221111", "081748938562"));
        mahasiswaArrayList.add(new Mahasiswa("Asyam Haidar", "E41220987", "082356746098"));
        mahasiswaArrayList.add(new Mahasiswa("Fachrudin Fahma", "E41226785", "081887667554"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad Muhyi", "E41221234", "085998667554"));
        mahasiswaArrayList.add(new Mahasiswa("Gilang Rizqi", "E41220987", "085667898743"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Bagas", "E4122232", "0856678923456"));
    }
}