// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Quetstion 5

import java.util.*;
public class L7Q5 {
	public static void main(String[] args)
	{
		Game p1=new Game("Hu Yuhuang");
		Game p2=new Game("Hu Yuhuang1");
		
		int p1S=0;
		int p2S=0;
		while (p1S<100 && p2S<100)
		{
			p1S+=p1.move();
			p2S+=p2.move();
		}
		
		if (p1S>p2S) System.out.println("Hu Yuhuang Wins "+p1S);
		else System.out.println("Hu Yuhuang1 Wins "+p2S);
		
	}
}
