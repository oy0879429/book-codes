package com.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class s17 {

	public static void main(String[] args) {
		String b[]=  new String [10];
		String a[]=  new String [10];
		int i = 0;
		int j=0;
		while(true){
			
			System.out.println("�û�ѡ����:��¼(1)ע�ᣨ2��");
			@SuppressWarnings("resource")
			Scanner S = new Scanner(System.in);
			int SS = S.nextInt();
			if(1==SS)
			{
				System.out.println("�����¼���û���������");
				@SuppressWarnings("resource")
				Scanner s3 = new Scanner(System.in);
				String ss3 = s3.next();
				
				@SuppressWarnings("resource")
				Scanner s4 = new Scanner(System.in);
				String ss4 = s4.next();
				for(String m:a)
				{
					for(int n=0;n<b.length;)
					{	
					if(ss3.equals(m)&&ss4.equals(b[n])){
						System.out.println("����ɹ�");
					}else
					{
						System.out.println("��¼ʧ��");
					}break;
					}break;
				}
			}else{
				while(true){
					System.out.println("ע��");
					@SuppressWarnings("resource")
					Scanner s1 = new Scanner(System.in);
					String ss1 = s1.next();
					a[i]=ss1;
					i++;
					/*for(int p=0;p<a.length;p++)
					{
						if(a[i].equals(a[p]))
						System.out.println("ע��ʧ��");
						else{
							System.out.println("ע��ɹ�");
						}
					}break;*/
					@SuppressWarnings("resource")
					Scanner s2 = new Scanner(System.in);
					String ss2 = s2.next();
					b[j]=ss2;
					j++;
					
					System.out.println(Arrays.toString(a));
					System.out.println(Arrays.toString(b));
					break;
					
				}
				
			}
		}

	}

}
