package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void topClick(View v){
        openNewSetActivity();
    }
    public void openNewSetActivity(){
        Intent intent = new Intent(this, NewSetClicked.class);
        startActivity(intent);
    }
    public void bottomClick(View v){
        openViewSetActivity();
    }
    public void openViewSetActivity(){
        Intent intent = new Intent(this, ViewDeleteSet.class);
        startActivity(intent);
    }


}
