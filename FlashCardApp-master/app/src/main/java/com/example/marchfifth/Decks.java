package com.example.marchfifth;
import java.util.*;
/**

* Decks is the class that holds the linked list of the decks of cards created
* 
* @author Laura Doan
* 
*/
class Decks{
    /**
   * deckNames is the linked list containing all the titles of each deck of flashcards created
   * deckList is the linked list containing all the decks of flashcards created
   * numDecks is simply the number of decks created
   */
    public static LinkedList<String> deckNames = new LinkedList<String>();
    public static LinkedList<Deck> deckList = new LinkedList<Deck>();
    private static int numDecks;
	
    /**
    * This method adds the current deck and the name of the deck to  
    * their respective linked lists 
    * @param name is the name of the deck being pushed into list
    * @return nothing
    * @since 1.0
    */
    public static void pushDeck( String name, Deck nextDeck){
	deckNames.add(name);
	deckList.add(nextDeck);
	numDecks++;
    }
     /**
    * This method deletes the current deck and the name of the deck from  
    * their respective linked lists 
    * @param name is the name of the deck being deleted from list
    * @return nothing
    * @since 1.0
    */
    public static void deleteDeck(String name){
	int location = deckNames.indexOf(name);
	deckNames.remove(location);
	deckList.remove(location);
	numDecks--;
    }	   
    /**
    * This method gets the deck from the linked list based off of the location 
    * of the name of the deck list which should correspond
    * @param name is the name of the deck being retrieved
    * @return the deck being requested
    * @since 1.0
    */
    public static Deck viewDeck(String name){
        int location = deckNames.indexOf(name);
        Deck current = deckList.get(location);
	return current;
    }
}
