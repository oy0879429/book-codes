package com.ex1;

public class s6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int [] a=new int[4];
			System.out.println("�������鴴����ϣ���");
			a[3]=9;
			System.out.println("���������е��ĸ�Ԫ������ֵΪ"+a[3]+"!!");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("������ֵĴ��������ǣ������±�Խ�磡��");
		}
		catch(NullPointerException npe)
		{
			System.out.println("������ֵĴ��������ǣ������ã���");
		}
		System.out.println("��������������������");
	}

}
