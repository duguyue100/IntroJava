// Author: Hu Yuhuang
// Email: duugyue100@gmail.com
// Programming I: 2012 I 1

import java.util.Scanner;
public class TemperatureConvert {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Scanner inputN=new Scanner(System.in);
		System.out.print("Please enter C(c) or F(f):");
		String st=input.nextLine();
		switch(st.charAt(0))
		{
		case 'C':
		case 'c':
		{
			System.out.print("Enter a Celsius degree: ");
			System.out.println("Corresponding Fahrenheit degree: "+9*inputN.nextDouble()/5+32);
			break;
		}
		case 'F':
		case 'f':
		{
			System.out.print("Enter a Fahreheit degree: ");
			System.out.println("Corresponding Celsius degree: "+5*(inputN.nextDouble()-32)/9);
			break;
		}
		default:
		{
			System.out.println("error");
			break;
		}
		}
	}
}
