package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MahasiswaViewModel mahasiswaViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Nama = findViewById(R.id.txt_nama);
        EditText Nim = findViewById(R.id.txt_nim);
        EditText Angkatan = findViewById(R.id.txt_angkatan);
        TextView nama1 = findViewById(R.id.view_nama);
        TextView nim1 = findViewById(R.id.view_nim);
        TextView angkatan1 = findViewById(R.id.view_angkatan);
        Button insert = findViewById(R.id.btn_insert);

        mahasiswaViewModel = new ViewModelProvider(this).get(MahasiswaViewModel.class);
        mahasiswaViewModel.getNama().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                nama1.setText(s);
            }
        });
        mahasiswaViewModel.getNim().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                nim1.setText(s);
            }
        });
        mahasiswaViewModel.getAngkatan().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                angkatan1.setText(s);
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahasiswaViewModel.getNama().setValue(Nama.getText().toString());
                mahasiswaViewModel.getNim().setValue(Nim.getText().toString());
                mahasiswaViewModel.getAngkatan().setValue(Angkatan.getText().toString());
            }
        });

    }


}