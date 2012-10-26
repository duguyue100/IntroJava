// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 5

import java.util.*;
public class L8Q5 {
	public static void main(String[] args)
	{
		ArithmeticGame st1=new ArithmeticGame("Hu Yuhuang");
		ArithmeticGame st2=new ArithmeticGame("Hu Yuhuang1");
		
		while (st1.score<30 && st2.score<30)
		{
			st1.attempts();
			st2.attempts();
		}
		
		if (st1.score>st2.score)
			System.out.println("Hu Yuhuang Wins");
		else System.out.println("Hu Yuhuang1 Wins");
	}
}
