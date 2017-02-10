package exo_53;
import dice_StatCalc.PairOfDice;
import dice_StatCalc.StatCalc;


public class exo_53 {
	
	private static PairOfDice dice = new PairOfDice();
	
	public static int NumberOfRolling(int n){
		IllegalArgumentException e = new IllegalArgumentException();
		if(n < 2 || n > 12){ throw e;}
		int compteur = 0;
		do{
			dice.roll();
			compteur++;
		} while (dice.getTotal() != n);
		return compteur;
	}
	
	public static void main(String[] args) {
		
		 System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
		
		for (int i = 2; i<=12; i++){
			StatCalc stat = new StatCalc();
			for (int j = 0; j<10000; j++){
				stat.enter( NumberOfRolling(i));
			}
			System.out.print("    " + i + "    ");
	        System.out.print("      " + stat.getMean() + "     ");
	        System.out.print("   " + stat.getStandardDeviation() + "    ");
	        System.out.print("    " + stat.getMax() + "    ");
	        System.out.println();
		}

	}

}
