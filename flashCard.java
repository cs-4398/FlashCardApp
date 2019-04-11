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
		returnBack;}
    void tested(){
	numTested++;}
    void wrong(){
	numWrong++;}
	boolean isMostMissed(){
		if(numTested/numWong > 1)
			return true;
		else
			return false;}
}
