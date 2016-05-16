package com.ex;
import java.util.Scanner;

public class Pouyi {
String pou(String sourceString ,String password){
	char [] p=password.toCharArray();
	int n=p.length;
	char [] c=sourceString.toCharArray();
	int m=c.length;
	for(int k=0;k<m;k++){
		int mima=c[k]+p[k%n];
		c[k]=(char)mima;		
	}
	return new String(c);
}
String yi(String sourceString,String password){
	char [] p=password.toCharArray();
	int n=p.length;
	char [] c=sourceString.toCharArray();
	int m=c.length;
	for(int k=0;k<m;k++){
		int mima=c[k]-p[k%n];
		c[k]=(char)mima;
	}
	return new String(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceString="今晚十点进攻";
		Pouyi person=new Pouyi();
		System.out.println("输入密码加密"+sourceString);
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String password=scanner.nextLine();
		String secret=person.pou(sourceString, password);
		System.out.println("密文"+secret);
		System.out.println("输入解密密码");
		password =scanner.nextLine();
		String source=person.yi(secret, password);
		System.out.println("明文"+source);
	}
}
