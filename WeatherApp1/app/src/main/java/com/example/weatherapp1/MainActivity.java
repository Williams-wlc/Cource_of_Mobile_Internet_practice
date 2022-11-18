package com.example.weatherapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weatherapp1.util.CityTest;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LitePal.getDatabase();

        CityTest.queryProvince();
        CityTest.queryCity(28);
        CityTest.queryCounty(28,267);

    }
}