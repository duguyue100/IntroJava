// Author: Hu Yuhuang
// Email: duugyue100@gmail.com
// Programming I: 2012 I 5b

import java.util.*;
import java.io.*;
public class FileIOb {
	public static void main(String[] args)
	{
		String origin="file.in";
		Scanner input=new Scanner(System.in);
		Scanner inputF=null;
		PrintWriter outputF=null;
		if (!new File(origin).exists())
		{
			System.out.println("file not existed");
			System.exit(1);
		}
		else
		{
			try
			{
				inputF=new Scanner(new File(origin));
			}
			catch (Exception e)
			{
				System.out.println("error");
				System.exit(1);
			}
		}

		System.out.print("Please input the existing file name: ");
		String name1=input.nextLine();
		
		System.out.print("Please input the copy file name: ");
		String name=input.nextLine();
		while (!new File(name).exists())
		{
			System.out.println("File not existed");
			System.out.println("Please Choose: 1: Abort Program. 2: overwrite the existing file. " +
					"3: enter a new name.");
			Scanner Input=new Scanner(System.in);
			String inputN=Input.nextLine();
			switch(inputN.charAt(0))
			{
			case '1':
			{
				System.exit(1);
				break;
			}
			case '2':
			{
				name=name1;
				break;
			}
			case '3':
			{
				System.out.print("Please input the copy file name: ");
				name=input.nextLine();
				break;
			}
			default:
			{
				System.out.println("error");
				break;
			}
			}
		}
		try
		{
			outputF=new PrintWriter(new File(name));
		}
		catch (Exception e)
		{
			System.out.println("error");
			System.exit(1);
		}
		
		while (inputF.hasNextLine())
		{
			outputF.println(inputF.nextLine());
		}
		
		inputF.close();
		outputF.close();
	}
}
