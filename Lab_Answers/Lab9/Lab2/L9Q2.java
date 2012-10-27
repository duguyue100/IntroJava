// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 2

import java.util.*;
public class L9Q2 {
	public static void main(String[] args)
	{
		ReverseFile rf=new ReverseFile("input.txt");
		rf.reverseWrite("output.txt");
		
		ReverseFile rf1=new ReverseFile();
		rf.readFile();
		rf.reverseWrite("output1.txt");
	}
}
