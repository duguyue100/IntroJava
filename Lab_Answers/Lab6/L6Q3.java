// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 6 Question 3

import java.util.*;
import java.io.*;
public class L6Q3 {
	public static void main(String[] args)
	{
		Scanner input=null;
		int sumC=0;
		int sumW=0;
		int sumL=0;
		try
		{
			input=new Scanner(new File("input.txt"));
			while (input.hasNextLine())
			{
				input.nextLine();
				sumL++;
			}
			input.close();
			input=new Scanner(new File("input.txt"));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		
		while (input.hasNext())
		{
			String st=input.next();
			sumW++;
			sumC+=st.length();
		}
		System.out.println(sumC+" chars");
		System.out.println(sumW+" words");
		System.out.println(sumL+" lines");
		input.close();
	}
}
