package com.ex1;

public class kkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int layer = 7;
		//代表有多少层
		for(int i=1;i<=layer;i++)
		{
			//找出空格规律
			for(int k=1;k<=layer-i;k++)
			{
				System.out.print(" ");
			}
			//打印*号
			//改变*号规律
			for(int j=1;j<=(i-1)*2+1;j++)
			{
				System.out.print("*");
			}
			//打出一个换行
			System.out.println();
		}
	}

}
