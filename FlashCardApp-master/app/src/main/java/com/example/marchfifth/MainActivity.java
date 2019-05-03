package com.example.marchfifth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
* MainActivity is the class corresponding to the main menu 
* page of the application, the very first page shown
* 
* @author Nash Bateman
* 
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
    * This method is responsible for the activelistener associated with
    * the button to create a new deck of flashcards. When it is pressed,
    * the method to set the activity to create a new set of cards is called
    *@param View w is the view currently being viewed
    *@return nothing
    *@since 1.0
    */
    public void topClick(View v){
        openNewSetActivity();
    }
    /**
    * This method sets the activity to the view to create a new set of flashcards
    *@param nothing
    *@return nothing
    *@since 1.0
    */
    public void openNewSetActivity(){
        Intent intent = new Intent(this, NewSetClicked.class);
        startActivity(intent);
    }
    /**
    * This method is responsible for the activelistener associated with
    * the button to view or delete a deck of flashcards. When it is pressed,
    * the method to set the activity to view or delete a set of cards is called
    *@param View w is the view currently being viewed
    *@return nothing
    *@since 1.0
    */
    public void bottomClick(View v){
        openViewSetActivity();
    }
     /**
    * This method sets the activity to the view to view or delete a set of flashcards
    *@param nothing
    *@return nothing
    *@since 1.0
    */
    public void openViewSetActivity(){
        Intent intent = new Intent(this, ViewDeleteSet.class);
        startActivity(intent);
    }


}
