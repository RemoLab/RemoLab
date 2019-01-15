package uk.ac.city.remolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Eq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eq);
    }

    public void next(View v) {
        Intent goToBookEq = new Intent();
        goToBookEq.setClass(this, BookEq.class);
        startActivity(goToBookEq);
        //finish();
    }
}
