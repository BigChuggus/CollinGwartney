package guessNumber;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();

        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int number = (int) d;             // convert double to int
        number++;                        // int is >= 1 and <= limit
		
        // prepare to read input from the user
		Scanner sc = new Scanner(System.in);
		int count = 1;
		
	   
		
		while (true) {
			try {
			    int guess = sc.nextInt();
			 catch(InputMismatchException e) {
			    System.out.println("some nice error message");
			    continue;
			
	        System.out.println("You guessed: " + guess);
	        
	        
	        if (guess < 1 || guess > LIMIT) {
	        	System.out.println("Your Guess is Invalid.");
	        	continue;
	        }
	        
	        if (guess < number) {
	        	System.out.println("Too Low.");
	        } else if (guess > number) {
	        	System.out.println("Too High.");
	        } else {
	        	System.out.println("You guessed it in " + count + " tries.\n");
	        	
	        	
	        	 
	        	  break;
	        }
	        
	        count++;
		}
        
	        
        System.out.println("Bye!");
  
		}
	}
	

}

