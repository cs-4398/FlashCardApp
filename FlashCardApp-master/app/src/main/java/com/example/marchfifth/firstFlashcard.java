package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
* firstFlashCard is the class associated with the view needed to obtain
* values for the front (answer) and back (solution) for each flash card 
* in the deck being created
* 
* @author Nash Bateman and Laura Doan
* 
*/


public class firstFlashcard extends AppCompatActivity {
    
    /**
    * cardFront and cardBack are the editText views used to obtain the front and back
    * values for each flash card
    * front and back are strings that hold these values inserted into the editText views
    */
    EditText cardFront;
    EditText cardBack;
    TextView cardCount;
    String front, back;
    
    /**
    * NextCardButton submits the given information and switches to the next card to be created
    */
    Button NextCardButton;
     /**
    * onCreate method called when app is created, sets content view and EditText 
    * variables for user input and creates intent to pass given variables and set new content views
    * @param Bundle savedInstanceState saved instance state of app in current condition
    * @return nothing
    * @since 1.0
    */
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
            /**
            * onClick method called when button is pressed, on click listener
            * when pressed, front (question) and back (solution) values for card submitted and card is added to list of cards (deck)
            * @param View.OnClickListener
            * @return nothing
            * @since 1.0
            */
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
    /**
    * openNextActivity method passes intent to new activity and sets new content view
    * @param none
    * @return none
    * @since 1.0
    */
    public void openNextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
