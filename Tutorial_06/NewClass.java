// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Tutorial 01 06
import java.util.*;
public class NewClass {
	public int n;
	public NewClass()
	{
		n=0;
		System.out.println("hello, this is a new class.");
	}
	
	public NewClass(int init_n)
	{
		n=init_n;
	}
	
	public int foo(int m)
	{
		return n+m;
	}
}
