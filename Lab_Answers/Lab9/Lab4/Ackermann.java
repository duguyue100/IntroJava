// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 9 Question 4

import java.util.*;
public class Ackermann {
	public int Acker(int m, int n)
	{
		if (m==0)
			return n+1;
		else if (n==0)
			return Acker(m-1,1);
		else return Acker(m-1, Acker(m,n-1));
	}
}
