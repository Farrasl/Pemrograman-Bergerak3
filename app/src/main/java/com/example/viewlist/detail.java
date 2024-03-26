package com.example.viewlist;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int imageResId = getIntent().getIntExtra("image", 0);
        String nama = getIntent().getStringExtra("nama");
        String nim = getIntent().getStringExtra("nim");
        String kelas = getIntent().getStringExtra("kelas");
        String jeniskelamin = getIntent().getStringExtra("jeniskelamin");

        ImageView imageView = findViewById(R.id.imageview);
        TextView namaTextView = findViewById(R.id.name);
        TextView nimTextView = findViewById(R.id.nim);
        TextView kelasTextView = findViewById(R.id.detail_kelas);
        TextView jeniskelaminTextView = findViewById(R.id.detail_jeniskelamin);

        imageView.setImageResource(imageResId);
        namaTextView.setText( nama);
        nimTextView.setText( nim);
        kelasTextView.setText("Kelas: " + kelas);
        jeniskelaminTextView.setText("Jenis Kelamin: " + jeniskelamin);
    }

}