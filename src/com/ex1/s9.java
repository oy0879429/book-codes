package com.ex1;

public class s9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		System.out.println("��ϲ�㣬���÷����ɹ�������������������");		
	}
	static void a()
	{
		try
		{
			b();
		}
		catch(RuntimeException re)
		{
			System.out.println("�쳣��a�����������������");
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
