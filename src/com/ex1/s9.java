package com.ex1;

public class s9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		System.out.println("恭喜你，调用方法成功，程序正常工作！！");		
	}
	static void a()
	{
		try
		{
			b();
		}
		catch(RuntimeException re)
		{
			System.out.println("异常在a方法被解决掉！！！");
		}
	}
	static void b()
	{
		c();
	}
	static void c()
	{
		int [] a=new int[3];
		a[4]=12;
	}
}
