package com.ex1;
//����λ���ĸ���λ��
public class k1 {

	public static void main(String[] args) {
		int m=879;
		//System.out.println("��λ��Ϊ��" + m%10);
		//m=m/10;
		//System.out.println("ʮλ��Ϊ��" + m%10);
		//m=m/10;
		//System.out.println("��λ��Ϊ��" + m%10);
		String str = String.valueOf(m);
		int i = str.length();
		System.out.println("��λ��Ϊ��" +str.charAt(i-1));
		System.out.println("ʮλ��Ϊ��" +str.charAt(i-2));
		System.out.println("��λ��Ϊ��" +str.charAt(i-3));
}
}
