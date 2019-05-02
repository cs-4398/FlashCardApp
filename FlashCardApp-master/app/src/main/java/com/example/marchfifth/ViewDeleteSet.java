package com.example.marchfifth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ViewDeleteSet extends AppCompatActivity {
    public static final String SET = "com.example.marchfifth.SET";
    Button viewButton;
    Button deleteButton;
    EditText SetName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdeleteset);

        SetName = (EditText) findViewById(R.id.SetName);
        viewButton = (Button) findViewById(R.id.ViewButton);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String set = SetName.getText().toString();
                openNextActivity1(set);
            }
        });

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

    public void openNextActivity1(String set) {
        Intent intent = new Intent(this, viewCard.class);
        intent.putExtra(SET, set);
        startActivity(intent);
    }

    public void openNextActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
