package com.example.marchfifth;

class flashCard{
	private String front;
	private String back;
	private int numTested;
	private int numWrong;
	
	void setFront(String question){
		front = question;}
	void setBack(String answer){
		back = answer;}
	String getFront(){
		return front;}
	String getBack(){
		return back;}
    void tested(){
	numTested++;}
    void wrong(){
	numWrong++;}
	boolean isMostMissed(){
		if(numTested/numWrong > 1)
			return true;
		else
			return false;}
}
