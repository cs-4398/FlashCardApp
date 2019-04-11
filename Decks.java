import java.util.*;

class Decks{
    public LinkedList<String> deckNames = new LinkedList<String>();
    private LinkedList<deck> deckList = new LinkedList<Deck>();
    private int numDecks;
    
    public void createDeck( String name, int numCards){
	deckNames.add(name);
	deck new nextDeck = new deck(numCards);
	deckList.add(nextDeck);
	numDecks++;
    }

    public void deleteDeck(String name){
	int location = deckNames.indexOf(name);
	deckNames.remove(location);
	deckList.remove(location);
	numDecks--;
    }

    public deck viewDeck(String name){
	int location = deckNames.indexOf(name);
	deck current = deckList.get(location);
	return current;
    }
}
