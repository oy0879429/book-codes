package com.ex;
import java.util.*;
public class SortString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a={"melon","apple","pear","banana"};
		String [] b=Arrays.copyOf(a, a.length);
		System.out.println("使用用户编写的SortString类，按字典序排列数组");
		SortString.sort(a);
		System.out.println("排序的结果是：");
		for(String s:b){
			System.out.println("  "+s);
		}
		System.out.println("");
		System.out.println("使用类库中的Arrays类，按字典序排列数组b:");
		Arrays.sort(b);
		System.out.println("排序的结果是：");
		for(String s:b){
			System.out.println("  "+s);
		}
	}

}
