// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 5

import java.util.*;
public class Game {
	private String playerName;
	public Game(String name)
	{
		playerName=name;
	}
	
	public int move()
	{
		return new Random().nextInt(6)+1;
	}
}
