package uk.ac.city.remolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }

    public void next(View v) {
        Intent goToSelectLab = new Intent();
        goToSelectLab.setClass(this, SelectLab.class);
        startActivity(goToSelectLab);
        //finish();
    }
}
