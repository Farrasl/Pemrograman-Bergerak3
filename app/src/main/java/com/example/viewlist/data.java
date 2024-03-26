package com.example.viewlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class data extends AppCompatActivity implements MyAdapter.ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> data = new ArrayList<Item>();
        data.add(new Item("Nama: Abmi Sukma Edri","Nim: 12250120341","A","Perempuan",R.drawable.amiii));
        data.add(new Item("Nama: Ahmad Kurniawan","Nim: 12250111514", "A", "Laki-Laki",R.drawable.ahmed));
        data.add(new Item("Nama: Aufa Hajati","Nim: 12250120338","A","Perempuan",R.drawable.aufa));
        data.add(new Item("Nama: Daffa Finanda","Nim: 12250111603"," A","Laki-Laki",R.drawable.dapin));
        data.add(new Item("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979","A","Laki-Laki",R.drawable.dafuq));
        data.add(new Item("Nama: Dwi Jelita Adhliyah","Nim: 12250120331","A","Perempuan",R.drawable.jelita));
        data.add(new Item("Nama: Dwi Mahdini","Nim: 12250111298","A","Laki-Laki",R.drawable.dwik));
        data.add(new Item("Nama: Fajri","Nim: 1225011082","A","Laki-Laki",R.drawable.fajri));
        data.add(new Item("Nama: Fakhri","Nim: 12250111381","A","Laki-Laki",R.drawable.fakhri));
        data.add(new Item("Nama: Farras Lathief","Nim: 12250111328","A","Laki-Laki",R.drawable.farras));
        data.add(new Item("Nama: Gilang Ramadhan Indra","Nim: 12250111323","A","Laki-Laki",R.drawable.gilang));
        data.add(new Item("Nama: Hafidz Alhadid Rahman","Nim: 12250111794","A","Laki-Laki",R.drawable.hafidz));
        data.add(new Item("Nama: Haritsah Naufaldy","Nim: 12250110361","A","Laki-Laki",R.drawable.aldy));
        data.add(new Item("Nama: M. Nabil Dawami","Nim: 12250111527","A","Laki-Laki",R.drawable.nabil));
        data.add(new Item("Nama: M. Zaki Erbay Syas","Nim: 12250111134","A","Laki-Laki",R.drawable.zaki));
        data.add(new Item("Nama: Muhammad Aditya Rinaldi","Nim: 12250111048","A","Laki-Laki",R.drawable.adit));
        data.add(new Item("Nama: Muhammad Dhimas Hadid","Nim: 12250111231","A","Laki-Laki",R.drawable.dimas));
        data.add(new Item("Nama: Muhammad Faruq","Nim: 12250111791","A","Laki-Laki",R.drawable.faruqhz));
        data.add(new Item("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489","A","Laki-Laki",R.drawable.rafly));
        data.add(new Item("Nama: Nurika Dwi Wahyuni","Nim: 12250120360","A","Perempuan",R.drawable.nurika));
        data.add(new Item("Nama: Ogya Secio Noegroho.s","Nim: 12250111346","A","Laki-Laki",R.drawable.ogi));
        data.add(new Item("Nama: Rahma Laksita","Nim:12250124357","A","Perempuan",R.drawable.rahma));
        data.add(new Item("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759","A","Laki-Laki",R.drawable.surya));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), data, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
        @Override
        public void onItemClick(Item item) {
            Intent intent = new Intent(this, detail.class);
            intent.putExtra("image", item.getImage());
            intent.putExtra("nama", item.getName());
            intent.putExtra("nim", item.getNim());
            intent.putExtra("kelas", item.getKelas());
            intent.putExtra("jeniskelamin", item.getJeniskelamin());
            startActivity(intent);
        }

    }

