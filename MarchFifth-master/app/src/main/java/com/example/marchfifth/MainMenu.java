package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        //Toast.makeText(this, "JUNIT TEST: APP CREATED SUCCESSFULLY", Toast.LENGTH_LONG).show();
        Log.i("info", "Done creating the app");
    }
    public void topClick(View v){
        Log.i("info", "TOP BUTTON CLICK TEST PASSED");
        //Toast.makeText(this, "JUNIT TEST RESULTS: TOP BUTTON CLICK TEST PASSED",
                //Toast.LENGTH_LONG).show();
        openNewSetActivity();
    }
    public void openNewSetActivity(){
        Intent intent = new Intent(this, NewSetClicked.class);
        startActivity(intent);
    }
    public void bottomClick(View v){
        Log.i("info", "BOTTOM BUTTON CLICK TEST PASSED");
        //Toast.makeText(this, "JUNIT TEST RESULTS: BOTTOM BUTTON CLICK TEST PASSED",
                //Toast.LENGTH_LONG).show();
        openViewSetActivity();
    }
    public void openViewSetActivity(){
        Intent intent = new Intent(this, ViewDeleteSet.class);
        startActivity(intent);
    }


}
