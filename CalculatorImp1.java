package com;

public class CalculatorImp1 implements Calculator {
//	we can do class as abstract class using abstract keyword.

	@Override
	public int add(int a,int b)
	{
		return a+b;
	}
	@Override
	public int sub(int a,int b)
	{
		return a-b;
	}
	@Override
	public int mul(int a,int b)
	{
		return a*b;
	}
	@Override
	public int div(int a,int b)
	
	{
		return a/b;
	}
}
