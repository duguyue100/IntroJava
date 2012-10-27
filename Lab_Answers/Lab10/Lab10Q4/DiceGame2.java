// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 4

import java.util.*;
public class DiceGame2 extends DiceGame {
	public DiceGame2(String n)
	{
		super(n);
	}
	public int rolling()
	{
		Random num=new Random();
		int n1=num.nextInt(6)+1;
		int n2=0;
		if (n1==6)
		{
			n2=num.nextInt(6)+1;
			if (n2==6)
				n2=0;
		}
		
		return n1+n2;
	}
	
	public void score()
	{
		super.computeScore(rolling());
	}
	
	public void judge(DiceGame2 p1, DiceGame2 p2)
	{
		while (p1.getScore()<=100 && p2.getScore()<=100)
		{
			p1.score();
			p2.score();
		}
		
		if (p1.getScore()>p2.getScore())
			System.out.println(p1.getName()+" wins!");
		else System.out.println(p2.getName()+" wins!");
	}
}
