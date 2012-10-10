// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 03
public class IfElseAndLoop {
	public static void main(String[] args)
	{
		// Boolean operators and if...else 
		int a=1;
		int b=2;
		
		
		if (a==2)
		{
			int c=3;
			System.out.println(c);
		}
		else if (b<=2)
		{
			int c=2; // why can I still declare c again? 
			System.out.println(c);
		}
		
		// Loop
		// Basically, they are same.
		System.out.println("-----For Loop-----");
		for (int i=1;i<=10;i++)
		{
			System.out.println("hello world");
		}
		System.out.println("-----While Loop-----");
		int i=1;
		while (i<=10)
		{
			System.out.println("hello world");
			i++;
		}
		System.out.println("-----DoWhile Loop-----");
		i=1;
		do
		{
			System.out.println("hello world");
			i++;
		}while(i<=10);
	}
}
