package com.ex1;
//求三位数的各个位数
public class k1 {

	public static void main(String[] args) {
		int m=879;
		//System.out.println("个位数为：" + m%10);
		//m=m/10;
		//System.out.println("十位数为：" + m%10);
		//m=m/10;
		//System.out.println("百位数为：" + m%10);
		String str = String.valueOf(m);
		int i = str.length();
		System.out.println("个位数为：" +str.charAt(i-1));
		System.out.println("十位数为：" +str.charAt(i-2));
		System.out.println("白位数为：" +str.charAt(i-3));
}
}
