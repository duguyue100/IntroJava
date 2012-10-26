// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 3

import java.util.*;
public class L7Q3 {
	public static void main(String[] args)
	{
		WeightCalculator wc=new WeightCalculator(22, 180);
		wc.print();
		
		WeightCalculator wc1=new WeightCalculator();
		wc.setAge(19);
		wc.setHeight(170);
		wc.print();
	}
}
