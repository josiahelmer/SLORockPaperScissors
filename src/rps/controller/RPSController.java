package rps.controller;

import java.util.Scanner;
import java.util.Random;

public class RPSController
{
	String userinput;
	String userchange;
	public RPSController()
	{
		int num = 0;
		Random r = new Random();
		num = r.nextInt(3);
		
		
		
		System.out.println("Lets play Rock, Paper, Scissors");
		System.out.println("Please select Rock(R), Paper(P), or Scissors(S)");
		System.out.print("Enter your move:");
		Scanner user = new Scanner(System.in);
		userchange = user.next();
		userinput = userchange.toUpperCase();

		
	    switch (num)
	    {
	    case 0:
	        String num1 = "R";
	        System.out.println("I chose Rock"); 
	        if (userinput.matches(num1))
	        {
	            System.out.println("tie");

	            }
	        else if (userinput.matches("P"))
	        {
	            System.out.println("You win");

	        }
	        else if (userinput.matches("S"))
	        {
	            System.out.println("You lose");
	        }
	        else if (userinput.matches("G"))
	       	{
	        	System.out.println("You can't use a Gun! Thats cheating!");
	       	}
	        else 
	        {
	            System.out.println();
	            System.out.println("R, P, or S");
	        }
	    break;
	    case 1:
	        String num2 = "P";
	        System.out.println("I chose Paper");
	        if (userinput.matches(num2))
	        {
	            System.out.println("tie");

	        }
	        else if (userinput.matches("S")){
	            System.out.println("You win");

	        }
	        else if (userinput.matches("R"))
	        {
	            System.out.println("You lose");
	        }
	        else if (userinput.matches("G"))
	       	{
	        	System.out.println("You can't use a Gun! Thats cheating!");
	        }
	        else 
	        {
	            System.out.println();
	            System.out.println("R, P, or S");
	        }
	    break;
	    case 2: 
	        String num3 = "S";
	        System.out.println("I chose Scissors");
	        if (userinput.matches(num3))
	        {
	            System.out.println("tie");

	        }
	        else if (userinput.matches("R"))
	        {
	            System.out.println("You win");

	        }
	        else if (userinput.matches("P"))
	        {
	            System.out.println("You lose");
	        }
	        else if (userinput.matches("G"))
	       	{
	        	System.out.println("You can't use a Gun! Thats cheating!");
	        }
	        else 
	        {
	            System.out.println();
	            System.out.println("R, P, or S");
	        }
	    break;


	    }

	}
	

	public void start()
	{

		
	}
}

