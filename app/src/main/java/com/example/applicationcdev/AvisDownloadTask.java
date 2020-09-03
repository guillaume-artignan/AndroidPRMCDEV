package com.example.applicationcdev;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AvisDownloadTask extends AsyncTask<String,Integer,Avis[]> {

    private final AvisActivity activity;

    public AvisDownloadTask(AvisActivity activity){
        this.activity = activity;
    }

    @Override
    protected Avis[] doInBackground(String... urls) {
        Gson gson = new Gson();
        try {
            URL u = new URL(urls[0]);
            InputStream ins = u.openConnection().getInputStream();
            Avis[] avis = gson.fromJson(new InputStreamReader(ins),Avis[].class);
            return avis;
        } catch (MalformedURLException e) {
            Log.e("DOWNLOAD","URL",e);
        } catch (IOException e) {
            Log.e("IOEXCEPTION","URL",e);
        }
        return new Avis[0];

    }

    @Override
    protected void onPostExecute(Avis[] avis) {
       this.activity.avisDownloaded(avis);
    }
}
