class Deck{
    private int  numCards;
    private flashCard[] newDeck;
	
    public void Deck(int cards){
	numCards = cards;
	newDeck = new flasCard[NumCards];
	popCards();
    }

    /*void popCards(){
        for(int i = 0; i < numCards; i++){
	    String front =; //call to view for getting front of card text
	    String back =; //call to view for getting back of card text
	    newDeck[i].setFront(front);
	    newDeck[i].setBack(back);
	}
	}*/

    void popCard(int loc; String front; String back){
	newDeck[i].setFront(front);
	newDeck[i].setBack(back);
    }

    

    flashCard getCard(int i){
	if(i < numCards){
	    newDeck[i].tested();
	    return newDeck[i];
	}
    }

    
