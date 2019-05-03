package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
/**
* NewSetClicked is the class associated with the view to create a new set of 
* flashcards. This view will obtain user input for the amount of cards in the deck and the title
* 
* @author Nash Bateman
* 
*/

public class NewSetClicked extends AppCompatActivity {
     /**
    *NUMCARDS is the number of cards being created for the current deck
    * created as a static final in order to be accessed by other views and classes
    *NAME is the title of the deck being created for the current deck
    * created as a static final in order to be accessed by other views and classes
    */
    public static final String NUMCARDS = "com.example.marchfifth.NUMCARDS";
    public static final String NAME = "com.example.marchfifth.NAME";
    /**
    *setName is the variable being used to take in user input for the title of the deck
    *numberCards is the variable being used to take in user input for the number of cards in the deck
    */
    EditText setName;
    EditText numberCards;
    /** These variables are used in order to pass the values to the next view through the use of intents
    */
    String name;
    int numCards;
    /**
    * onCreate method called when app is created, sets content view and EditText 
    * variables for user input
    * @param Bundle savedInstanceState saved instance state of app in current condition
    * @return nothing
    * @since 1.0
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newset);

        setName = (EditText) findViewById(R.id.setName);
        numberCards = (EditText) findViewById(R.id.numberCards);
    }
    /**
    * method associated with active listener for this button, assigns variable values 
    * and calls method to go to next view
    * @param View v current view
    * @return nothing
    * @since 1.0
    */
    public void clicked (View v){
        name = setName.getText().toString();
        numCards = Integer.valueOf(numberCards.getText().toString());
        openNextActivity();
    }

    /**
    * method called to go to next view and pass variables obtained in current view
    * through the use of intents
    * @param nothing
    * @return nothing
    * @since 1.0
    */
    public void openNextActivity(){
        Intent intent = new Intent(this, firstFlashcard.class);
        intent.putExtra(NUMCARDS, numCards);
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}
