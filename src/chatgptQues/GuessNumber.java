package chatgptQues;

/**
 * Problem Statment":
 * Guess a Number between 1 to 100
 * The computer randomly picks a number between 1 and 100.
 * The user has to guess it, and the program gives hints: “Too high” or “Too low.”
	. "Too low" → Your guess is less than the target number.

	. "Too high" → Your guess is greater than the target number.
	
	Give a range of guess up to 10
	
	If Number is guessed correctly quit the loop , if not give another change till it reaches the range of guess.
 */

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int systemChoice = rand.nextInt(101);
		int range = 10;
		int i;
		
		for(i=1;i<=range;i++) {
			
			System.out.println("Enter your Guess");
			int userGuess = scan.nextInt();
			if (userGuess == systemChoice ) {
				System.out.println("Yaay You Guessed it");
				break;
			}
			else if(userGuess > systemChoice) {
				System.out.println("Too High");
				continue;
			}
			else {
				System.out.println("Too low");
				continue;
			}
			

		}
		scan.close();
		if (i>range) {
			System.out.println("Your 10 attempts are over");
		}
	}
}
