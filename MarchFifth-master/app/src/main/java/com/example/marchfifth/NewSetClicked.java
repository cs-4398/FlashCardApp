package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewSetClicked extends AppCompatActivity {
    public static final String NUMCARDS = "com.example.marchfifth.NUMCARDS";

    EditText setName;
    EditText numberCards;
    Button nextButton;

    String name;
    int numCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);

        setName = (EditText) findViewById(R.id.setName);
        numberCards = (EditText) findViewById(R.id.numberCards);

        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = setName.getText().toString();
                numCards = Integer.valueOf(numberCards.getText().toString());
                openNextActivity();
            }
        });

    }
    public void openNextActivity(){
        Intent intent = new Intent(this, firstFlashcard.class);
        intent.putExtra(NUMCARDS, numCards);
        startActivity(intent);
    }
}