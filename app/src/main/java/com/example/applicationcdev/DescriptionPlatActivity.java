package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DescriptionPlatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_plat);
        Plat p = (Plat) this.getIntent().getSerializableExtra("plat");

        TextView  tvTitre = findViewById(R.id.detail_plat_titre);
        TextView  tvDescr = findViewById(R.id.detail_plat_description);
        ImageView imImage = findViewById(R.id.detail_plat_image);

        tvTitre.setText(p.getNom());
        tvDescr.setText(p.getDescription());
        imImage.setImageResource(getDrawableRessourceID(p.getImage()));


    }

    private int getDrawableRessourceID(String name) {
        //nameResourceID = R.drawable.[name]
        int nameResourceID = this.getResources().getIdentifier(name, "drawable", this.getApplicationInfo().packageName);
        return nameResourceID;
    }
}
