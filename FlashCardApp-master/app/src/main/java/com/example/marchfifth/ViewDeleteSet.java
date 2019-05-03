package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
* 
* ViewDeleteSet is the class associated with the view to be 
* able to view or delete a specific set of flashcards that
* have been created
* 
* author Nash Bateman and Laura Doan
*/

public class ViewDeleteSet extends AppCompatActivity {
    /**
    * SET is the variable used for the name of the set of flashcards wishing to be viewed or deleted
    * viewButton is the button to view a set of flashcards chosen
    * deleteButton is the button to delete a specified set of flashcards
    */
    public static final String SET = "com.example.marchfifth.SET";
    Button viewButton;
    Button deleteButton;
    EditText SetName;
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
        setContentView(R.layout.activity_viewdeleteset);
        /**
        * on click listener is set for viewButton, when button is pressed 
        * name of set wishing to be viewed is set and method is called to change content view to view set 
        * @param on click listener of view
        * @return nothing
        * @since 1.0
        */
        SetName = (EditText) findViewById(R.id.SetName);
        viewButton = (Button) findViewById(R.id.ViewButton);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String set = SetName.getText().toString();
                openNextActivity1(set);
            }
        });
        /**
        * on click listener is set for deleteButton, when button is pressed 
        * name of set wishing to be deleted is set and method is called to change content view 
        * @param on click listener of view
        * @return nothing
        * @since 1.0
        */
        deleteButton = (Button) findViewById(R.id.Delete);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String set = SetName.getText().toString();
                Decks.deleteDeck(set);
                openNextActivity2();
            }
        });

    }
    /**
    * method to change content view to view the deck being requested
    * intent is used to pass name of the deck and to start next activity
    * @param set name of the set wishing to be viewed
    * @return nothing
    * @since 1.0
    */
    public void openNextActivity1(String set) {
        Intent intent = new Intent(this, viewCard.class);
        intent.putExtra(SET, set);
        startActivity(intent);
    }
    /**
    * method to change content view to main menu after deck has been deleted
    * intent is used to start next activity
    * @param nothing
    * @return nothing
    * @since 1.0
    */
    public void openNextActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
