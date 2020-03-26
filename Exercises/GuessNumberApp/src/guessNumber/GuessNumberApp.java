package guessNumber;


import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();
        Random random = new Random();
        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int randomNum = (int) d;             // convert double to int
        int right_guess=randomNum.nextInt(10);
        randomNum++;                         // int is >= 1 and <= limit
		
        // prepare to read input from the user
		Scanner sc = new Scanner(System.in);
		
        int guess = sc.nextInt();
        System.out.println("You guessed: " + guess);
        
        //TODO: compare the guess to the random number
        
        
        //TODO: what should happen if the user enters a number outside the range?
        if RandomNumber = (< 10) {
        do	System.out.println("Too Far!")
        }
        //TODO: print out a message to the user saying "Too high" or "Too low"
        
        
        
	}

}
