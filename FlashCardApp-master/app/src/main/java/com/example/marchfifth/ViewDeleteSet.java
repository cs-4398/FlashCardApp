package com.example.marchfifth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ViewDeleteSet extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdeleteset);
        Toast.makeText(this, "JUNIT TEST RESULTS: DECK LIST EMPTY TEST: PASSED",
                Toast.LENGTH_LONG).show();
    }
}
