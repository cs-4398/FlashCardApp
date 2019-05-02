package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class firstFlashcard extends AppCompatActivity {

    EditText cardFront;
    EditText cardBack;
    TextView cardCount;
    String front, back;

    Button NextCardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeflashcard);
        cardFront = (EditText) findViewById(R.id.cardFront);
        cardBack = (EditText) findViewById(R.id.cardBack);
        cardCount = (TextView) findViewById(R.id.cardCount);

        Intent intent = getIntent();
        final int numCards = intent.getIntExtra(NewSetClicked.NUMCARDS, 0);
        String deckName = intent.getStringExtra(NewSetClicked.NAME);
        final Deck currDeck = new Deck();
        currDeck.createDeck(numCards);
        Decks.pushDeck(deckName, currDeck);

        int i = 1;
        cardCount.setText("Card Number: " + i);
        NextCardButton = (Button) findViewById(R.id.NextCardbutton);
        NextCardButton.setOnClickListener(new View.OnClickListener() {
            int i = 1;

            @Override
            public void onClick(View v) {
                front = cardFront.getText().toString();
                back = cardBack.getText().toString();
                currDeck.popCard(i, front, back);
                i++;

                if (i > numCards) {
                    openNextActivity();
                }
                else {
                    cardFront.setText("");
                    cardBack.setText("");
                    cardCount.setText("Card Number: " + i);
                }

            }
        });
    }

    public void openNextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}