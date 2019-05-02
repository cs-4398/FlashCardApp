package com.example.marchfifth;
/**
* Deck is the main class that will hold all of the 
* data for each specific deck created
* @author Laura Doan
*
*/

class Deck {
	/**
	* numCards holds the number of cards in the deck
	* fronts allocates space to hold the fronts for the cards (questions)
	* backs allocates space to hold the backs for the cards (answers)
	*/
	private int numCards;
	private String fronts[];
	private String backs[];
	/** 
	* This method creates an instance of the deck being created
	*@param cards the number of cards in the deck being instantiated
	*@retruns nothing
	*/
	public void createDeck(int cards) {
		numCards = cards;
		fronts = new String[numCards+1];
		backs = new String[numCards+1];
		popCard(0, "F", "B");
	}
	/** 
	* This method populates the deck with a new card
	*@param loc is the location of the card in the list of cards in the deck
	*@param front is front of the card being placed in deck (question)
	*@params back is back of the card being placed in deck (answer)
	*@retruns nothing
	*/
	void popCard(int loc, String front, String back) {
		fronts[loc] = front;
		backs[loc] = back;
	}
	/**
	* This method retrieves the front of the card (answer)
	*@param loc is the location of the card in the list of cards in the deck
	*@retruns front of the card
	*/
	public String getFront(int loc) {
		return fronts[loc];
	}
	/**
	* This method retrieves the back of the card (solution)
	*@param loc is the location of the card in the list of cards in the deck
	*@retruns front of the card
	*/
	public String getBack(int loc){
		return backs[loc];
	}
	/**
	* This method retrieves the number of cards in the deck
	*@param none
	*@returns number of cards in deck
	*/
	public int getNumCards(){return numCards;}
}
