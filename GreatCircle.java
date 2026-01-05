package MathPrograms;

import java.util.Scanner;

public class GreatCircle {
	public static void main (String [] arg) {
		
		//Declare Variables
		
		Scanner scn = new Scanner (System.in);
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		double distance = 0;
		
		//User input 
		
		System.out.println ("Enter the latitude of your first point");
		x1 = scn.nextDouble();
		x1 = Math.toDegrees(x1);
		System.out.println ("Enter the longitude of your first point");
		y1 = scn.nextDouble();
		y1 = Math.toDegrees(y1);
		System.out.println ("Enter the latitude of your second point");
		x2 = scn.nextDouble();
		x2 = Math.toDegrees(x2);
		System.out.println ("Enter the longitude of your second point");
		y2 = scn.nextDouble();
		y2 = Math.toDegrees(y2);
		
		//2nd Conversions
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		//Calculations
		
        distance = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		distance = Math.toDegrees(distance);
        //Output 
        
        System.out.println ("The great circle distance between the two points are: " + distance);
        
		scn.close();
	}

}
