// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 4 Question 4

import java.util.*;
public class L4Q4 {
	public static void main(String[] args)
	{
		Random num=new Random();
		
		int p1=0;
		int p2=0;
		
		while (p1<100 && p2<100)
		{
			int ps1=num.nextInt(6)+1;
			int ps2=num.nextInt(6)+1;
			p1+=ps1;
			p2+=ps2;
			while (ps1==6)
			{
				ps1=num.nextInt(6)+1;
				p1+=ps1;
			}
			while (ps2==6)
			{
				ps2=num.nextInt(6)+1;
				p2+=ps2;
			}
		}
		if (p1>=100 && p1>p2)
			System.out.println("Player 1 Wins");
		else if (p2>=100 && p2>p1)
			System.out.println("Player 2 Wins");
	}
}
