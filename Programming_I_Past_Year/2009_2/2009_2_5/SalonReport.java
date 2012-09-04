// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Programming I: 2009 II 5

import java.util.Scanner;
public class SalonReport {
	public static void main(String[] args)
	{
		Service[] services=new Service[6];
		services[0]=new Service("Cut", 8.00, 15);
		services[1]=new Service("Shampoo", 4.00, 10);
		services[2]=new Service("Manicure", 18.00, 30);
		services[3]=new Service("Style", 48.00, 55);
		services[4]=new Service("Permanent", 18.00, 35);
		services[5]=new Service("Trim", 6.00, 5);
		System.out.println("Sort services by \n"+"(S)ervice, (P)rice, or (T)ime");
		Scanner input=new Scanner(System.in);
		String choice=input.next();
		sortService(choice, services);
	}
	
	public static void sortService(String choice, Service[] services)
	{
		switch(choice)
		{
		case "S": {
			System.out.println("Sorted by Service");
			for (int i=0;i<services.length-1;i++)
				for (int j=services.length-1;j>=i+1;j--)
					if (services[j-1].getService().charAt(0)>services[j].getService().charAt(0))
					{
						Service temp=services[j-1];
						services[j-1]=services[j];
						services[j]=temp;
					}
			break;
		}
		case "P": {
			System.out.println("Sorted by Price");
			for (int i=0;i<services.length-1;i++)
				for (int j=services.length-1;j>=i+1;j--)
					if (services[j-1].getPrice()>services[j].getPrice())
					{
						Service temp=services[j-1];
						services[j-1]=services[j];
						services[j]=temp;
					}
			break;
		}
		case "T": {
			System.out.println("Sorted by Time");
			for (int i=0;i<services.length-1;i++)
				for (int j=services.length-1;j>=i+1;j--)
					if (services[j-1].getTime()>services[j].getTime())
					{
						Service temp=services[j-1];
						services[j-1]=services[j];
						services[j]=temp;
					}
			break;
		}
		default: break;
		}
		
		for (int i=0;i<services.length;i++)
		{
			System.out.println(services[i].getService()+"\t$"+services[i].getPrice()
					+"\t"+services[i].getTime()+" minutes");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Process completed");
	}
}
