package com.ex1;
class OuterClass
{
	public interface InnerInterface
	{
	public void show();
	}
	public class InnerClass implements InnerInterface
	{
		public void show()
		{
			System.out.println("这里是内部类中的方法，该内部"+"类实现了私有内部接口InnerInterface!!!");
		}
	}
	public  InnerInterface getIn()
	{
		return new InnerClass();
	}
}
class Common implements OuterClass.InnerInterface
{
	public void show()
	{
		System.out.println("这里是普通类中的方法，该普通"+"类实现了私有内部接口InnerTnterface!!!");
	}
}
public class s19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
		OuterClass.InnerInterface ic=null;
		ic=oc.getIn();
		ic.show();
		ic=new Common();
		ic.show();
	}

}
