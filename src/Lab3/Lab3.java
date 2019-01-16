package Lab3;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
	
	/* This is a program that prompts a user to enter a number between 1 and 100
	and then tells the user whether the number is odd or even. Under some conditions the
	program may also tell the user a range that the number falls within.*/
		
	Scanner scnr = new Scanner(System.in);
	String name;
	String endProgram = "y";
	
	
	// initial user greeting
	
	System.out.println("Please enter your name: ");
	name = scnr.nextLine();
	System.out.println("Hello, " + name + ".");
	
	
	/* A do while loop is used to prompt user to continue after entering each number. 
	 Within the do while loop, if else conditional statements are used with 
	 "modulus 2" (%2) to determine whether the number entered by the user is odd or even*/
	
	do {
		System.out.println("Please enter a number between 1 and 100: ");
		int userNum = scnr.nextInt();
	if (userNum < 1 || userNum > 100) {
		System.out.println(name + ", you entered an invalid number.");
	}
	if (userNum % 2 != 0 && userNum > 0 && userNum < 100) {
		System.out.println(name + ", you entered " + userNum + ", which is an odd number.");
	}
	if (userNum % 2 == 0 && userNum < 25 && userNum > 0)  {
		System.out.println(name + ", your number is even and less than 25.");
	}
	else if (userNum % 2 == 0 && userNum <= 60 && userNum > 0) {
		System.out.println(name + ", your number is even."); 
	}
	else if (userNum % 2 == 0 && userNum > 0 && userNum <= 100) {
		System.out.println(name + ", you entered " + userNum + ", which is an even number.");
	}
	else if (userNum % 2 != 0 && userNum > 60 && userNum < 100) { 
		System.out.println(name + ", you entered " + userNum + ", which is odd and over 60.");
	}
	else if (userNum % 2 != 0 && userNum >0 && userNum < 100 ) {
	}
	else {
		System.out.println("Please enter a positive whole number between 1 and 100.");
	}
		System.out.println("Continue? (y/n): ");
		endProgram = scnr.next();
		
		// Program uses equalsIgnoreCase so that either 'N' or 'n' terminates the program.
    } while (!endProgram.equalsIgnoreCase("n"));
	
	scnr.close();
	
	// Salutation marking official end of the program after user opts not to continue
	System.out.println("Bye!");
	}
}
