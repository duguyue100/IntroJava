// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 6 Question 1

import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.net.URLConnection;
public class L6Q1 {
	public static void main(String[] args)
	{	
		try
		{
			URL u=new URL("http://www.fsktm.um.edu.my/");
			URLConnection cnn=u.openConnection();
			InputStream stream=cnn.getInputStream();
			Scanner in=new Scanner(stream);
			PrintWriter output=new PrintWriter(new File("index.htm"));
			while (in.hasNextLine())
				output.println(in.nextLine());
			output.close();
		}
		catch (IOException e)
		{
			System.out.println("IO Error: "+ e.getMessage());
		}
		
	}
}
