package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class NewSetClicked extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);


    }
    public void nextClick(View v){
        Toast.makeText(this, "View / Delete button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info", "User clicked the bottom button");
        openNextActivity();
    }
    public void openNextActivity(){
        Intent intent = new Intent(this, firstFlashcard.class);
        startActivity(intent);
    }
}
