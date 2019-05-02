package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class viewCard extends AppCompatActivity {

    TextView heading;
    TextView body;
    Button button;

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
    public void openNextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}