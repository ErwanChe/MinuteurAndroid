package com.example.rewan.chronometre;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rewan on 05/02/2018.
 */

public class Minuteur extends AsyncTask<Object, Integer, String> {

    private final Context context;
    private final String time;
    private final TextView minuteur;


    public Minuteur(Context context, String time, TextView minuteur) {
        this.context = context;
        this.time = time;
        this.minuteur = minuteur;
    }

    @Override
    protected String doInBackground(Object[] params) {
        int progress = Integer.parseInt(time);
        try {
            while(progress != 0) {
                publishProgress(progress);
                Thread.sleep(60000);
                progress --;
                publishProgress(progress);
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
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        minuteur.setText(String.valueOf(values[0]));
    }

    @Override
    protected void onCancelled() {
        Toast.makeText(context, "cancelled", Toast.LENGTH_SHORT).show();
    }
}
