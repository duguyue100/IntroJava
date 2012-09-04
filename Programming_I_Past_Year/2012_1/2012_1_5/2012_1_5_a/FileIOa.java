// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2012 I 5a

import java.util.*;
import java.io.*;
public class FileIOa {
	public static void main(String[] args)
	{
		Scanner input=null;
		PrintWriter print=null;
		try
		{
			input=new Scanner(new File("file.in"));
			print=new PrintWriter(new File("file.out"));
		}
		catch (Exception e)
		{
			System.out.println("error");
			System.exit(1);
		}
		
		while (input.hasNextLine())
		{
			String str=input.nextLine();
			print.println(str.substring(1));
		}
		
		input.close();
		print.close();
	}
}
