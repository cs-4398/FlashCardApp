package com.example.marchfifth;

class Deck {
	private int numCards;
	private flashCard[] newDeck;

	public void Deck(/*int cards*/) {
		//numCards = cards;
		//newDeck = new flashCard[numCards];
	}

	void popCard(/*int loc; String front; String back*/) {
		//newDeck[loc].setFront(front);
		//newDeck[loc].setBack(back);
	}


	flashCard getCard(int i) {
		//newDeck[i].tested();
		return newDeck[i];
	}
}