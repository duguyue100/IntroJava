// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 6 Question 2

import java.util.*;
import java.io.*;
public class L6Q2 {
	public static void main(String[] args)
	{
		Scanner input=null;
		PrintWriter output=null;
		try
		{
			input=new Scanner(new File("input.txt"));
			output=new PrintWriter(new File("reverse.txt"));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		while (input.hasNextLine())
		{
			String st=input.nextLine();
			for (int i=st.length()-1;i>=0;i--)
				output.print(st.charAt(i));
			output.println();
		}
		
		input.close();
		output.close();
	}
}
