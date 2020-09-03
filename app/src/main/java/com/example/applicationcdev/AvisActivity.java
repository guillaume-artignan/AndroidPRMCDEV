package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AvisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avis);

        AvisDownloadTask dlTask = new AvisDownloadTask(this);
        dlTask.execute("https://formation-pro.eu:8080/avis");

    }

    public void avisDownloaded(Avis[] avis){
        
    }
}
