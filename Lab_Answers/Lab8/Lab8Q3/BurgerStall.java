// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 3

import java.util.*;
public class BurgerStall {
	private String ID;
	private int noBurger;
	public static int totalBurger;
	
	public BurgerStall(String id)
	{
		ID=id;
		noBurger=0;
	}
	
	public BurgerStall(String id, int nob)
	{
		ID=id;
		noBurger=nob;
		totalBurger+=noBurger;
	}
	
	public void sold(int nob)
	{
		noBurger+=nob;
		totalBurger+=noBurger;
	}
	
	public void print()
	{
		System.out.println("Total of Burger: "+totalBurger);
	}
}
