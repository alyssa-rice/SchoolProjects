package MathPrograms;

import java.util.Scanner;

public class LoanPayment {
	public static void main (String [] arg) {
		double t = 0;
		double rate = 0;
		double p = 0;
		double e = 2.71;
		double A;
		Scanner scn = new Scanner (System.in);
		//user input
		System.out.println ("Enter the number of years");
		t = scn.nextDouble();
		System.out.println ("Enter the principal");
		p = scn.nextDouble();
		System.out.println("Enter the annual interest rate");
		rate = scn.nextDouble();
		double r = rate/100;
		//Calculation
		A = p * Math.pow(e, r*t);
		System.out.println("$"+A);
		
		scn.close();
	}
	
}
