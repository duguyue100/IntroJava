// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 2

import java.util.*;
public class BankAccount {
	private String name;
	private String passport;
	private double deposit;
	
	public BankAccount()
	{
		
	}
	public BankAccount(String n, String p, double d)
	{
		name=n;
		passport=p;
		deposit=d;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setPassport(String p)
	{
		passport=p;
	}
	
	public void setDeposit(double d)
	{
		deposit=d;
	}
	
	public void Deposit(double d)
	{
		deposit+=d;
	}
	
	public void Withdraws(double w)
	{
		deposit-=w;
	}
	
	public void currentBalance()
	{
		System.out.println("Current Balance: "+deposit);
	}
}
