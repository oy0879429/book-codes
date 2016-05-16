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
			System.out.println("��ϲ�㣬�Ͳ㷽��ִ�гɹ�������");
		}
		else
		{
			System.out.println("�Ͳ㷢���¹ʣ��ϱ�������");
			throw new MyExceptionFromLowLevel("ֵ������50�������¹ʣ�����");
		}
	}
	public void doMiddlelevelStaff() throws MyExceptionToHighLevel
	{
		try
		{
			int value=(int)Math.round(Math.random()*100);
			System.out.println("����ֵΪ��"+value+"��");
			this.doLowLevelStaff(value);
		}
		catch(MyExceptionFromLowLevel e)
		{
			System.out.println("�����¹ʣ��в��Ƚ���һЩ����Ȼ�����ϱ����ϲ㣡����");
			throw new MyExceptionToHighLevel("���¹ʷ��������ϲ㴦������");
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
			System.out.println("�ϲ����մ����¹ʣ�����");
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
