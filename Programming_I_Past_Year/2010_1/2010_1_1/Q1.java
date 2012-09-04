// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2010 I 1

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in); // first error. 
		int num,sum=0;
		do{
			System.out.print("Enter an integer number, -1 to quit:");
			num=a.nextInt(); // second error.
			if (num==-1) // third error. 
				break;
			if (num%2==0) // fourth error.
				System.out.println("The number is an even number");
			else
				System.out.println("The number is an odd number");
			sum+=num; // fifth error.
		}while (num!=-1); // sixth error.
		
		System.out.printf("The sum of all integer number(s) are: %5d", sum); // seventh error.
	}
	
}

/*
 * First error   : change "System.out" to "System.in".
 * Second error  : change "a.nextDouble()" to "a.nextInt()". (because num is a integer,
 *                 num cannot accept a double type data as input.)
 * Third error   : change "num=-1" to "num==-1". (num=-1 is a illegal boolean expression,
 *                 actually, the condition will be always ture if you write "num=-1".)
 * Fourth error  : change "num%2=0" to "num==0".
 * Fifth error   : change "sum-=num" to "sum+=num".
 * Sixth error   : add semicolon after while condition.
 * Seventh error : change "%5f" to "%5d". (C-style)
 */