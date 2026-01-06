package MathPrograms;

import java.util.Scanner;

public class ThreeSort {
	public static void main (String[] arg) {
		//This program displays the user inputs in ascending order
		Scanner scn = new Scanner (System.in);
		int a, b, c;
		int min,max, mid=0;
		System.out.println ("Enter 3 integers to display them by ascending order");
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		max = Math.max (a,Math.max(c, b));
		min = Math.min (a,Math.min(c, b));
		if (max==a && min ==b || max ==b && min == a) {
			mid = c;
		}
			if (max == b && min ==c || max == c && min ==b) {
		   mid = a;
			}
				if (max == a && min == c || max == c && min == a) {
					mid = b;
				}
				
				
		System.out.println(min + " "+ mid + " " + max);
		
		scn.close();
	}
	
}
