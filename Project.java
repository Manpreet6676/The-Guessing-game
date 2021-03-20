// Name: Manpreet Kaur
// Student ID: 201906676
// Date Submitted: March 17th, 2021
// Class IN2203  G1
// Name of work: Assignment 1: The Gambling Game

package main_package;

import java.util.Scanner;
import java.util.Random;

public class Project
{
	static Scanner logInput = new Scanner(System.in);
	public static void Casino()
	{
		Random randomInt = new Random();		// Called the Random class
		
		// declaring variables for the game
		int Player_choice;
		int min = 1;
		int max = 100;
		int Comp_choice;
		String play_again;
		
		System.out.println("\nGuess a number between 1 to 100");
		System.out.print("Choose number: ");
		Player_choice = logInput.nextInt();
		System.out.println("Computer will guess a number now");
		Comp_choice = min + randomInt.nextInt(max);
		
		if(Player_choice > 100)
		{
			System.out.println("You can't choose any number after 100");
			System.exit(-1);
		}
		else
		{
			System.out.println("Your Number: " + Player_choice);
			System.out.println("Computer's Number " + Comp_choice);
			
			if(Player_choice > Comp_choice)
			{
				System.out.println("\nCongratulations You won!!");
				System.out.println("Do you want to play again? Reply with Yes or No: ");
				play_again = logInput.next();
				
				if(play_again.equals("Yes"))
				{
					Casino();
				}
				else
					System.exit(-1);
			}
			else
				System.out.println("Better luck next time!");
		}
	}
	public static void Player()
	{	
		String Player_name;
		String Player_choice; 
		
		System.out.print("\nEnter your name: ");
		Player_name = logInput.nextLine();
		
		System.out.println("Your Name has been registered");
		System.out.println("Dear " + Player_name + ", Do you want to start the game? Reply with Yes or No");
		System.out.print("\nYour choice: ");
		Player_choice = logInput.next();
		
		if(Player_choice.equals("Yes"))
		{
			System.out.println("Let's start the game!!");
			Casino();
		}
		else if(Player_choice.equals("No"))
		{
			System.out.println("Your choice is No so this panel will be closed, you can start it again!");
			System.exit(-1);
		}
		else
		{
			System.out.print("Invalid Option");
			System.exit(-1);
		}
	}
	public static void main(String[] args) 
	{
		String User_choice;
		String line = "+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+";
		
		// Sending Welcome Message
		System.out.println(line + "\n\tGuessing the Number Game\n" + line);
		System.out.println("Instructions: This game is about guessing a number and winning from the computer. You will\nhave to choose a number and then computer will choose a number\nIf your number is greater than computer's number then you will win the game");
		System.out.println("Do you want to play the game?");
		System.out.print("\nYour choice: ");
		User_choice = logInput.next();
		
		if(User_choice.equals("Yes"))
		{
			System.out.println("Let's start the game.\nFirst you have to tell us your name");
			Player();
		}
		else if(User_choice.equals("No"))
		{
			System.out.println("Your choice is No so this panel will be closed, you can start it again!");
			System.exit(-1);
		}
		else
		{
			System.out.print("Invalid Option");
			System.exit(-1);
		}
	}
}
