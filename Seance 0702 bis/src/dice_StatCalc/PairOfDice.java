package dice_StatCalc;

public class PairOfDice {
	private int die1;
	private int die2;
	
	/**
	 * Constructor
	 */
	public PairOfDice(){
		roll();
	}
	/**
	 * assign 2 values to the 2 dice.
	 */
	public void roll(){
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
	}
	
	public int getdie1(){
		return die1;
	}
	public int getdie2(){
		return die2;
	}
	
	/**
	 * @param a
	 */
	public void setDie1(int a){
		if (a < 1 || a > 6){
			throw new IllegalArgumentException("wrong value");
		}
		die1 = a;
	}
	
	/**
	 * @param a
	 */
	public void setDie2(int a){
		if (a < 1 || a > 6){
			throw new IllegalArgumentException("wrong value");
		}
		die2 = a;
	}
	
	public int getTotal(){
		return die1 + die2;
	}
	
	public String toString(){
		return die1 + "and" + die2;
	}


}
