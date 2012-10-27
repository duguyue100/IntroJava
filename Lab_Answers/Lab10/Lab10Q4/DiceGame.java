// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 10 Question 4

import java.util.*;
public class DiceGame {
	private String name;
	private int score;
	
	public DiceGame(String n)
	{
		name=n;
		score=0;
	}
	
	public void computeScore(int s)
	{
		score+=s;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String getName()
	{
		return name;
	}
}
