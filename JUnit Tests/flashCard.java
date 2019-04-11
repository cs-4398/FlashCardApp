package flashCardApp;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @Test
    @DisplayName("Returns question correctly")
    public void testSetGetFront()

    {
        String question = "Test question";
        setFront(question);
        assertTrue(getFront() == front );
    }
	String getBack(){
		returnBack;}
    @Test
    @DisplayName("Returns answer correctly")
    public void testSetGetBack()

    {
        String answer = "Test answer";
        setBack(answer);
        assertTrue(setFront(question) == back );
    }
	boolean isMostMissed(int numTested, int numWrong){
		if(numTested/numWong > 1)
			return true;
		else
			return false;}
    @Test
    @DisplayName("Checks to see if most missed function returns True")
    public void testMostMissed()

    {
        numTested = 4;
        numWrong = 2;
        assertTrue(isMostMissed(numTested, numWrong));
    }
    @Test
    @DisplayName("Checks to see if most missed function returns False")
    public void testMostMissed()

    {
        numTested = 2;
        numWrong = 4;
        assertFalse(isMostMissed(numTested, numWrong));
    }
    
}
