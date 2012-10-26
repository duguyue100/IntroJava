// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 8 Question 2

import java.util.*;
public class L8Q2 {
	public static void main(String[] args)
	{
		DateTime dt=new DateTime(26,10,2012,11,37,23);
		dt.print();
		dt.addTime(56);
		dt.print();
		dt.addTime(45,2);
		dt.print();
		dt.addTime(45, 3, 1);
		dt.print();
	}
}
