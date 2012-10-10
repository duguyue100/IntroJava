import java.util.Scanner;

// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 05
public class Input {
	public static void main(String[] args)
	{
		Scanner inputInteger=new Scanner(System.in);
		int n=inputInteger.nextInt();
		System.out.println(n);
		
		Scanner inputDouble=new Scanner(System.in);
		double m=inputDouble.nextDouble();
		System.out.println(m);
		
		// something funny here.
		Scanner inputString=new Scanner(System.in);
		String str=inputString.next();
		System.out.println(str);
		str=inputString.nextLine();
		System.out.println(str);
		
		// basically, you can input anything from keyboard using Scanner.
	}
}
