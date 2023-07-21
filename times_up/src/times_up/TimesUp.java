package times_up;

import java.util.Scanner;

public class TimesUp {
	
	public static void main(String[] args) {


		        // Create a Scanner object to read user input
		        Scanner scanner1 = new Scanner(System.in);
		        Scanner scanner2 = new Scanner(System.in);

		        // Prompt the user to enter their name
		        System.out.print("What is your name? ");

		        // Read the user's name
		        String name1 = scanner1.nextLine();

		        // Prompt the user to enter their age
		        System.out.print("What is your age? ");

		        // Read the user's age
		        int age = scanner2.nextInt();

		        // Print a greeting to the user
		        System.out.println("Hello, " + name1 + "! You are " + age + " years old.");
		     // Check if the user is over 18
		        if (age < 18) {

		            // If the user is under 18, tell them they are not allowed to participate
		            System.out.println("Sorry, you are not allowed to participate because you are under 18.");

		        } else {

		            // If the user is over 18, allow them to participate
		            System.out.println("Welcome to the program! You are allowed to participate.");

		 // Close the Scanners
	        scanner1.close();
	        scanner2.close();
	    
		
		
	}
	        

	}
	
	}//...end
