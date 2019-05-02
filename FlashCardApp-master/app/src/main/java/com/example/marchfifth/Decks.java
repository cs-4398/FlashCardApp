package com.example.marchfifth;
import java.util.*;

class Decks{
    public static LinkedList<String> deckNames = new LinkedList<String>();
    public static LinkedList<Deck> deckList = new LinkedList<Deck>();
    private static int numDecks;
    
    public static void pushDeck( String name, Deck nextDeck){
	deckNames.add(name);
	deckList.add(nextDeck);
	numDecks++;
    }

    public void deleteDeck(String name){
	int location = deckNames.indexOf(name);
	deckNames.remove(location);
	deckList.remove(location);
	numDecks--;
    }

    public Deck viewDeck(String name){
	int location = deckNames.indexOf(name);
	Deck current = deckList.get(location);
	return current;
    }
}
