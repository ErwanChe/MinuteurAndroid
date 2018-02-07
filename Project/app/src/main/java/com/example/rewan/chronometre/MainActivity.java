package com.example.rewan.chronometre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_start;
    private TextView minuteur;
    private Minuteur minuteur_class = null;
    private NumberPicker seconde_picker,minute_picker;

    private void bindViews() {
        button_start = findViewById(R.id.button_start);
        minuteur = findViewById(R.id.minuteur);
        seconde_picker = findViewById(R.id.secondePicker);
        seconde_picker.setMaxValue(59);
        seconde_picker.setMinValue(0);
        minute_picker = findViewById(R.id.minutePicker);
        minute_picker.setMaxValue(59);
        minute_picker.setMinValue(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        button_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int seconde = seconde_picker.getValue();
        int minute = minute_picker.getValue();
        if (minuteur_class != null){
            minuteur_class.cancel(true);
            minuteur_class = null;
            button_start.setText("Start");
        } else {
            minuteur_class = new Minuteur(this, minute,seconde,minuteur,minute_picker, seconde_picker,button_start);
            minuteur_class.execute();
            button_start.setText("Cancel");
        }
    }

}
