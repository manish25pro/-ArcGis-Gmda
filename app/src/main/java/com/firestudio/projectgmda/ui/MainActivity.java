package com.firestudio.projectgmda.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.esri.arcgisruntime.mapping.view.MapView;
import com.firestudio.projectgmda.R;

public class MainActivity extends AppCompatActivity {
    MapView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void mapButton(View view) {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }

    public void fetchButton(View view) {
        Intent intent = new Intent(MainActivity.this, FetchLayerActivity.class);
        startActivity(intent);

    }
}