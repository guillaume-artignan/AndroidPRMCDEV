package com.example.applicationcdev;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PlatsAdapter extends ArrayAdapter<Plat> {

    public PlatsAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Plat p = this.getItem(position);

        View v = LayoutInflater.from(this.getContext()).inflate(R.layout.item_plat2,null);
        TextView tvNom = v.findViewById(R.id.item_plat_nom);
        TextView tvPrix = v.findViewById(R.id.item_plat_prix);
        ImageView imPlat = v.findViewById(R.id.item_plat_image);
        tvNom.setText(p.getNom());
        tvPrix.setText(""+p.getPrix());

        String imagePlat = p.getImage();
        imPlat.setImageResource(getDrawableRessourceID(imagePlat));

        /*LinearLayout l = new LinearLayout(this.getContext());

        Button but1 = new Button(this.getContext());
        but1.setText(p.getNom());

        Button but2 = new Button(this.getContext());
        but2.setText(""+p.getPrix());

        l.addView(but1);
        l.addView(but2);*/

        return v;
    }

    private int getDrawableRessourceID(String name) {
        //nameResourceID = R.drawable.[name]
        int nameResourceID = this.getContext().getResources().getIdentifier(name, "drawable", this.getContext().getApplicationInfo().packageName);
        return nameResourceID;
    }
}
