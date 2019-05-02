package com.example.marchfifth;

class Deck {
	private int numCards;
	private String fronts[];
	private String backs[];

	public void createDeck(int cards) {
		numCards = cards;
		fronts = new String[numCards+1];
		backs = new String[numCards+1];
		popCard(0, "F", "B");
	}

	void popCard(int loc, String front, String back) {
		fronts[loc] = front;
		backs[loc] = back;
	}


	public String getFront(int loc) {
		return fronts[loc];
	}

	public String getBack(int loc){
		return backs[loc];
	}

	public int getNumCards(){return numCards;}
}