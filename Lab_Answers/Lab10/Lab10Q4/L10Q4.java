// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 4

import java.util.*;
public class L10Q4 {
	public static void main(String[] args)
	{
		DiceGame1 p1=new DiceGame1("Hu Yuhuang");
		DiceGame1 p2=new DiceGame1("Hu Yuhuang1");
		new DiceGame1("judge").judge(p1, p2);
		
		DiceGame2 p3=new DiceGame2("Hu Yuhuang2");
		DiceGame2 p4=new DiceGame2("Hu Yuhuang3");
		new DiceGame2("judge").judge(p3, p4);
	}
}
