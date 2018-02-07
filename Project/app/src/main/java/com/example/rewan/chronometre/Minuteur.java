package com.example.rewan.chronometre;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rewan on 05/02/2018.
 */

public class Minuteur extends AsyncTask<Object, Integer, String> {

    private final Context context;
    private final int time_sec,time_min;
    private final TextView minuteur;
    private final NumberPicker minute_picker,seconde_picker;
    private final Button button_start;


    public Minuteur(Context context, int time_min , int time_sec, TextView minuteur, NumberPicker minute_picker,NumberPicker seconde_picker, Button button_start) {
        this.context = context;
        this.time_min = time_min;
        this.time_sec = time_sec;
        this.minuteur = minuteur;
        this.minute_picker = minute_picker;
        this.seconde_picker = seconde_picker;
        this.button_start = button_start;
    }

    @Override
    protected String doInBackground(Object[] params) {
        int progress_sec = time_sec;
        int progress_min = time_min;

        if (progress_min != 0){
            progress_sec = (progress_sec*progress_min)+60;
        }
        try {
            while (progress_sec != 0) {
                publishProgress(progress_sec);
                Thread.sleep(1000);
                progress_sec--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "terminé";
    }

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected void onPostExecute(String s) {
        minuteur.setText(String.valueOf(0));
        minute_picker.setValue(0);
        button_start.setText("Start");
        Toast.makeText(context, "DRING..DRING..", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        minuteur.setText(String.valueOf(values[0]));
        minute_picker.setValue(values[0]);
    }

    @Override
    protected void onCancelled() {
        Toast.makeText(context, "cancelled", Toast.LENGTH_SHORT).show();
    }
}
