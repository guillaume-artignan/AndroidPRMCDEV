package com.example.applicationcdev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AvisAdapter extends ArrayAdapter<Avis> {

    public AvisAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(this.getContext()).inflate(R.layout.avis_item,null);
        TextView tv1 = v.findViewById(R.id.avis_titre);
        TextView tv2 = v.findViewById(R.id.avis_mail);
        TextView tv3 = v.findViewById(R.id.avis_description);
        TextView tv4 = v.findViewById(R.id.avis_note);
        Avis a = this.getItem(position);

        tv1.setText(a.getTitle());
        tv2.setText(a.getMail());
        tv3.setText(a.getDescription());
        tv4.setText(a.getNbStars()==null ? "-" : a.getNbStars().toString());
        if (a.getNbStars()!=null) {
            if (a.getNbStars() < 2.0) tv4.setBackgroundResource(R.color.avisError);
            else if (a.getNbStars() <= 3.0) tv4.setBackgroundResource(R.color.avisWarning);
            else tv4.setBackgroundResource(R.color.avisSuccess);
        }
        return v;
    }
}
