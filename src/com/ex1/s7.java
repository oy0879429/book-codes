package com.ex1;

public class s7 {
	public static void main(String[] args)
	{
		method1();
	}
	static void method1()
	{
		method2();
	}
	static void method2()
	{
		try{
		int[] a=new int[3];
		a[4]=12;
		System.out.println("OK!!!");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("这里出现的错误类型是：数组下标越界！！");
		}
	}
}
