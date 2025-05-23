package chatgptQues;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter your choice");
		String userChoice=scan.nextLine().toLowerCase();
		scan.close();
		
		if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
			System.out.println("Invalid Choice");
			return;
		}
		
		String[] choices= {"rock","paper","scissors"};
		String systemChoice=choices[random.nextInt(3)];//0,1,2 => 2 choices[2] = scissors
		
		System.out.println("System choose "+systemChoice);
		
		if(userChoice.equals(systemChoice)) {
			System.out.println("It's a draw !!!😊😊");
		}		
		else if(userChoice.equals("rock") && systemChoice.equals("scissors") ||
		   userChoice.equals("scissors") && systemChoice.equals("paper") ||
		   userChoice.equals("paper") && systemChoice.equals("rock")) {
			System.out.println("You Win !!!😍😍");
		}else {
			System.out.println("You Lost !!!😒😒");
		}
		
	}
}
