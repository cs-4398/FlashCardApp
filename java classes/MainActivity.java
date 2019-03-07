package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Can you see me", Toast.LENGTH_SHORT).show();
        Log.i("info", "Done creating the app");
    }
    public void topClick(View v){
        Toast.makeText(this, "New set button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info", "User clicked the top button");
        openNewSetActivity();
    }
    public void openNewSetActivity(){
        Intent intent = new Intent(this, NewSetClicked.class);
        startActivity(intent);
    }
    public void bottomClick(View v){
        Toast.makeText(this, "View / Delete button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info", "User clicked the bottom button");
        openViewSetActivity();
    }
    public void openViewSetActivity(){
        Intent intent = new Intent(this, ViewDeleteSet.class);
        startActivity(intent);
    }


}
