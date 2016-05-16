package com.ex1;
@SuppressWarnings("serial")
class MyExceptionToHighLevel extends Exception
{
	public MyExceptionToHighLevel()
	{  }
	public MyExceptionToHighLevel(String msg)
	{
		super(msg);
	}
}
@SuppressWarnings("serial")
class MyExceptionFromLowLevel extends Exception
{
	public MyExceptionFromLowLevel()
	{  }
	public MyExceptionFromLowLevel(String msg)
	{
		super(msg);
	}
}
class MyClass
{
	public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel
	{
		if(a>50)
		{
			System.out.println("恭喜你，低层方法执行成功！！！");
		}
		else
		{
			System.out.println("低层发生事故，上报！！！");
			throw new MyExceptionFromLowLevel("值不大于50，发生事故！！！");
		}
	}
	public void doMiddlelevelStaff() throws MyExceptionToHighLevel
	{
		try
		{
			int value=(int)Math.round(Math.random()*100);
			System.out.println("调用值为："+value+"。");
			this.doLowLevelStaff(value);
		}
		catch(MyExceptionFromLowLevel e)
		{
			System.out.println("发生事故，中层先进行一些处理，然后又上报到上层！！！");
			throw new MyExceptionToHighLevel("有事故发生，请上层处理！！！");
		}
	}
	public void doHighLevelStaff()
	{
		try
		{
			this.doMiddlelevelStaff();
		}
		catch(MyExceptionToHighLevel e)
		{
			System.out.println("上层最终处理事故！！！");
		}
	}
}
public class s10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc=new MyClass();
		mc.doHighLevelStaff();
	}
}
