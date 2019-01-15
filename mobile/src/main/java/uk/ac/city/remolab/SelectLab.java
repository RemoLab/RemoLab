package uk.ac.city.remolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lab);
    }

    public void next(View v) {
        Intent goToEqCat = new Intent();
        goToEqCat.setClass(this, EqCat.class);
        startActivity(goToEqCat);
        //finish();
    }
}
