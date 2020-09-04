package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FragmentSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_sample);
    }

    public void changeFragment(View v){
        Toast.makeText(this, "CHANGE", Toast.LENGTH_SHORT).show();
        SecondFragment fragment = new SecondFragment();
        getSupportFragmentManager()
                 .beginTransaction()
                .replace(R.id.sample_fragment,fragment)
                .addToBackStack(null)
                .commit();
    }
}
