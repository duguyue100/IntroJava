// Author: Hu Yuhuang
// Email: duguyue100@gmail.com
// Lab 7 Question 2

import java.util.*;
public class L7Q2 {
	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount("Hu Yuhuang", "X111111", 1000);
		ba.currentBalance();
		
		ba.Deposit(100);
		ba.currentBalance();
		
		ba.Withdraws(200);
		ba.currentBalance();
		
		BankAccount ba1=new BankAccount();
		ba1.setName("Hu Yuhuang1");
		ba1.setPassport("X111112");
		ba1.setDeposit(200000);
		ba1.currentBalance();
	}
}
