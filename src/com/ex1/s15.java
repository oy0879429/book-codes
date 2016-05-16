package com.ex1;
interface MyInterface
{
	public void show();
}
public class s15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyInterface mi=new MyInterface()
	{
		public void show()
		{
			System.out.println("恭喜你创建了匿"+"名类内部类的对象，该类实现了MyInterface接口！！！");
		}
	};
	mi.show();
	}
}
