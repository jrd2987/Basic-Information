/**
Programmer: Justin Doggett
Date: 4/27/2017
Description: This program displays your name, address, telephone number, and college major on separate lines.
*/
import java.util.Scanner; //needed for Scanner Class

public class PersonInfo
{
	//Start of program
	public static void main(String [] args)
	{
		// Variable declarations
		String name;
		String address;
		String phoneNumber;
		String collegeMajor;


		//Create a new Scanner Object to read input
		Scanner keyboard = new Scanner(System.in);


		//Get the user's name
		System.out.print("What is your name? ");
		name = keyboard.nextLine();


		//Get the user's address
		System.out.print("What is your address? ");
		address = keyboard.nextLine();


		//Get the user's phone number
		System.out.print("What is your phone number? ");
		phoneNumber = keyboard.nextLine();


		//Get the user's college major
		System.out.print("What is your college major? ");
		collegeMajor = keyboard.nextLine();


		//Display personal info to the console(screen)

		System.out.println("Hello there " + name + " ," + "your address is: " + address + " ." + " Your phone number is: " + phoneNumber + " and your college major is: " + collegeMajor);
	}
}





