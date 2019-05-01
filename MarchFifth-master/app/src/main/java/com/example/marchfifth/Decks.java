package com.example.marchfifth;
import java.util.*;

class Decks{
    public LinkedList<String> deckNames = new LinkedList<String>();
    private LinkedList<Deck> deckList = new LinkedList<Deck>();
    private int numDecks;
    
    public void createDeck( String name, int numCards){
	deckNames.add(name);
	Deck nextDeck = new Deck(/*numCards*/);
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
