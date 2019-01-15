package uk.ac.city.remolab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookEq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_eq);
    }

    public void next(View v) {
        Intent goToInstructions = new Intent();
        goToInstructions.setClass(this, Instructions.class);
        startActivity(goToInstructions);
        //finish();
    }
}
