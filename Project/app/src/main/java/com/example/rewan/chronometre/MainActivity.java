package com.example.rewan.chronometre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText minute_text;
    private EditText seconde_text;
    private Button button_start;
    private TextView arret,minuteur;
    private Minuteur minuteur_class = null;

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
        button_start.setOnClickListener(this);

        /*button_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    String var = minute_text.getText().toString();
                    int progress = Integer.parseInt(var);
                    while(progress != 0) {
                        minuteur.setText(String.valueOf(progress));
                        Thread.sleep(1000);
                        progress --;
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        minuteur_class = new Minuteur(this);
        minuteur_class.execute();
    }

}
