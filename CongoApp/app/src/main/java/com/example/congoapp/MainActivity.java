package com.example.congoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void congo(View view) {
        Toast.makeText(this, "Congratulations!! You have passed Successfully!", Toast.LENGTH_LONG).show();
    }

    public void sorry(View view) {
        Toast.makeText(this, "Sorry!! You have to try Again!", Toast.LENGTH_SHORT).show();
    }
}
