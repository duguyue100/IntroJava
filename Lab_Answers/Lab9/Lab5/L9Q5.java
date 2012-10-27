// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 5

import java.util.*;
public class L9Q5 {
	public static void main(String[] args) throws EmptyInputException
	{
		Scanner input=new Scanner(System.in);
		String st=input.nextLine();
		if (st.isEmpty()==true)
			throw new EmptyInputException("Empty String");
	}
}
