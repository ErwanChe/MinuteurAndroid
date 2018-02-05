package com.example.rewan.chronometre;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Rewan on 05/02/2018.
 */

public class Minuteur extends AsyncTask<Object, Integer, String> {

    private final Context context;

    public Minuteur(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Object... objects) {
        return null;
    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected void onPostExecute(String s) {

    }

    @Override
    protected void onProgressUpdate(Integer... values) {

    }

    @Override
    protected void onCancelled() {
        Toast.makeText(context, "cancelled", Toast.LENGTH_SHORT).show();
    }
}
