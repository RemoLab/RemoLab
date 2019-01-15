package uk.ac.city.remolab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RemoLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remo_lab);
    }

    public void next(View v) {
        Intent goToBooking = new Intent();
        goToBooking.setClass(this, Booking.class);
        startActivity(goToBooking);
        //finish();
    }
}
