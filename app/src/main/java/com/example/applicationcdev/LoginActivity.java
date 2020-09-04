package com.example.applicationcdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void seConnecter(View v){
        EditText eLogin = findViewById(R.id.login_id);
        EditText ePassword = findViewById(R.id.login_password);

        if ("g".equals(eLogin.getText().toString()) && "p".equals(ePassword.getText().toString())) {
            Intent i = new Intent(this, MainActivity.class);


            startActivity(i);
        }else {
            Toast.makeText(this,"Mauvais login et ou mot de passe",Toast.LENGTH_LONG).show();
            Snackbar.make(v, "Mauvais login et ou mot de passe", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }



    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ETAT","ON RESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ETAT","ON START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ETAT","ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ETAT","ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ETAT","ON DESTROY");
    }
}
