package com.ex;
import java.util.*;
public class SortString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a={"melon","apple","pear","banana"};
		String [] b=Arrays.copyOf(a, a.length);
		System.out.println("ʹ���û���д��SortString�࣬���ֵ�����������");
		SortString.sort(a);
		System.out.println("����Ľ���ǣ�");
		for(String s:b){
			System.out.println("  "+s);
		}
		System.out.println("");
		System.out.println("ʹ������е�Arrays�࣬���ֵ�����������b:");
		Arrays.sort(b);
		System.out.println("����Ľ���ǣ�");
		for(String s:b){
			System.out.println("  "+s);
		}
	}

}
