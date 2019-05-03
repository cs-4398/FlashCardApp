package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
* viewCard is the class used to display the flash cards of a chosen deck
* 
* @author Laura Doan
* 
*/

public class viewCard extends AppCompatActivity {
    /**
    * heading is the textView to display the number of the flashcard being displayed
    * body is the textView to display the front (question) or back (answer) of the flashcard being displayed
    * button is the button used to view the next textView, (the back (answer) and then next card)
    */
    TextView heading;
    TextView body;
    Button button;
     /**
    * onCreate method called when app is created, sets content view and initiates variables and textViews
    * variables for user input and creates intent to pass given variables and set new content views
    * @param Bundle savedInstanceState saved instance state of app in current condition
    * @return nothing
    * @since 1.0
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_card);
        heading = (TextView) findViewById(R.id.Heading);
        body = (TextView) findViewById(R.id.cardText);
        button = (Button) findViewById(R.id.ContinueButton);
        heading.setText("question 1");

        Intent intent = getIntent();
        String set = intent.getStringExtra(ViewDeleteSet.SET);
        final Deck current = Decks.viewDeck(set);
        final int numCards = current.getNumCards();
        body.setText(current.getFront(1));
        
        button.setOnClickListener(new View.OnClickListener() {
            int i = 1;
            boolean a = true;
            /**
            * onClick method called when button is pressed, sets values of next textView being viewed
            * @param View v current view 
            * @return nothing
            * @since 1.0
            */
            @Override
            public void onClick(View v) {
                if (a) {
                    heading.setText("answer" + i);
                    body.setText(current.getBack(i));
                    a = false;
                } else {
                    if (i == numCards) {
                        openNextActivity();
                    }
                    else{
                        i++;
                        a = true;
                        heading.setText("question" + i);
                        body.setText(current.getFront(i));
                    }
                }
            }
        });
    }
    /**
    * openNextActivity method called when last card of deck is viewed, returns user to main menu
    * @param nothing
    * @return nothing
    * @since 1.0
    */
    public void openNextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
