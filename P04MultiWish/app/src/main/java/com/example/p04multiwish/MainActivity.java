package com.example.p04multiwish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(),"Happy New Year!!",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"Happy Birthday Dear!!",Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"Happy Anniversary!!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
