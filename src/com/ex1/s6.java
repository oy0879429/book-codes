package com.ex1;

public class s6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int [] a=new int[4];
			System.out.println("整型数组创建完毕！！");
			a[3]=9;
			System.out.println("整型数组中第四个元素中数值为"+a[3]+"!!");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("这里出现的错误类型是：数组下标越界！！");
		}
		catch(NullPointerException npe)
		{
			System.out.println("这里出现的错误类型是：空引用！！");
		}
		System.out.println("主程序正常结束！！！");
	}

}
