package murach.agecalculator;

import java.util.Scanner;
import java.time.LocalDate;
public class AgeCalculatorApp {
	public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");

        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (MM-DD-YYYY): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and print user's date of birth
        System.out.println("Your date of birth is " + AgeCalculatorApp.months + AgeCalculatorApp.days + AgeCalculatorApp.years);

        // Get and print the current date
        System.out.println("The current date is " + LocalDate.now());

        //Calculate the user's age
         
        
		//Print the user's age
        System.out.println("Your age is ");
        sc.close();
    }

	private static int days;
	   private static int months;
	   private static int years;
	   public AgeCalculatorApp(int days, int months, int years)
	   {
	      AgeCalculatorApp.days = days;
	      AgeCalculatorApp.months = months;
	      AgeCalculatorApp.years = years;
	   }
	   public int getDays()
	   {
	      return AgeCalculatorApp.days;
	   }
	 
	   public int getMonths()
	   {
	      return AgeCalculatorApp.months;
	   }
	 
	   public int getYears()
	   {
	      return AgeCalculatorApp.years;
	   }
	 
	  
	   public String toString()
	   {
	      return years + " Months, " + months + " Days, " + days + " Years";
	   }
	
}
    