package com.example.app_alerta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    Para crear el splash screen se ha seguido la guía de:
    https://www.bignerdranch.com/blog/splash-screens-the-right-way/
     */

    //TODO: Creacion del login con Firebase.
    /*
    App conectada a Firebase a través del tutorial de su página.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
