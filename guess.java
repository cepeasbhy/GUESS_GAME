
import java.util.Scanner;
import java.util.Random;

public class guess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int game_num = 1, win = 0, loss = 0;
		
		System.out.println("GUESSING GAME PROGRAM");
		System.out.println("---------------------");
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("The computer will chose a number from 1 - 100");
			System.out.println("YOu have 5 tries to guess the number");
			System.out.println("---------------------------------------------");
			
			int rand_num = rand.nextInt(100)+1;
			
			for(int i = 1; i<=5; i++) {
				System.out.print(i+": Enter your guess: ");
				int guess_num = input.nextInt();
				
				if(guess_num>rand_num) {
					System.out.println("   - Your guess is too high");
				}else if(guess_num<rand_num) {
					System.out.println("   - Your guess is too high");
				}else if(guess_num == rand_num) {
					System.out.println(">> YOU HAVE WON THE GAME!");
					win++;
					break;
				}else {
					System.out.println(">> You have loss the game :(");
					System.out.println("The number is: "+rand_num);
					loss++;
				}
				
			}
			
			System.out.println("Do you want to play again[y/n]?: ");
			char opt  = input.next().charAt(0);
			
			if(opt == 'Y' || opt == 'y') {
				game_num++;
			}else {
				break;
			}
		}
		
		
			
	}

}
