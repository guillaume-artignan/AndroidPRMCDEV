package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PlatsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.plats_liste);

       /* HashMap<String,Object> d1 = new HashMap<String,Object>();
        d1.put("nom", "Panacotta au Gingembre");
        d1.put("prix","4.5");

        HashMap<String,Object> d2 = new HashMap<String,Object>();
        d2.put("nom", "Crevette à l'ananas");
        d2.put("prix","15");

        HashMap<String,Object> d3 = new HashMap<String,Object>();
        d3.put("nom", "Poulet saveur d'asie");
        d3.put("prix","12");

        HashMap<String,Object> d4 = new HashMap<String,Object>();
        d4.put("nom", "Porc au caramel");
        d4.put("prix","12");

        HashMap<String,Object> d5 = new HashMap<String,Object>();
        d5.put("nom", "A définir");
        d5.put("prix","11");

        List<HashMap<String,Object>> data= Arrays.asList(d1,d2,d3,d4,d5);
        SimpleAdapter simple = new SimpleAdapter(this,data,R.layout.item_plat,new String[]{"nom","prix"}, new int[]{R.id.nom_plat, R.id.prix_plat});
        liste.setAdapter(simple);*/

        Plat p1 = new Plat("Panacotta au Gingembre",4.5,"plat1","Exemple de description Panacotta");
        Plat p2 = new Plat("Porc au caramel",12.0,"plat2","Exemple de description Panacotta");
        Plat p3 = new Plat("Crevette Ananas",18.0,"plat3","Exemple de description Panacotta");
        Plat p4 = new Plat("Poulet aux épices",15.5,"plat4","Exemple de description Panacotta");
        Plat p5 = new Plat("Inconnu 1",2.5,"plat5","Exemple de description Panacotta");
        Plat p6 = new Plat("Inconnu 2",11.0,"plat6","Exemple de description Panacotta");
        Plat p7 = new Plat("Inconnu 3",12.5,"plat7","Exemple de description Panacotta");


        PlatsAdapter adapter = new PlatsAdapter(this,R.layout.item_plat);
        adapter.addAll(p1,p2,p3,p4,p5,p6,p7);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this,DescriptionPlatActivity.class);

        PlatsAdapter adapter = (PlatsAdapter) parent.getAdapter();
        Plat p = adapter.getItem(position);
        i.putExtra("plat",p);
        startActivity(i);
    }

}
