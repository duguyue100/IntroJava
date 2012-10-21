// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 3 Question 4

import java.util.*;
public class L3Q4 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Sales Volume: ");
		int n=input.nextInt();
		if (n<=100)
			System.out.printf("%.2f",(double)(n*0.05));
		else if (n>100 && n<=500)
			System.out.printf("%.2f",(double)(n*0.075));
		else if (n>500 && n<=1000)
			System.out.printf("%.2f",(double)(n*0.1));
		else if (n>1000)
			System.out.printf("%.2f",(double)(n*0.125));
		
	}
}
