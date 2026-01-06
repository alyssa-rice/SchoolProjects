package MathPrograms;

import java.util.Scanner;

public class RandomAB {
	public static void main (String [] arg) {
		//This program prints a random number between the two user inputs
		// declare variable
		Scanner scn = new Scanner(System.in);
		int a = (0);
		int b = (0);
		int ran = 0;
		// User Input
		System.out.println(" Enter two numbers ");
		a = scn.nextInt();
		b = scn.nextInt();
		// Calculations

	
			ran = (int)(Math.random()*(b-a+1))+a;
			System.out.println(ran);
		

		scn.close();
	}
}
