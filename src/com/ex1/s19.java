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
			System.out.println("�������ڲ����еķ��������ڲ�"+"��ʵ����˽���ڲ��ӿ�InnerInterface!!!");
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
		System.out.println("��������ͨ���еķ���������ͨ"+"��ʵ����˽���ڲ��ӿ�InnerTnterface!!!");
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
