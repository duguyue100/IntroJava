// Author: Hu Yuhuang
// Email: duguyue100
// Programming I: 2011 II 3

public class TestIntegerSet {
	public static void main(String[] args)
	{
		IntegerSet s1=new IntegerSet();
		IntegerSet s2=new IntegerSet();
		
		for (int i=0;i<s1.set.length;i++)
		{
			if (Math.round(Math.random())==1)
				s1.set[i]=true;
			else s1.set[i]=false;
		}
		for (int i=0;i<s1.set.length;i++)
		{
			if (Math.round(Math.random())==1)
				s2.set[i]=true;
			else s2.set[i]=false;
		}
		
		s1.setPrint();
		s2.setPrint();
		s1.unionOfIntegerSets(s2).setPrint();
		s1.intersectionOfIntegerSets(s2).setPrint();
	}
}
