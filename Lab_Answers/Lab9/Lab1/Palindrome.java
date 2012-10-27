// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 1

import java.util.*;
public class Palindrome {
	private String str;
	
	public Palindrome()
	{
		str="";
	}
	
	public Palindrome(String st)
	{
		str=st;
	}
	
	public void setString(String st)
	{
		str=st;
	}
	
	public void setInput()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your String:");
		setString(input.nextLine());
	}
	
	public void testInput()
	{
		setInput();
		if (check(str,0,str.length()-1)==true)
			System.out.println(true);
		else System.out.println(false);
	}
	
	public boolean check(String st, int start, int end)
	{
		
		if (st.charAt(start)==st.charAt(end) && start!=(start+end)/2)
			return check(st, start+1, end-1);
		else if (st.charAt(start)==st.charAt(end) && start==(start+end)/2)
			return true;
		else return false;
	}
}
