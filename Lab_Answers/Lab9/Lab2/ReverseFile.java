// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 2

import java.util.*;
import java.io.*;
public class ReverseFile {
	private String[] fileContents;
	
	public ReverseFile()
	{
		
	}
	
	public ReverseFile(String fileName)
	{
		Scanner input=null;
		int n=0;
		try
		{
			input=new Scanner(new File(fileName));
			while (input.hasNextLine())
			{
				input.nextLine();
				n++;
			}
			input.close();
			input=new Scanner(new File(fileName));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		fileContents=new String[n];
		int i=0;
		while (input.hasNextLine())
		{
			fileContents[i]=input.nextLine();;
			i++;
		}
		
		input.close();
	}
	
	public void readFile()
	{
		Scanner inputFileName=new Scanner(System.in);
		System.out.print("Enter file Name: ");
		String fileName=inputFileName.nextLine();
		Scanner input=null;
		int n=0;
		try
		{
			input=new Scanner(new File(fileName));
			while (input.hasNextLine())
			{
				input.nextLine();
				n++;
			}
			input.close();
			input=new Scanner(new File(fileName));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		int i=0;
		fileContents=new String[n];
		while (input.hasNextLine())
		{
			fileContents[i]=input.nextLine();
			i++;
		}
		
		input.close();
	}
	
	public void reverseWrite(String fileName)
	{
		PrintWriter output = null;
		try
		{
			output=new PrintWriter(new File(fileName));
		}
		catch (Exception e)
		{
			System.exit(1);
		}
		
		writing(output,fileContents.length-1);
		
		output.close();
	}
	
	public void writing(PrintWriter output,int index)
	{
		if (index!=0)
		{
			output.println(fileContents[index]);
			writing(output, index-1);
		}
		else if (index==0)
		{
			output.println(fileContents[index]);
		}
		
	}
}
