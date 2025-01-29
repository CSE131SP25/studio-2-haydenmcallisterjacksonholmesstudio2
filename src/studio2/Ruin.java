package studio2;

import java.util.Scanner;
import java.util.Random;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		//creating variables
		System.out.println("What amount are you starting with?");
		int startAmount = in.nextInt();
		System.out.println("What is your probability of winning? Please enter your data as a percentage between 1 and 100.");
			int winChance = in.nextInt();
		
		System.out.println("What amount will you have to have won before you leave?");
		int winLimit = in.nextInt();
		
		int currentAmount = startAmount;
		System.out.println("How many simulations would you like to run?");
		int simulationLimit = in.nextInt();
	int totalSimulations = 0;
	int dayNumber = 0;
		//run the games
	for(totalSimulations = 0; totalSimulations < simulationLimit; simulationLimit++) {
	
	
		while (currentAmount < winLimit && currentAmount>0) {
			
			int randomNumber = random.nextInt(100);
			
					if (randomNumber <= winChance-1) {
						currentAmount = currentAmount+1;
						totalSimulations = totalSimulations+1;
					}
					else {
						currentAmount = currentAmount-1;
						totalSimulations = totalSimulations+1;
					}
					
					if (currentAmount == winLimit || currentAmount == 0) {
					
						if (currentAmount == winLimit) {
							System.out.println("Simulation " + dayNumber +": " + currentAmount  + "WON");
						}
						if (currentAmount == 0) {
						System.out.println("Simulation " + dayNumber +": " + currentAmount  + " LOST");
					}
					}
					
					}
		
	}
					
		
		}
		
}