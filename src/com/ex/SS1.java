package com.ex;

public class SS1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		char [] a,b,c;
		String s="2009年10月1日是国庆60周年";
		a=new char[2];
		s.getChars(11,13,a,0);
		System.out.println(a);
		c="十一长假期间，学校都放假了".toCharArray();
		for(char ch:c)
			System.out.print(ch);
	}
}
