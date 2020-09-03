package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DescriptionPlatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_plat);
        Plat p = (Plat) this.getIntent().getSerializableExtra("plat");
        Toast.makeText(this,p.getNom(),Toast.LENGTH_SHORT).show();
    }
}
