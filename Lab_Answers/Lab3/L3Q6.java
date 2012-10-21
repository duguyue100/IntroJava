// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 3 Question 6

import java.util.*;
public class L3Q6 {
	public static void main(String[] args)
	{
		Scanner inputT=new Scanner(System.in);
		System.out.print("Employee type (Permanent Staff(P), Contract Staff(C), Temporary Staff(T): ");
		char eType=inputT.next().charAt(0);
		Scanner input=new Scanner(System.in);
		System.out.print("Number of working hours: ");
		int hour=input.nextInt();
		
		if (eType=='P')
			System.out.println("Salary for Permanent Staff: "+(200*hour));
		else if (eType=='C')
			System.out.println("Salary for Contract Staff: "+(150*hour));
		else if (eType=='T')
			System.out.println("Salary for Temporary Staff: "+(100*hour));
	}
}
