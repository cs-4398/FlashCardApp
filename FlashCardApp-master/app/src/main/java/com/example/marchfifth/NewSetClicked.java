package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class NewSetClicked extends AppCompatActivity {
    public static final String NUMCARDS = "com.example.marchfifth.NUMCARDS";
    public static final String NAME = "com.example.marchfifth.NAME";

    EditText setName;
    EditText numberCards;

    String name;
    int numCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);

        setName = (EditText) findViewById(R.id.setName);
        numberCards = (EditText) findViewById(R.id.numberCards);
    }

    public void clicked (View v){
        name = setName.getText().toString();
        numCards = Integer.valueOf(numberCards.getText().toString());
        openNextActivity();
    }


    public void openNextActivity(){
        Intent intent = new Intent(this, firstFlashcard.class);
        intent.putExtra(NUMCARDS, numCards);
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}