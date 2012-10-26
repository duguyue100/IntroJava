// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 5

import java.util.*;
public class ArithmeticGame {
	public String studentName;
	public int score;
	
	public ArithmeticGame()
	{
		score=0;
	}
	public ArithmeticGame(String sn)
	{
		studentName=sn;
		score=0;
	}
	
	public void attempts()
	{
		Random num=new Random();
		int n1=num.nextInt(20);
		int n2=num.nextInt(20);
		int ans=n1+n2;
		System.out.print(studentName+": "+n1+"+"+n2+" Enter your answer: ");
		Scanner input=new Scanner(System.in);
		int an=input.nextInt();
		
		if (an==ans)
		{
			score+=5;
			System.out.println("Correct, current score: "+score);
		}
		else if (an!=ans)
		{
			System.out.print(studentName+": "+"Wrong, try again:");
			an=input.nextInt();
			if (an==ans)
			{
				score+=2;
				System.out.println("Correct, current score: "+score);
			}
		}
		else System.out.println("Wrong, current score: "+score);
	}
}
