package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class NewSetClicked extends AppCompatActivity {
    EditText setName;
    EditText numCards;
    flashCard deckList;
    String deckNames[];
    String deckName;
    int numberOfCards;
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);
        setName = (EditText) FindViewById(R.id.setName);
        numCards = (EditText) FindViewById(R.id.numCards);
        deckName = setName;
        numvberOfCards = numCards;
        createNewDeck(deckName, numberofCards);
    }
    public void createNewDeck(String deckName, int numberOfCards) {
        Decks deck = new Deck();
        deck.createDeck(deckName, numberOfCards);
        deckList.add(deck);
        deckNames.add(deckName);
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
