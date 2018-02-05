package com.example.rewan.chronometre;

import android.content.Context;
import android.os.AsyncTask;

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
}
