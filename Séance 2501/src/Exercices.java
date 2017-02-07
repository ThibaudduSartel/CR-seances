import java.util.*;


public class Exercices {

	public static void main(String[] args) {
		
		/*System.out.println("Entrez une phrase:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Exercice1_printCapitalized(s));
		 */
		//System.out.println(NumberOfRolling(2));
		
		AverageForEachTotal();
		//Quizz();

	}
	
	public static String Exercice1_printCapitalized(String s){
		String S = "";
		for(int i = 0; i<s.length();++i){
			 if (Character.isLetter(s.charAt(i))){
				 if(i == 0){S += Character.toUpperCase(s.charAt(i));}
				 else { 
					 if(Character.isLetter(s.charAt(i-1)) == false ){
						 S += Character.toUpperCase(s.charAt(i));
					 }else {
						 S += s.charAt(i);
					 }
					 		
				 }
			 } else {
				 S += s.charAt(i);
			 }
		}
		return S;
	}
	
	public static int NumberOfRolling(int n){
		IllegalArgumentException e = new IllegalArgumentException();
		if(n < 2 || n > 12){ throw e;}
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		int compte = 0;
		while (a+b != n){
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			
			++compte;
			//System.out.println(a + "et" + b);
		}
		return compte;
	}
	public static double AverageNumberOfRolls (int total, int n){
		
		int[] rolls = new int[total];
		double average = 0;
		for (int i = 0; i < total; i++){
			rolls[i] = NumberOfRolling(n);
			average = average + rolls[i];
		}
		average = average / total;
		return average;
	}
	
	public static void AverageForEachTotal(){
		double average;
		for(int i = 2; i <= 12; i++){
			average = AverageNumberOfRolls(10000,i);
			System.out.println("Total On Dice : " + i + ", Average Number Of Rolls : " + average);
		}
	}
	
	public static void Quizz(){
		int[] nb1 = new int[10];
		int[] nb2 = new int[10];
		int[] rep = new int[10];
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<10; i++){
			nb1[i] = (int)(Math.random()*50)+1;
			nb2[i] = (int)(Math.random()*50)+1;
		}
		for (int i = 0; i<10; i++){
			System.out.println("Première question : " + nb1[i] + "+" + nb2[i] + "?");
			rep[i] = sc.nextInt();
		}
		for (int i = 0; i<10; i++){
			System.out.print("Question: " + nb1[i] + "+" + nb1[i] + "?" + " Réponse: " + rep[i] + " : ");
			if (nb1[i] + nb2[i] == rep[i]){
				System.out.println("Réponse correcte");
				++score;
			} else {
				System.out.println("Réponse incorrecte");
			}
		}
		System.out.println("score = " + score+ "/10");
		
	}
	

}
