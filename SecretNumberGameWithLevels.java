/* 1.Welcome and Level Selection
 * 2.Pick a secret number based on level 
 * 3.Give hints(higher/lower)
 * 4.Track points based on how fast the user guesses.
 * 5.Show final score.
 */

import java.util.Random;
import java.util.Scanner;

public class SecretNumberGameWithLevels {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random ramdom = new Random();
		int maxNumber = 10;
		int points = 0;
		int attempts = 0;
		
		System.out.println("Welcome to the Secret Number Game!");
		System.out.println("Choose Level: ");
		System.out.println("1.Easy (1-10)");
		System.out.println("2.Medium (1-20)");
		System.out.println("3.Hard (1-50)");
		System.out.println("Enter level number: ");
		
		int level = scanner.nextInt();
		
		if(level == 2) {
	          maxNumber = 20;
		}else if(level == 3) {
			maxNumber = 50; 
		}
		int secretNumber = ramdom.nextInt(maxNumber) + 1;
		int guess;
		
		System.out.println("Guess the secret number between 1 and " + maxNumber);
		System.out.println("You have 7 chances!");
		
		for(int i = 1; i<=7; i++) {
			System.out.println("Guess" + i + ": ");
			guess = scanner.nextInt();
			attempts++;
			
			if(guess == secretNumber) {
				System.out.println("Congratulation! You guessed it in " + attempts + " attempts. ");
				points = 100 - (attempts * 10);
				break;
				
			}else if(guess <secretNumber) {
				System.out.println("Hint: Go higher!");
			}else {
				System.out.println("Hint: Go lower!");
			}
			
		}
		if(points == 0) {
			System.out.println("Game Over! The secret number was " + secretNumber);
			
		}
		System.out.println("Your final score: " + points);
		
	}

}

