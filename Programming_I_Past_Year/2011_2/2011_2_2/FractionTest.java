// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 2

import java.util.Scanner;
public class FractionTest {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Fraction f1;
		Fraction f2;
		
		String result="";
		System.out.println("Please input the first fraction:");
		String str1=input.nextLine();
		f1=strToFrac(str1);
		System.out.println("Please input the second fraction");
		String str2=input.nextLine();
		f2=strToFrac(str2);
		
		
		System.out.println("Please input a operator");
		String str3=input.nextLine();
		switch(str3)
		{
		case "+":
		{
			result+=str1+"+"+str2+"= "+Integer.toString(f1.add(f2).getNumerator())+"/"
					+Integer.toString(f1.add(f2).getDenominator());
			break;
		}
		case "-":
		{
			result+=str1+"-"+str2+"= "+Integer.toString(f1.subtract(f2).getNumerator())+"/"
					+Integer.toString(f1.subtract(f2).getDenominator());
			break;
		}
		case "*":
		{
			result+=str1+"*"+str2+"= "+Integer.toString(f1.multiply(f2).getNumerator())+"/"
					+Integer.toString(f1.multiply(f2).getDenominator());
			break;
		}
		case "/":
		{
			result+="("+str1+")/("+str2+")= "+Integer.toString(f1.divide(f2).getNumerator())+"/"
					+Integer.toString(f1.divide(f2).getDenominator());
			break;
		}
		default : {
			System.out.println("error");
			break;
		}
		}
		
		System.out.println(result);
	}
	
	public static Fraction strToFrac(String frac)
	{
		Fraction result=new Fraction();
		String substr="";
		int i=0;
		while (frac.charAt(i)!='/')
		{
			substr+=frac.charAt(i);
			i++;
		}
		result.setNumerator(Integer.parseInt(substr));
		i++;substr="";
		while (i<frac.length())
		{
			substr+=frac.charAt(i);
			i++;
		}
		result.setDenominator(Integer.parseInt(substr));
		
		return result;
	}
}
