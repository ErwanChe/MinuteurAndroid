package com.example.rewan.chronometre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText minute_text;
    private EditText seconde_text;
    private Button button_start;
    private TextView arret,minuteur;

    private void bindViews() {
        button_start = findViewById(R.id.button_start);
        minute_text = findViewById(R.id.minute);
        seconde_text = findViewById(R.id.seconde);
        arret = findViewById(R.id.arret);
        minuteur = findViewById(R.id.minuteur);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();

        button_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arret.setText("lol");
        }
        });
    }

}
