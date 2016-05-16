package com.ex1;
abstract class FatherForInner
{
	int count;
	abstract void show();
}
public class s16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FatherForInner ffi=new FatherForInner()
		{
			{
				count=(int)(100*Math.random());
			}
			public void show()
			{
				System.out.println("初始化后count的值为："+count+"。");
			}
		};
		ffi.show();
	}

}
